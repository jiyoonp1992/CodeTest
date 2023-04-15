package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class level2_037 {
	//주차 요금 계산
	public static void main(String[] args) {
		int[] num = {180, 5000, 10, 600};
		String[] str = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num, str)));
	}
	
	public static int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        List<String> listIn = new ArrayList<>();
        Set<String> listSet = new HashSet<>();
        Map<String, Integer> mapIN = new HashMap<>();
        int tm = 0;
        String cN = "";
        String st = "";
        for(String str : records) {
        	tm = Integer.parseInt(str.substring(0, 2)) * 60 + Integer.parseInt(str.substring(3, 5));
        	cN = str.substring(6, 10);
        	st = str.substring(11, str.length());
        	if(st.equals("IN")) {
        		listIn.add(cN);
        		listSet.add(cN);
        		if(mapIN.containsKey(cN)) {
        			mapIN.put(cN, tm - mapIN.get(cN));
        		} else {
        			mapIN.put(cN,tm);
        		}
        	} else {
        		listIn.remove(cN);
        		mapIN.put(cN, Math.max(tm, mapIN.get(cN)) - Math.min(tm, mapIN.get(cN)));
        	}
        }
        if(!listIn.isEmpty()) {
        	for(String cNstr : listIn) {
        		mapIN.put(cNstr, Math.max(1439, mapIN.get(cNstr)) - Math.min(1439, mapIN.get(cNstr)));
        	}
        	listIn.clear();
        }
        listIn.addAll(listSet);
        Collections.sort(listIn);
        answer = new int[listIn.size()];
        
        for(int i = 0; i < answer.length; i++) {
        	if(mapIN.get(listIn.get(i)) <= fees[0]) {
        		answer[i] = fees[1];
        	} else {
        		answer[i] = fees[1] + (int) Math.ceil((float)(mapIN.get(listIn.get(i)) - fees[0]) / fees[2]) * fees[3];
        	}
        }
        return answer;
	}
}