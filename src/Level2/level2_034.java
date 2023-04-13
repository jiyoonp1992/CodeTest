package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level2_034 {
	//[3차] 압축
	public static void main(String[] args) {
		//System.out.println(solution("KAKAO"));
		System.out.println(Arrays.toString(solution("KAKAO")));
	}
	
	public static int[] solution(String msg) {
        int[] answer = {};
        List<String> list = new ArrayList<>();
        int cnt = 0;
        String str = "";
        for(int i = 0; i <= 25; i++) {
        	list.add(String.valueOf(((char)(65+i))));
        }
        
        for(int i = 0; i < msg.length(); i++) {
        	str += String.valueOf(msg.charAt(i));
        	if(list.contains(str)) {
        		if(i < msg.length() - 1 && list.contains(str + msg.charAt(i + 1))) {
        			continue;
        		}
        		answer = Arrays.copyOf(answer, answer.length + 1);
        		answer[cnt] = list.indexOf(str) + 1;
        		cnt++;
        	} else {
        		list.add(str);
        		i--;
        		str = "";
        	}
        }
        return answer;
	}
}