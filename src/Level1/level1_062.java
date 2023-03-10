package Level1;

import java.util.Arrays;

public class level1_062 {
	//옹알이 (2)
	public static void main(String[] args) {
		String[] str = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		System.out.println(solution(str));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String[] babbling) {
        int answer = 0;
		boolean check = 1 <= babbling.length && babbling.length <= 100;
		if(check) {
			for(String str : babbling) {
				str = str.replaceAll("aya", "1").replaceAll("ye", "2").replaceAll("woo", "3").replaceAll("ma", "4");
				if(!str.contains("11") && !str.contains("22") && !str.contains("33") && !str.contains("44")) {
					try {
						Integer.parseInt(str);
						answer++;
					} catch (Exception e) {
						answer += 0;
						// TODO: handle exception
					}
				}
			}
		}
        return answer;
	}
}