package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_016 {
	//서울에서 김서방 찾기
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String[] seoul) {
		String answer = "";
		boolean check = 1 <= seoul.length && seoul.length <= 1000;
		if(check) {
			int cnt = 0;
			for(String str:seoul) {
				if("Kim".equals(str)) {
					answer = "김서방은 " + cnt + "에 있다";
                    break;
				}
				cnt++;
			}
		}
        return answer;
	}
}