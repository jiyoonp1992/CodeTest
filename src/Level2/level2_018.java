package Level2;

import java.util.Arrays;

public class level2_018 {
	//괄호 회전하기
	public static void main(String[] args) {
		System.out.println(solution("}]()[{"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);
        String str = "";
        for(int i = 0; i < sb.length(); i++) {
        	if(i != 0) {
        		sb.append(sb.charAt(0));
        		sb.deleteCharAt(0);
        	}
        	str = sb.toString();
        	for(int j = 0;j < 1;) {
        		if(str.contains("{}")||str.contains("[]")||str.contains("()")) {
        			str = str.replaceAll("\\[\\]", "").replaceAll("\\(\\)", "").replaceAll("\\{\\}", "");
        		} else {
        			j = 1;
        		}
        	}
        	
        	if(str.isEmpty()) {
        		answer++;
        	}
        }
        return answer;
	}
}