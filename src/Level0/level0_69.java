package Level0;

import java.util.Arrays;

public class level0_69 {
	//이진수 더하기
	public static void main(String[] args) {
		System.out.println(solution("10","11"));
		System.out.println(solution("1001","1111"));
	}
	
	//public static String solution(String bin1, String bin2) {
	public static String solution(String bin1, String bin2) {
        String answer = "";
		boolean check = false;
		check = 1 <= bin1.length() && bin2.length() <= 10;
		if(check) {
			int sum = Integer.parseUnsignedInt(bin1,2) + Integer.parseUnsignedInt(bin2,2);
			answer = Integer.toBinaryString(sum);
		}
        return answer;
	}
}