package Level0;

import java.util.Arrays;

public class level0_44 {
	//가위 바위 보
	public static void main(String[] args) {
		System.out.println(solution("2"));
		System.out.println(solution("205"));
	}
	
	public static String solution(String rsp) {
        String answer = "";
		boolean check = false;
		check = 0 < rsp.length() && rsp.length() <= 100;
		if(check) {
			for(int i = 0; i < rsp.length(); i++) {
				if(rsp.charAt(i) == '2') {
					answer += "0";
				} else if(String.valueOf(rsp.charAt(i)).equals("0")) {
					answer += "5";
				} else {
					answer += "2";
				}
			}
		}
        return answer;
	}
}