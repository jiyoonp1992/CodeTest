package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level2_048 {
	//뒤에 있는 큰 수 찾기
	public static void main(String[] args) {
		int[] num = {9, 1, 5, 3, 6, 2};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num)));
	}
	
	public static int[] solution(int[] numbers) {
        int[] answer = {};
        int[] reNum = {};
        reNum = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(reNum);
        answer = new int[numbers.length];
        List<Integer> list = new ArrayList<>();
        Arrays.fill(answer, 0);
        answer[answer.length - 1] = -1;
        int check = 0, reCh = reNum.length - 1;
        while(check >= 0) {
        	for(int i = 0; i < numbers.length - 1; i++) {
        		System.out.println(numbers[i]);
        		System.out.println(list);
        		if(numbers[i] == reNum[reCh]) {
        			answer[i] = -1;
        			reCh--;
        		} else {
        			if(numbers[i] == numbers[i + 1]) {
        				list.add(i);
        			} else if (numbers[i] < numbers[i + 1]) {
        				if(list.isEmpty()) {
        					answer[i] = numbers[i + 1];
        				} else {
        					list.add(i);
        					for(int j = 0; j < list.size();j++) {
        						answer[list.get(j)] = numbers[i + 1];
        					}
        				}
        			}
        		}
        	}
        	check = Arrays.toString(answer).indexOf("0");
        	System.out.println(check);
        }
        return answer;
	}
}