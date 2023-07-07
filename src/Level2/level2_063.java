package Level2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class level2_063 {
	//메뉴 리뉴얼
	public static void main(String[] args) {
		String[] str = {"ABCFG", "ABCFG"};
		int[] in = {2}; 
		System.out.println(solution(str, in));
		//System.out.println(Arrays.toString(solution()));
	}
	
	static char[] chArr = {};
	public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        boolean[] check = {};
        Map<String, Integer> mapOr = new LinkedHashMap<>();
        
        for (int i = 0; i < orders.length; i++) {
        	chArr = orders[i].toCharArray();
        	for(int j = 0; j < course.length; j++) {
        		check = new boolean[chArr.length];
        		combination(chArr, check, 0, chArr.length, course[j]);
        	}
        }
        
        return answer;
	}
	
    // 백트래킹 사용
    // 사용 예시 : combination(arr, visited, 0, n, r)
    static void combination(char[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            System.out.println(arr[i]);
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
}