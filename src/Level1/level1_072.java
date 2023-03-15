package Level1;

import java.util.Arrays;

public class level1_072 {
	//개인정보 수집 유효기간
	public static void main(String[] args) {
		//String[] str01 = {"A 6", "B 12", "C 3"};
		String[] str01 = {"Z 3", "D 5"};
		//String[] str02 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		String[] str02 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
		//System.out.println(solution("2022.05.19", str01, str02));
		//System.out.println(Arrays.toString(solution("2022.05.19", str01, str02)));
		System.out.println(Arrays.toString(solution("2020.01.01", str01, str02)));
	}
	
	public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        int[] trArr = new int[26];
        for(String str :terms) {
        	trArr[str.charAt(0) - 65] = Integer.parseInt(str.substring(2, str.length()));
        }
        String YY = "";
        String MM = "";
        String DD = "";
        String Date = "";
        int mm = 0, cnt = 0;;
        for(int i = 0; i < privacies.length;i++) {
        	DD = privacies[i].substring(8, 10);
        	mm = Integer.valueOf(privacies[i].substring(5, 7)).intValue() + Integer.valueOf(privacies[i].substring(11).replace(String.valueOf(privacies[i].charAt(privacies[i].length() - 1)), String.valueOf(trArr[privacies[i].charAt(privacies[i].length() - 1) - 65]))).intValue();
        	YY = privacies[i].substring(0, 4);
        	
        	for(;mm >= 13;) {
        		mm -= 12;
        		YY = String.valueOf((Integer.parseInt(YY) + 1));
        	}
        	if((mm / 10) < 1) {
        		MM = "0" + mm;
        	} else {
        		MM = String.valueOf(mm);
        	}
        	Date = YY + MM + DD;
        	
        	if(Integer.parseInt(today.replace(".", "")) > Integer.parseInt(Date) - 1) {
        		answer = Arrays.copyOf(answer, answer.length + 1);
        		answer[cnt] = i + 1;
        		cnt++;
        	}
        	
        }
        return answer;
	}
}