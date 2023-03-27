package Level2;

import java.util.Arrays;
import java.util.Comparator;

public class level2_017 {
	//H-Index
	public static void main(String[] args) {
		//int[] num = {3, 0, 6, 1, 5};
		int[] num = {25, 8, 5, 3, 3};
		System.out.println(solution(num));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] citations) {
        int answer = 0;
        Integer[] intArr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(intArr, Comparator.reverseOrder());
        int cnt = 0;
        for(int i: intArr) {
        	if(i <= cnt) {
        		break;
        	}
        	cnt++;
        }
        answer = cnt;
        return answer;
	}
}