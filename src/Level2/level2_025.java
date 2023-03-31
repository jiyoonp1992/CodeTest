package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class level2_025 {
	//연속 부분 수열 합의 개수
	public static void main(String[] args) {
		int[] num = {7,9,1,1,4};
		System.out.println(solution(num));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] elements) {
        int answer = 0;
        int sum = 0;
        //ArrayList<Integer> list = new ArrayList<Integer>();
        Set<Integer> ansSet = new HashSet<>();
        for(int i = 1; i <= elements.length; i++) {
        	for(int j = 0; j < elements.length; j++) {
        		sum = 0;
        		for(int k = 0; k < i; k++) {
        			if (j + k > elements.length - 1) {
                        sum += elements[j + k - elements.length];
                    } else {
                        sum += elements[j + k];
                    }
        		}
        		ansSet.add(sum);
        	}
        }
        answer = ansSet.size();
        return answer;
	}
}