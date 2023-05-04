package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level2_047 {
	//[1차] 프렌즈4블록
	public static void main(String[] args) {
		//String[] str = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
		String[] str = {"AA", "AA", "CC", "AA", "AA", "DD"};
		//System.out.println(solution(5,5,str));
		System.out.println(solution(6,2,str));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int m, int n, String[] board) {
//        int answer = 0;
//        List<String> list = new ArrayList<String>();
//        int x = 0, y = 0;
//        //for(int k = 0; k < 1;) {
//        	for(int i = 0; i < m - 1; i++) {
//        		for(int j = 0; j < n - 1; j++) {
//        			if(board[i].charAt(j) == board[i].charAt(j + 1) && board[i].charAt(j) == board[i + 1].charAt(j) && board[i].charAt(j) == board[i + 1].charAt(j + 1)) {
//        				list.add(i + "/" + j);
//        				answer += 4;
//        			}
//        			System.out.println(board[i].charAt(j));
//        			System.out.println(answer);
//        			System.out.println(list);
//        		}
//        	}
//        	for(int o = 0; o < list.size(); o++) {
//        		x = Integer.valueOf(list.get(o).substring(0,1)).intValue();
//        		y = Integer.valueOf(list.get(o).substring(2,3)).intValue();
//        		board[i].charAt(index)
//        	}
//        	System.out.println(x);
//        	System.out.println(y);
//        //}
//        
//        return answer;
		
        int answer = 0;
        List<String> list = new ArrayList<String>();
        int x = 0, y = 0;
        for(int z = 0; z < 1;) {
        	for(int i = 0; i < m - 1; i++) {
        		for(int j = 0; j < n - 1; j++) {
        			if(board[i].charAt(j) != ' ' && board[i].charAt(j) == board[i].charAt(j + 1) && board[i].charAt(j) == board[i + 1].charAt(j) && board[i].charAt(j) == board[i + 1].charAt(j + 1)) {
        				if(!list.contains(i + "/" + j)) {
        					list.add(i + "/" + j);
        					answer++;
        				}
        				if(!list.contains((i + 1) + "/" + j)) {
        					list.add((i + 1) + "/" + j);
        					answer++;
        				}
        				if(!list.contains(i + "/" + (j + 1))) {
        					list.add(i + "/" + (j + 1));
        					answer++;
        				}
        				if(!list.contains((i + 1) + "/" + (j + 1))) {
        					list.add((i + 1) + "/" + (j + 1));
        					answer++;
        				}
        			} else {
        				z = 1;
        			}
        		}
        	}
        	char[] charArr = {};
        	char[] charTempArr = {};
        	char temp = ' ';
        	for(int o = 0; o < list.size(); o++) {
        		x = Integer.valueOf(list.get(o).substring(0,1)).intValue();
        		y = Integer.valueOf(list.get(o).substring(2,3)).intValue();
        		for(;x > 0;x--) {
        			if(x != 0) {
        				charTempArr = board[x-1].toCharArray();
        				charArr = board[x].toCharArray();
        				temp = charTempArr[y];
        				charTempArr[y] = ' ';
        				charArr[y] = temp;
        				board[x-1] = new String(charTempArr);
        				board[x] = new String(charArr);
        			} else {
        				charTempArr = board[x].toCharArray();
        				charTempArr[y] = ' ';
        				board[x] = new String(charTempArr);
        			}
        		}
        		z = 0;
        	}
        	list.clear();
        }
        return answer;
	}
}