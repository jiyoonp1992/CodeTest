package Level1;

import java.util.Arrays;

public class level1_072 {
	//개인정보 수집 유효기간
	public static void main(String[] args) {
		String[] str01 = {"A 6", "B 12", "C 3"};
		String[] str02 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		System.out.println(solution("2022.05.19", str01, str02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        int[] trArr = new int[26];
        for(String str :terms) {
        	trArr[str.charAt(0) - 65] = Integer.parseInt(str.substring(2, str.length()));
        }
        for(int i = 0; i < privacies.length;i++) {
        	//privacies[i].replace(privacies[i].charAt(privacies[i].length() - 1), trArr[privacies[i].charAt(privacies[i].length() - 1) - 65]);
        	privacies[i] = privacies[i].replace(String.valueOf(privacies[i].charAt(privacies[i].length() - 1)), String.valueOf(trArr[privacies[i].charAt(privacies[i].length() - 1) - 65]));
        	
        	privacies[i] = privacies[i].substring(0, 4) + privacies[i].substring(5, 6) + privacies[i].substring(beginIndex, endIndex);
        }
        System.out.println(Arrays.toString(trArr));
        System.out.println(Arrays.toString(privacies));
        return answer;
	}
}