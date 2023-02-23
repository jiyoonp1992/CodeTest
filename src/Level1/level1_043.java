package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_043 {
	//두 개 뽑아서 더하기
	public static void main(String[] args) {
		int[] num01 = {2,1,3,4,1};
		System.out.println(solution(num01));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int[] solution(int[] numbers) {
        int[] answer = {};
        String[] str = {};
		boolean check = 2 <= numbers.length && numbers.length <= 100;
		if(check) {
			for(int i = 0; i < numbers.length - 1; i++) {
				for(int j = i + 1; j < numbers.length; j++) {
					String sum = numbers[i] + numbers[j] + "";
					if(!Arrays.asList(str).contains(sum)){
						str = Arrays.copyOf(str, str.length + 1);
						answer = Arrays.copyOf(answer, answer.length + 1);
						str[str.length - 1] = numbers[i] + numbers[j] + "";
						answer[answer.length - 1] = numbers[i] + numbers[j];
					}
				}
			}
			
			Arrays.sort(answer);
		}
        return answer;
	}
}