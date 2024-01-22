package Level2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class level2_67 {
	//호텔 대실
	public static void main(String[] args) {
		String[][] srtArr = {{"15:00", "17:00"},{"16:40", "18:20"},{"14:20", "15:20"},{"14:10", "19:20"},{"18:20", "21:20"}};
		System.out.println(solution(srtArr));
	}
	
	public static int solution(String[][] book_time) {
        int answer = 0;
        String[] strTemp = {};        
        Arrays.sort(book_time, (a1, a2) -> {
        	int stTime1 = Integer.parseInt(a1[0].substring(0,2))*60 + Integer.parseInt(a1[1].substring(3));
        	int stTime2 = Integer.parseInt(a2[0].substring(0,2))*60 + Integer.parseInt(a2[1].substring(3));
        	int edTime1 = Integer.parseInt(a1[0].substring(0,2))*60 + Integer.parseInt(a1[1].substring(3));
        	int edTime2 = Integer.parseInt(a2[0].substring(0,2))*60 + Integer.parseInt(a2[1].substring(3));
        	if(stTime1 != stTime2 ) {
        		if(stTime1 > stTime2) {
        			return 0;
        		} else {
        			return -1;
        		}
        	} else {
        		if(edTime1 > edTime2) {
        			return 0;
        		} else {
        			return -1;
        		}
        	}
        });
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int stTime = 0, edTime = 0;
        for(String[] str : book_time) {
        	System.out.println(Arrays.toString(str));
        	stTime = Integer.parseInt(str[0].replace(":", ""));
        	edTime = Integer.parseInt(str[1].replace(":", ""));
        	System.out.println(stTime);
        	System.out.println(edTime);
        	if(pq.isEmpty()) {
        		pq.add(edTime);
        	} else {
        		for(int time:pq) {
        			if(stTime + 10 <= time) {
        				pq.remove(time);
        				pq.add(edTime);
        				break;
        			}
        		}
        	}
        }
        return answer;
	}
	
}