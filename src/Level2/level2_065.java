package Level2;

import java.util.Arrays;

public class level2_065 {
	//[3차] 방금그곡
	public static void main(String[] args) {
		String[] strArr = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
		String str = "CC#BCC#BCC#BCC#B";
		System.out.println(solution(str,strArr));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String m, String[] musicinfos) {
        String answer = "";
        String[] strArr = {};
        StringBuilder sb = new StringBuilder();
        String str = "";
        int minute = 0, max = 0;
        for(int i = 0; i < musicinfos.length; i++) {
        	strArr = musicinfos[i].split(",");
        	minute = Integer.parseInt(strArr[1].replace(":", "")) - Integer.parseInt(strArr[0].replace(":", ""));
        	
        	sb.append(strArr[3]);
        	while(minute > sb.length()) {
        		sb.append(strArr[3]);
        	}
        	
        	if(sb.length() > minute) {
        		sb.substring(0, minute);
        	}
        	str = sb.toString();
        	
        	str = str.toLowerCase().replace("a#", "A").replace("c#", "C").replace("d#", "D").replace("f#", "F").replace("g#", "G");
        	m = m.toLowerCase().replace("a#", "A").replace("c#", "C").replace("d#", "D").replace("f#", "F").replace("g#", "G");
        	
        	if(str.contains(m) && minute >= max) {
        		answer = strArr[2];
        		max = minute;
        	} else if(answer.equals("(None)") || answer.equals("")) {
        		answer = "(None)";
        	}
        	sb.delete(0, sb.length());
        	
        }
        return answer;
	}
}