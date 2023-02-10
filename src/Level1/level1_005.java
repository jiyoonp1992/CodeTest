package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_005 {
	//자연수 뒤집어 배열로 만들기
	public static void main(String[] args) {
		//System.out.println(solution(12345));
		System.out.println(Arrays.toString(solution(12345)));
	}
	
	public static int[] solution(long n) {
        int[] answer = {};
        for(int i = 0; n >0; i++){
        	answer = Arrays.copyOf(answer, answer.length + 1);
        	answer[i] =  (int) (n % 10);
        	n /= 10;
        }
        return answer;
	}
}