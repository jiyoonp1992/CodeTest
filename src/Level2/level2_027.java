package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class level2_027 {
	//[1차] 뉴스 클러스터링
	public static void main(String[] args) {
		String str01 = "A+C";
		String str02 = "DEF";
		System.out.println(solution(str01, str02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.replaceAll("[^a-zA-Z]", "1").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "1").toLowerCase();
        int cnt = 0, le = 0;
        ArrayList<String> list01 = new ArrayList<String>();
        ArrayList<String> list02 = new ArrayList<String>();
        for(;str1.length() > 1;) {
        	list01.add(str1.substring(0,2));
        	if(!str1.substring(0,2).contains("1")) {
        		le++;
        	}
        	str1 = str1.substring(1,str1.length());
        }
        
        for(;str2.length() > 1;) {
        	list02.add(str2.substring(0,2));
    		str2 = str2.substring(1,str2.length());
        }
        for(int i = 0; i < list02.size(); i++) {
        	if(!list02.get(i).contains("1")) {
        		if(list01.contains(list02.get(i))) {
        			cnt++;
        			list01.remove(list01.indexOf(list02.get(i)));
        		} else {
        			le++;
        		}
        	}
        }
        System.out.println(cnt);
        System.out.println(le);
        if(cnt == 0 && le == 0) {
        	answer = 65536;
        } else if (cnt == 0) {
        	answer = 0;
        } else {
        	answer = (cnt * 65536) / le;
        }
        return answer;
	}
}