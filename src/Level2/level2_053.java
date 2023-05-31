package Level2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class level2_053 {
	//롤케이크 자르기
	public static void main(String[] args) {
		int[] num = {1, 2, 1, 3, 1, 4, 1, 2};
		System.out.println(solution(num));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] topping) {
		int answer = -1;
		Map<Integer, Integer> mapSt = new HashMap<>();
		Map<Integer, Integer> mapEn = new HashMap<>();
		Queue<Integer> stQu = new LinkedList<>();
		Queue<Integer> enQu = new LinkedList<>();
		int stCnt = 0, enCnt = 0;
		for(int i = 0; i < topping.length; i++) {
			if(!stQu.contains(topping[i])) {
				stCnt++;
				stQu.add(stCnt);
			}
			if(!enQu.contains(topping[topping.length - 1 - i])) {
				enCnt++;
				enQu.add(enCnt);
			}
		}
		System.out.println(stQu);
		System.out.println(enQu);
		System.out.println("=======================");
		enQu.add(enQu.poll());
		answer = 0;
		System.out.println(stQu);
		System.out.println(enQu);
		while(!stQu.isEmpty()) {
			if(stQu.poll() == enQu.poll()) {
				answer++;
			}
		}
		return answer;
		
//        int answer = -1;
//        Map<Integer, Integer> mapSt = new HashMap<>();
//        Map<Integer, Integer> mapEn = new HashMap<>();
//        Queue<Integer> stQu = new LinkedList<>();
//        Queue<Integer> enQu = new LinkedList<>();
//        int stCnt = 0, enCnt = 0;
//        for(int i = 0; i < topping.length; i++) {
//        	if(!stQu.contains(topping[i])) {
//        		stQu.add(topping[i]);
//        		stCnt++;
//        	}
//        	if(!enQu.contains(topping[topping.length - 1 - i])) {
//        		enQu.add(topping[topping.length - 1 - i]);
//        		enCnt++;
//        	}
//        	mapSt.put(i + 1, stCnt);
//        	mapEn.put(topping.length - 1 - i, enCnt);
//        }
//        answer = 0;
//        for(int j = 1; j < mapSt.size(); j++) {
//        	if(mapSt.get(j).equals(mapEn.get(j))) {
//        		answer++;
//        	}
//        }
//        return answer;
	}
}