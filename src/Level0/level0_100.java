package Level0;

import java.util.Arrays;

public class level0_100 {
	//옹알이 (1)
	public static void main(String[] args) {
		String[] str01 = {"aya", "yee", "u", "maa", "wyeoo"};
		String[] str02 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		System.out.println(solution(str01));
		System.out.println(solution(str02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String[] babbling) {
        int answer = 0;
		boolean check = false;
		check = 1 <= babbling.length && babbling.length <= 100;
		if(check) {
			String[] stdStr = {"aya", "ye", "woo", "ma"};
			for(int i = 0; i < babbling.length; i++) {
				for (int j = 0; j < stdStr.length;j++) {
					babbling[i] = babbling[i].replace(stdStr[j], " ");
				}
				if(babbling[i].isBlank()) {
					answer++;
				}
			}
		}
        return answer;
	}
}