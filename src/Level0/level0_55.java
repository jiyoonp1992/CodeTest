package Level0;

import java.util.Arrays;

public class level0_55 {
	//외계행성의 나이
	public static void main(String[] args) {
		System.out.println(solution(23));
		System.out.println(solution(51));
		System.out.println(solution(100));
	}
	
	public static String solution(int age) {
        String answer = "";
		boolean check = false;
		check = age <= 1000;
		if(check) {
			answer = Integer.toString(age).replaceAll("0", "a").replaceAll("1", "b").replaceAll("2", "c").replaceAll("3", "d").replaceAll("4", "e").replaceAll("5", "f").replaceAll("6", "g").replaceAll("7", "h").replaceAll("8", "i").replaceAll("9", "j");
		}
        return answer;
	}
}