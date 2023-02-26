package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_053 {
	//실패율
	public static void main(String[] args) {
		int[] num01 = {2, 1, 2, 6, 2, 4, 3, 3};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(5, num01)));
	}
	
	public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] chAnswer = {};
		boolean check = 1 <= N && N <= 500 && 1 <= stages.length && stages.length <= 200000;
		if(check) {
			chAnswer = new int [N];
			answer = new int[N];
			for(int i : stages) {
				if(i < N) {
					chAnswer[i-1]++;
				}
			}
			int x = stages.length, cnt = 0;
			for(int j : chAnswer) {
				chAnswer[cnt] = j * 100 / x;
				x -= j;
				cnt++;
			}
			answer = Arrays.copyOf(chAnswer, chAnswer.length);
			
			Integer[] arr = Arrays.stream(chAnswer).boxed().toArray(Integer[]::new);
			
			Arrays.sort(arr, Collections.reverseOrder());
			
			cnt = 0;
			for(int k : arr) {
				int index = Arrays.binarySearch(chAnswer, k);
				System.out.println(index);
				chAnswer[index - 1] = -1;
				answer[cnt] = index;
				cnt++;
			}
			
		}
        return answer;
	}
}