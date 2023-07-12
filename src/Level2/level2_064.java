package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class level2_064 {
	//무인도 여행
	public static void main(String[] args) {
		String[] str = {"X591X","X1X5X","X231X", "1XXX1"};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(str)));
	}
	
	public static int[] solution(String[] maps) {
        int[] answer = {};
        char[][] charArr = new char[maps.length][maps[0].length()];
        boolean[][] booArr = new boolean[maps.length][maps[0].length()];
        List<Integer> sumList = new ArrayList<>();
        
        for(int i = 0; i < maps.length; i++) {
        	charArr[i] = maps[i].toCharArray();
        }
        
        for (int j = 0; j < charArr.length; j++) {
            for (int k = 0; k < charArr[j].length; k++) {
            	int sum = dsrtIslnd(charArr, booArr, j, k);
                if (sum > 0) {
                	sumList.add(sum);
                }
            }
        }
        
        sumList.sort((a, b) -> a - b);
        if(sumList.isEmpty()) {
        	answer = new int[] {-1};
        } else {
        	answer = sumList.stream().mapToInt(i -> i).toArray();
        }
        
        return answer;
	}
	
	static int dsrtIslnd(char[][] charArr, boolean[][] visit, int x, int y) {
		
		if(x < 0 || y < 0 || x >= charArr.length || y >= charArr[x].length) {
			return 0;
		}
		
		if(visit[x][y] || charArr[x][y] == 'X') {
			return 0;
		}
		
		visit[x][y] = true;
		
		int sum = charArr[x][y] - '0';
		
		sum += dsrtIslnd(charArr, visit, x + 1, y);
		sum += dsrtIslnd(charArr, visit, x - 1, y);
		sum += dsrtIslnd(charArr, visit, x, y + 1);
		sum += dsrtIslnd(charArr, visit, x, y - 1);
        
		return sum;
	}
}