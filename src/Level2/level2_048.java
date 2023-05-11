package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class level2_048 {
	//뒤에 있는 큰 수 찾기
	public static void main(String[] args) {
		//int[] num = {9, 1, 5, 3, 6, 2};
		int[] num = {8, 1, 2, 9};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num)));
	}
	
	public static int[] solution(int[] numbers) {
		int[] answer = {};
		int[] chNum = {};
		chNum = Arrays.copyOf(numbers, numbers.length);
		answer = new int[numbers.length];
		answer[numbers.length - 1] = -1;
		int cnt = numbers.length - 1;
		Arrays.sort(chNum);
		for(int i = 0; i < numbers.length - 1; i++) {
			if(numbers[i] == chNum[cnt]) {
				answer[i] = -1;
				cnt--;
			} else {
				for(int j = i + 1; j < numbers.length; j++) {
					if(numbers[i] < numbers[j]) {
						answer[i] = numbers[j];
						break;
					}
				}
			}
		}
		return answer;
		
//		int[] answer = {};
//		int[] chNum = {};
//		chNum = Arrays.copyOf(numbers, numbers.length);
//		answer = new int[numbers.length];
//		int cnt = numbers.length - 1;
//		Arrays.sort(chNum);
//		for(int i = 0; i < numbers.length; i++) {
//			for(int j = i; j < numbers.length; j++) {
//				if(numbers[i] < numbers[j]) {
//					answer[i] = numbers[j];
//					break;
//				} else {
//					answer[i] = -1;
//				}
//			}
//		}
//		return answer;
		
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
	}
}