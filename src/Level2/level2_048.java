package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class level2_048 {
	//뒤에 있는 큰 수 찾기
	public static void main(String[] args) {
		int[] num = {9, 1, 5, 3, 6, 2};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num)));
	}
	
	public static int[] solution(int[] numbers) {
//        int[] answer = {};
//        int[] reNum = {};
//        reNum = Arrays.copyOf(numbers, numbers.length);
//        Arrays.sort(reNum);
//        answer = new int[numbers.length];
//        List<Integer> list = new ArrayList<>();
//        Arrays.fill(answer, 0);
//        answer[answer.length - 1] = -1;
//        int i = 0, check = 0, reCh = reNum.length - 1;
//        while(check >= 0) {
//        	i = check;
//        	for(; i < numbers.length - 1; i++) {
//        		if(answer[i] != 0) {
//        			break;
//        		} else if(numbers[i] == reNum[reCh]) {
//        			answer[i] = -1;
//        			reCh--;
//        		} else {
//        			if(list.isEmpty()) {
//        				if(numbers[i] == numbers[i + 1] || numbers[i] > numbers[i + 1]) {
//            				list.add(i);
//            			} else if (numbers[i] < numbers[i + 1]) {
//           					answer[i] = numbers[i + 1];
//            			}
//        			} else {
//        				if(numbers[list.get(0)] == numbers[i + 1]) {
//        					list.add(i);
//        				} else if (numbers[list.get(0)] < numbers[i + 1]) {
//           					list.add(i);
//           					for(int j = 0; j < list.size();j++) {
//           						answer[list.get(j)] = numbers[i + 1];
//           					}
//           					list.clear();
//            			}
//        			}
//        		}
//        	}
//        	check = Arrays.binarySearch(answer, 0);
//        }
//        return answer;
		
		int[] answer = {};
		answer = new int[numbers.length];
		Map<Integer, List<Integer>> map = new HashMap<>();
		List<Integer> inList = new ArrayList<>();
		for(int i = 0; i < numbers.length;i++) {
			if(!map.containsKey(numbers[i])) {
				inList.add(i);
				map.put(numbers[i], inList);
			} else {
				inList.get(numbers[i]);
				inList.add(i);
				map.put(numbers[i], inList);
			}
			System.out.println(map);
			inList.clear();
			System.out.println(inList);
		}
		return answer;
	}
}