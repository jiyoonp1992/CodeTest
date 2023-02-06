package Level0;

import java.util.Arrays;

public class level0_93 {
	//OX퀴즈
	public static void main(String[] args) {
		String[] str01 = {"3 - 4 = -3", "5 + 6 = 11"};
		//String[] str02 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		String[] str02 = {"5 + 66 = 71"};
		//System.out.println(Arrays.toString(solution(str01)));
		System.out.println(Arrays.toString(solution(str02)));
	}
	
	public static String[] solution(String[] quiz) {
        String[] answer = {};
		boolean check = false;
		check = 1 <= quiz.length && quiz.length <= 10;
		if(check) {
			int x = 0, y = 0, z = 0, idx = 0, cnt = 0;
			answer = new String[quiz.length];
			for(String str : quiz) {
				for(int i = 0; i <= str.length();) {
					if(str.contains(" ")) {
						idx = str.indexOf(" ");
						if(isNum(str.substring(0, idx))) {
							x = Integer.parseInt(str.substring(0, idx));
						} else if (str.substring(0, idx).equals("+")) {
							str = str.substring(str.indexOf(" ")).trim();
							y = Integer.parseInt(str.substring(0, str.indexOf(" ")));
							x =  x + y;
							y = 0;
						} else if (str.substring(0, idx).equals("-")) {
							str = str.substring(str.indexOf(" ")).trim();
							y = Integer.parseInt(str.substring(0, str.indexOf(" ")));
							x = x - y;
							y = 0;
						} else if (str.substring(0, idx).equals("=")) {
							z = Integer.parseInt(str.substring(idx + 1, str.length()));
						}
						str = str.substring(str.indexOf(" ")).trim();
					} else {
						i++;
					}
				}
				
				if(x == z) {
					answer[cnt] = "O"; 
				} else {
					answer[cnt] = "X"; 
				}
				cnt++;
			}
		}
        return answer;
	}
	
	public static Boolean isNum(String numChek) {
		boolean check = false;
		try {
			Integer.parseInt(numChek);
			check = true;
		} catch (Exception e) {
			// TODO: handle exception
			check = false;
		}
		return check;
	}
}