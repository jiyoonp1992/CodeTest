package Level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class level2_67 {
	//호텔 대실
	public static void main(String[] args) {
		String[][] srtArr = {{"15:00", "17:00"},{"16:40", "18:20"},{"14:20", "15:20"},{"14:10", "19:20"},{"18:20", "21:20"}};
		System.out.println(solution(srtArr));
	}
	
	public static int solution(String[][] book_time) {
        int answer = 0;
        Queue<Integer> strQu = new LinkedList<Integer>();
        String stTimeStr = "", endTimeStr = "";
        int stTime = 0, endTime = 0;
        for(String[] endtime : book_time) {
        	stTimeStr = endtime[0].replaceAll(":", "");
        	endTimeStr = endtime[1].replaceAll(":", "");
        	if(strQu.isEmpty()) {
        		endTime = Integer.parseInt(endTimeStr);
        		strQu.add(endTime);
        	} else {
        		
        	}
        }
        
        return answer;
	}
	
}