package Level1;

import java.util.Arrays;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class level1_045 {
	//2016년
	public static void main(String[] args) {
		System.out.println(solution(5,26));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);
        answer = String.valueOf(date.getDayOfWeek()).substring(0,3);
        return answer;
	}
}