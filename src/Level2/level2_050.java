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
        String str = "";
        String strNext = "";
        answer = new long[numbers.length];
        int x = 500;
        int y = 505;
        str = Integer.toBinaryString(x);
        strNext = Integer.toBinaryString(y);
        System.out.println(str);
        System.out.println(strNext);
        System.out.println(str.(strNext));
        
//        for(int i = 0; i < numbers.length; i++) {
//        	str = Integer.toBinaryString((int) numbers[i]);
//        	x = (int) numbers[i];
//        	for(int j = x + 1; j < 500 ;j++) {
//        		strNext = Integer.toBinaryString(j);
//        		System.out.println(x);
//        		System.out.println(strNext);
//        		System.out.println("==================================");
//				/*
//				 * if(str.compareTo(strNext) <= 3) { answer[i] = x; }
//				 */
//        	}
//        }
        return answer;
	}
}