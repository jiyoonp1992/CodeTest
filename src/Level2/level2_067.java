package Level2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class level2_067 {
	//호텔 대실
	public static void main(String[] args) {
		//String[][] srtArr = {{"15:00", "17:00"},{"16:40", "18:20"},{"14:20", "15:20"},{"14:10", "19:20"},{"18:20", "21:20"}};
		
		String[][] srtArr1 ={{"11:01", "17:27"},{"04:10", "04:20"},{"07:59", "08:59"},{"09:10", "10:49"}};// >>> 1
		String[][] srtArr2 ={{"11:01", "17:27"},{"04:10", "04:20"},{"07:59", "08:59"},{"09:10", "10:49"},{"11:01", "17:27"},{"04:10", "04:20"},{"07:59", "08:59"},{"09:10", "10:49"}};// >>> 2
		String[][] srtArr3 ={{"09:10", "10:11"},{"10:20", "12:20"}};// >>>2
		String[][] srtArr4 ={{"09:10", "10:10"},{"09:10", "10:10"},{"10:20", "12:20"},{"10:20", "12:20"}};// >>> 2
		String[][] srtArr5 ={{"08:00", "08:30"},{"08:00", "13:00"},{"12:30", "13:30"}};// >>> 2
		String[][] srtArr6 ={{"00:01", "00:10"},{"00:19", "00:29"}};// >>> 2
		String[][] srtArr7 ={{"05:57", "06:02"},{"04:00", "06:59"},{"03:56", "07:57"},{"06:12", "08:55"},{"07:09", "07:11"}};// >>> 3
		String[][] srtArr8 ={{"00:01", "00:10"},{"00:19", "00:29"}};// >>> 2
		String[][] srtArr9 ={{"08:00", "13:00"},{"08:00", "08:30"},{"12:30", "13:30"}};// >>> 2
		String[][] srtArr10 ={{"16:00", "16:10"},{"16:20", "16:30"},{"16:40", "16:50"}};// >>> 1
		String[][] srtArr11 ={{"09:10", "10:10"},{"10:20", "12:20"},{"12:30", "13:20"}};// >>> 1
		String[][] srtArr12 ={{"10:00", "10:10"}};// >>> 1
		System.out.println("1 = " + solution(srtArr1));
		System.out.println("2 = " + solution(srtArr2));
		System.out.println("3 = " + solution(srtArr3));
		System.out.println("4 = " + solution(srtArr4));
		System.out.println("5 = " + solution(srtArr5));
		System.out.println("6 = " + solution(srtArr6));
		System.out.println("7 = " + solution(srtArr7));
		System.out.println("8 = " + solution(srtArr8));
		System.out.println("9 = " + solution(srtArr9));
		System.out.println("10 = " + solution(srtArr10));
		System.out.println("11 = " + solution(srtArr11));
		System.out.println("12 = " + solution(srtArr12));
	}
	
	public static int solution(String[][] book_time) {
        int answer = 0;
        Arrays.sort(book_time, (a1, a2) -> {
        	int stTime1 = Integer.parseInt(a1[0].substring(0,2))*60 + Integer.parseInt(a1[0].substring(3));
        	int stTime2 = Integer.parseInt(a2[0].substring(0,2))*60 + Integer.parseInt(a2[0].substring(3));
        	int edTime1 = Integer.parseInt(a1[1].substring(0,2))*60 + Integer.parseInt(a1[1].substring(3));
        	int edTime2 = Integer.parseInt(a2[1].substring(0,2))*60 + Integer.parseInt(a2[1].substring(3));
        	if(stTime1 < stTime2) {
        		return -1;
        	} else if(stTime1 == stTime2) {
        		if(edTime1 <= edTime2) {
        			return -1;
        		} else {
        			return 1;
        		}
        	} else {
        		return 1;
        	}
        });
        PriorityQueue<Integer> priqueue = new PriorityQueue<Integer>();
        int stTime = 0, edTime = 0, cnt = 0;
        for(String[] str : book_time) {
        	cnt = 0;
        	stTime = Integer.parseInt(str[0].substring(0,2))*60 + Integer.parseInt(str[0].substring(3));
        	edTime = Integer.parseInt(str[1].substring(0,2))*60 + Integer.parseInt(str[1].substring(3));
        	if(priqueue.isEmpty()) {
        		priqueue.add(edTime);
        	} else {
        		for(int time:priqueue) {
        			if(time + 10 > stTime && cnt == priqueue.size() - 1) {
        				priqueue.add(edTime);
        				break;
        			} else if(time + 10 <= stTime) {
        				priqueue.remove(time);
        				priqueue.add(edTime);
        				break;
        			}
        			cnt++;
        		}
        	}
        }
        answer = priqueue.size();
        return answer;
	}
	
}