package Level0;

import java.util.Arrays;

public class level0_80 {
	//외계어 사전
	public static void main(String[] args) {
		String[] str01 = {"p", "o", "s"};
		String[] str02 = {"z", "d", "x"};
		String[] str03 = {"s", "o", "m", "d"};
		String[] dic01 = {"sod", "eocd", "qixm", "adio", "soo"};
		String[] dic02 = {"def", "dww", "dzx", "loveaw"};
		String[] dic03 = {"moos", "dzx", "smm", "sunmmo", "som"};
		System.out.println(solution(str01, dic01));
		System.out.println(solution(str02, dic02));
		System.out.println(solution(str03, dic03));
	}
	
	public static int solution(String[] spell, String[] dic) {
        int answer = 0;
		boolean check = false;
		check = 2 <= spell.length && spell.length <= 10 && 1 <= dic.length && dic.length <= 10;
		if(check) {
			int chk = 0;
			for(String str01: dic) {
				chk = 0;
				for(String str02: spell) {
					chk = str01.contains(str02)?++chk:chk;
				}
				if(chk == spell.length) {
					answer = 1;
					break;
				} else {
					answer = 2;
				}
			}
		}
        return answer;
	}
}