package Level2;

import java.util.Arrays;
import java.util.Comparator;

public class level2_020 {
	//귤 고르기
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] numArr = {};
        numArr = new int[1000001];
        for(int i : tangerine) {
        	numArr[i]++;
        }
        Integer[] Arr = Arrays.stream(numArr).boxed().toArray(Integer[]::new);
        Arrays.sort(Arr, Comparator.reverseOrder());
        for(int j:Arr) {
        	if(k > j) {
        		k -= j;
        		answer++;
        	} else {
        		answer++;
        		break;
        	}
        }
        return answer;
	}
}