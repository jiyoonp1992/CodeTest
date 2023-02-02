package Level0;

import java.util.Arrays;

public class level0_84 {
	//
	public static void main(String[] args) {
		String[] id01 = {"meosseugi", "1234"};
		String[] id02 = {"programmer01", "15789"};
		String[] id03 = {"rabbit04", "98761"};
		String[][] db01 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		String[][] db02 = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
		String[][] db03 = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
		System.out.println(solution(id01, db01));
		System.out.println(solution(id02, db02));
		System.out.println(solution(id03, db03));
	}
	
	public static String solution(String[] id_pw, String[][] db) {
        String answer = "";
		boolean check = false;
		check = id_pw.length == 2 && 1 <= db.length && db.length <= 10 && 1 <= id_pw[0].length() && id_pw[0].length() <= 15 && 1 <= id_pw[1].length() && id_pw[1].length() <= 6;;
		if(check) {
			for(String[] str:db) {
				if(id_pw[0].equals(str[0])) {
					if(id_pw[1].equals(str[1])) {
						answer = "login";
						break;
					}
					answer = "wrong pw";
					break;
				} else {
					answer = "fail";
				}
			}
		}
        return answer;
	}
}