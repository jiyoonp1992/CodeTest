package Level1;

import java.util.Arrays;

public class level1_069 {
	//햄버거 만들기
	public static void main(String[] args) {
		int[] num = {1,2};
		System.out.println(solution(num));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] ingredient) {
        int answer = 0;
		boolean check = 1 <= ingredient.length && ingredient.length <= 1000000;
		if(check) {
			StringBuilder sb = new StringBuilder();
			for(int i : ingredient) {
				sb.append(i);
				if(sb.length() > 3 && sb.substring(sb.length()-4, sb.length()).equals("1231")) {
					sb.delete(sb.length()-4, sb.length());
					answer++;
				}
			}
		}
        return answer;
	}
}