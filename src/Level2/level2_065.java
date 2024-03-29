package Level2;

import java.util.Arrays;

public class level2_065 {
	//[3차] 방금그곡
	public static void main(String[] args) {
		String[] strArr = {"06:20,06:50,TEST,DD#F"};
		String str = "DF";
		System.out.println(solution(str,strArr));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String m, String[] musicinfos) {
        String answer = "";
        String[] strArr = {};
        StringBuilder sb = new StringBuilder();
        String str = "";
        int minute = 0, max = 0;
        int bfHH = 0, bfMM = 0, afHH = 0, afMM = 0;
        for(int i = 0; i < musicinfos.length; i++) {
        	strArr = musicinfos[i].split(",");
        	afHH = Integer.parseInt(strArr[0].substring(0,2));
        	afMM = Integer.parseInt(strArr[0].substring(3,5));
        	bfHH = Integer.parseInt(strArr[1].substring(0,2));
        	bfMM = Integer.parseInt(strArr[1].substring(3,5));
        	if(((afHH * 60) + afMM) > ((bfHH * 60) + bfMM)) {
        		bfHH = 24;
        	}
        	
        	minute = ((bfHH * 60) + bfMM) - ((afHH * 60) + afMM);
        	
        	while(strArr[3].contains("#")) {
        		int idx = strArr[3].indexOf("#");
        		String reStr = strArr[3].substring(idx-1, idx);
        		strArr[3] = strArr[3].replace(reStr + "#", reStr.toLowerCase());
        	}
        	
        	while(m.contains("#")) {
        		int idx = m.indexOf("#");
        		String reStr = m.substring(idx-1, idx);
        		m = m.replace(reStr + "#", reStr.toLowerCase());
        	}
        	
        	sb.append(strArr[3]);
        	while(minute > sb.length()) {
        		sb.append(strArr[3]);
        	}
        	
        	str = sb.toString();
        	if(str.length() > minute) {
        		str = str.substring(0, minute);
        	}
        	
        	if(str.length() >= m.length()) {
        		if(str.contains(m) && minute > max) {
            		answer = strArr[2];
            		max = minute;
            	}
        	} else {
        		if(m.contains(str) && minute > max) {
            		answer = strArr[2];
            		max = minute;
            	}
        	}
        	
        	if(answer.equals("(None)") || answer.isEmpty()) {
        		answer = "(None)";
        	}
        	
        	sb.delete(0, sb.length());
        	
        }
        return answer;
	}
}