package Level0;

import java.util.Arrays;

public class level0_60 {
	//모스부호-(1)
	public static void main(String[] args) {
		System.out.println(solution(".... . .-.. .-.. ---"));
		System.out.println(solution(".--. -.-- - .... --- -."));
		//System.out.println(solution(".- -... -.-. -.. . ..-."));
		//System.out.println(solution("--. .... .. .--- -.- .-.."));
		//System.out.println(solution("-- -. --- .--. --.- .-."));
		//System.out.println(solution("... - ..- ...- .-- -..-"));
		//System.out.println(solution("-.-- --.."));
	}
	
	public static String solution(String letter) {
        String answer = "";
        String str = "";
        String[] chekStr = {".-","-...","-.-.","-..",".","..-.",
        	    "--.","....","..",".---","-.-",".-..",
        	    "--","-.","---",".--.","--.-",".-.",
        	    "...","-","..-","...-",".--","-..-",
        	    "-.--","--.."};
        String[] reStr = {"a","b","c","d","e","f",
        				  "g","h","i","j","k","l",
        				  "m","n","o","p","q","r","s","t","u",
        					"v","w","x","y","z"};
        int cnt = 0;
		boolean check = false;
		check = 1 <= letter.length() && letter.length() <= 1000;
		if(check) {
			letter += " ";
			for(int i = 1; i <= letter.length();) {
				cnt = letter.indexOf(' ');
				str = letter.substring(0, cnt+1);
				letter = letter.substring(cnt+1, letter.length());
				for(int j = 0; j < chekStr.length; j++) {
					if(chekStr[j].equals(str.trim())) {
						answer += reStr[j];
					}
				}
			}
		}
        return answer;
	}
}