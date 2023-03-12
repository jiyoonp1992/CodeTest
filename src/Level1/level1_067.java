package Level1;

import java.util.Arrays;

public class level1_067 {
	//신규 아이디 추천
	public static void main(String[] args) {
		System.out.println(solution("a.$.a"));
		//System.out.println(Arrays.toString(solution()));
//		1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
//		2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//		3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
//		4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
//		5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
//		6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//		     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
//		7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	}
	
	public static String solution(String new_id) {
        String answer = "";
        	new_id = new_id.toLowerCase();
        	new_id = new_id.replaceAll("~", "")
        	.replaceAll("!", "")
        	.replaceAll("@", "")
        	.replaceAll("#", "")
        	.replaceAll("\\$", "")
        	.replaceAll("%", "")
        	.replaceAll("\\^", "")
        	.replaceAll("&", "")
        	.replaceAll("\\*", "")
        	.replaceAll("\\(", "")
        	.replaceAll("\\)", "")
        	.replaceAll("=", "")
        	.replaceAll("\\+", "")
        	.replaceAll("\\[", "")
        	.replaceAll("\\{", "")
        	.replaceAll("\\]", "")
        	.replaceAll("\\}", "")
        	.replaceAll(":", "")
        	.replaceAll("\\?", "")
        	.replaceAll(",", "")
        	.replaceAll("<", "")
        	.replaceAll(">", "")
        	.replaceAll("/", "");
        	
        	for(int i = 0; i <= new_id.length() / 2; i++) {
        		if(new_id.contains("..")) {
        			new_id = new_id.replace("..", ".");
        			i--;
        		}
        	};
        	StringBuffer sb = new StringBuffer(new String (new_id));
        	if(sb.charAt(0) == '.') {
        		sb.replace(0, 1, "");
        	};
        	
        	
        	if(sb.length() == 0) {
        		sb.append("aaa");
        	};
        	
        	if(sb.length() > 15) {
        		sb.delete(15, sb.length());
        	};
        	
        	if(sb.charAt(sb.length() - 1) == '.') {
        		sb.replace(sb.length() - 1, sb.length(), "");
        	};
        	
        	for(int j = sb.length(); j < 3; j++) {
        		sb.append(sb.charAt(sb.length() - 1));
        	}
        	
        	answer = sb.toString();
        return answer;
	}
}