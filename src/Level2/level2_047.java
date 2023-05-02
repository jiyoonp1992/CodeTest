package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level2_047 {
	//[1차] 프렌즈4블록
	public static void main(String[] args) {
		String[] str = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
		System.out.println(solution(6,6,str));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int m, int n, String[] board) {
        int answer = 0;
        List<String> list = new ArrayList<String>();
        int x = 0, y = 0;
        //for(int k = 0; k < 1;) {
        	for(int i = 0; i < m - 1; i++) {
        		for(int j = 0; j < n - 1; j++) {
        			if(board[i].charAt(j) == board[i].charAt(j + 1) && board[i].charAt(j) == board[i + 1].charAt(j) && board[i].charAt(j) == board[i + 1].charAt(j + 1)) {
        				list.add(i + "/" + j);
        				answer += 4;
        			}
        			System.out.println(board[i].charAt(j));
        			System.out.println(answer);
        			System.out.println(list);
        		}
        	}
        	for(int o = 0; o < list.size(); o++) {
        		x = Integer.valueOf(list.get(o).substring(0,1)).intValue();
        		y = Integer.valueOf(list.get(o).substring(2,3)).intValue();
        		board[i].charAt(index)
        	}
        	System.out.println(x);
        	System.out.println(y);
        //}
        
        return answer;
	}
}