package Level2;

import java.util.Arrays;

public class level2_048 {
	//뒤에 있는 큰 수 찾기
	public static void main(String[] args) {
		int[] num = {2, 3, 3, 5};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num)));
	}
	
	public static int[] solution(int[] numbers) {
        int[] answer = {};
        int[] chNum = {};
        chNum = Arrays.copyOf(numbers, numbers.length);
        answer = new int[numbers.length];
        int cnt = numbers.length - 1;
        Arrays.sort(chNum);
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i; j < numbers.length; j++) {
        		if(numbers[i] < numbers[j]) {
        			answer[i] = numbers[j];
        			break;
        		} else {
        			answer[i] = -1;
        		}
        	}
        }
        return answer;
	}
}