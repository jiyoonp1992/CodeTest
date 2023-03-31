package Level2;

import java.util.ArrayList;
import java.util.Arrays;

public class level2_027 {
	//[1차] 뉴스 클러스터링
	public static void main(String[] args) {
		String str01 = "FRANCE";
		String str02 = "french";
		System.out.println(solution(str01, str02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int cnt = 0;
        ArrayList<String> list = new ArrayList<String>();
        for(;str1.length() > 1;) {
        	if(list.contains(str1.substring(0,2))){
        		cnt++;
        	} else {
        		list.add(str1.substring(0,2));
        	}
        	str1 = str1.substring(1,str1.length());
        }
        
        for(;str2.length() > 1;) {
        	if(list.contains(str2.substring(0,2))){
        		cnt++;
        	} else {
        		list.add(str2.substring(0,2));
        	}
        	str2 = str2.substring(1,str2.length());
        }
        answer = (cnt * 65536) / list.size();
        return answer;
	}
}