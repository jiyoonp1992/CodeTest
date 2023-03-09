package Level1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class level1_061 {
	//완주하지 못한 선수
	public static void main(String[] args) {
		String[] str01 = {"leo", "kiki", "eden"};
		String[] str02 = {"eden", "kiki"};
		System.out.println(solution(str01, str02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
		boolean check = 1 <= participant.length && participant.length <= 100000 && completion.length + 1 == participant.length;
		if(check) {
			//Stream<String> strArr = Arrays.stream(participant);
			for(String str : completion) {
				answer = Arrays.stream(participant).filter(i -> !i.equals(str)).collect(Collectors.joining());
				//answer = Arrays.stream(participant).filter(i -> i.equals(str)).toString();
				//answer = String.valueOf(Arrays.stream(participant).filter(i -> !i.equals(str)));
			}
		}
        return answer;
	}
}