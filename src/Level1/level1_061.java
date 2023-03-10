package Level1;

import java.util.Arrays;

public class level1_061 {
	//완주하지 못한 선수
	public static void main(String[] args) {
		String[] str01 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] str02 = {"josipa", "filipa", "marina", "nikola"};
		System.out.println(solution(str01, str02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
		boolean check = 1 <= participant.length && participant.length <= 100000 && completion.length + 1 == participant.length;
		if(check) {
			if(completion.length == 0) {
				answer = participant[0];
			} else {
				Arrays.sort(participant);
				Arrays.sort(completion);
				
				for(int i = 0; i < completion.length; i++) {
					if(!participant[i].equals(completion[i])){
						answer = participant[i];
						break;
					}
				}
				if(answer.isEmpty()) {
					answer = participant[participant.length - 1];
				}
			}
		}
        return answer;
	}
}