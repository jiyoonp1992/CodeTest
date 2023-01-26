package Level0;

import java.util.Arrays;

public class level0_74 {
	//영어가 싫어요
	public static void main(String[] args) {
		System.out.println(solution("onetwothreefourfivesixseveneightnine"));
		System.out.println(solution("onefourzerosixseven"));
	}
	
	public static long solution(String numbers) {
        long answer = 0;
		boolean check = false;
		check = 1 <= numbers.length() && numbers.length() <= 50;
		if(check) {
			numbers = numbers.replace("zero", "0").replace("one", "1").replace("two", "2").replace("three", "3").replace("four", "4").replace("five", "5").replace("six", "6").replace("seven", "7").replace("eight", "8").replace("nine", "9");
			answer = Long.parseLong(numbers);
		}
        return answer;
	}
}