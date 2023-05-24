package Level2;

import java.util.Arrays;

public class level2_050 {
	//2개 이하로 다른 비트
	public static void main(String[] args) {
		long[] lArr = {2,7};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(lArr)));
	}
	
	public static long[] solution(long[] numbers) {
        long[] answer = {};
        answer = new long [numbers.length];
        StringBuilder sb = new StringBuilder();
        long x = 0;
        for(int i = 0; i < numbers.length; i++) {
        	sb.insert(0, (Long.toBinaryString(numbers[i])));
        	x = sb.lastIndexOf("0");
        	if(x < 0) {
        		sb.replace(0, 1, "10");
        	} else if(x == sb.length() - 1) {
        		sb.setCharAt((int) x, '1');
        	} else {
        		sb.setCharAt((int) x + 1, '0');
        		sb.setCharAt((int) x, '1');
        	}
        	answer[i] = Long.parseLong(sb.toString(), 2);
        	sb.delete(0, sb.length());
        }
        return answer;
        
        
//        long[] answer = {};
//        String str = "";
//        String strNext = "";
//        answer = new long[numbers.length];
//        long lNum = 0;
//        int cnt = 0,x = 0, y = 0;;
//        
//        for(int i = 0; i < numbers.length; i++) {
//        	str = Long.toBinaryString(numbers[i]);
//        	lNum = numbers[i] + 1;
//        	for(;; lNum++) {
//        		x = str.length() - 1;
//        		cnt = 0;
//        		strNext = Long.toBinaryString(lNum);
//        		y = strNext.length() - 1;
//        		while(x >= 0 && cnt < 3) {
//        			if(str.charAt(x) != strNext.charAt(y)) {
//        				cnt++;
//        			}
//        			x--;
//        			y--;
//        		}
//        		if(x == -1) {
//        			cnt = cnt + y + 1;
//        		}
//        		if(cnt > 0 && cnt <= 2) {
//        			answer[i] = lNum;
//        			break;
//        		}
//        	}
//        }
//        return answer;
	}
}