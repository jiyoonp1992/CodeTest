package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class level2_036 {
	//더 맵게
	public static void main(String[] args) {
		int[] num01 = {2, 1, 3, 9, 10, 12};
		int[] num = {6,2,1,1};
		System.out.println(solution(num,300));
		System.out.println(solution(num01,7));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : scoville) {
        	pq.add(i);
        }
        int x = 0, y = 0;
        for(int i = 1; i <= pq.size();) {
        	x = pq.poll();
        	if(x < K && pq.size() == 0) {
        		answer = -1;
        		break;
        	} else if (x < K) {
        		y = pq.peek();
        		pq.add(x + y * 2);
        		pq.poll();
        		answer++;
        	} else {
        		break;
        	}
        }
        return answer;
//        int answer = 0;
//        List<Integer> list = new ArrayList<>();
//        
//        list = Arrays.stream(scoville).boxed().collect(Collectors.toList());
//        for(int i = 1; i <= list.size();) {
//        	Collections.sort(list);
//        	if(list.get(0) < K && list.size() == 1) {
//        		answer = -1;
//        		break;
//        	} else if (list.get(0) < K) {
//        		list.add(list.get(0) + (list.get(1) * 2));
//        		list.remove(1);
//        		list.remove(0);
//        		answer++;
//        	} else {
//        		break;
//        	}
//        }
//        return answer;
	}
}