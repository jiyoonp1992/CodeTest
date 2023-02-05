package Level0;

import java.util.Arrays;

public class level0_91 {
	//다항식 더하기
	public static void main(String[] args) {
		//System.out.println(solution("3x + 7 + x"));
		//System.out.println(solution("3x + 7 + x"));
		//System.out.println(solution("x + x + x"));
		//System.out.println(solution("x"));
		//System.out.println(solution("0x"));
		//System.out.println(solution("7"));
		System.out.println(solution("10x + x"));
		//solution("10x + x");
	}
	
	public static String solution(String polynomial) {
        String answer = "";
		boolean check = false;
		check = 0 < polynomial.length() && polynomial.length() < 50;
		if(check) {
			int x_val = 0, y_val= 0;
			polynomial = polynomial.replace(" ", "")+"+";
			String str = "";
			for(int i = 0; i <= polynomial.length();) {
				if(polynomial.contains("+")) {
					str = polynomial.substring(0, polynomial.indexOf("+"));
					if(str.contains("x")) {
						if(str.equals("x")) {
							x_val += 1;
						} else {
							str = str.replace("x","");
							System.out.println(str);
							x_val += Integer.parseInt(str);
						}
					} else {
						y_val += Integer.parseInt(str);
					}
					System.out.println(x_val);
					polynomial = polynomial.substring(polynomial.indexOf("+") + 1);
				} else {
					i++;
				}
			}
			
			if(x_val != 0 && y_val != 0) {
				answer = x_val + "x + " + y_val;
			} else if (x_val != 0 && y_val == 0) {
				answer = x_val + "x" ; 
			} else {
				answer = y_val + ""; 
			}
			answer = (x_val == 1)?answer.replace("1x", "x"): answer;
		}
        return answer;
	}
}