package Level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class level2_028 {
	//프린터
	public static void main(String[] args) {
		//int[] num = {1, 1, 9, 1, 1, 1};
		int[] num = {2,1,3,2};
		//int[] num = {1, 1, 1, 2};
		System.out.println(solution(num,2));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        int x = 0;
        int cnt = 1;
        x = priorities[location];
        Integer[] Arrint = {};
        Arrint = Arrays.stream(priorities).boxed().toArray(Integer[]::new);
        Arrays.sort(Arrint, Collections.reverseOrder());
        for(int i = location + 1; i < priorities.length; i++) {
        	if(priorities[i] > x) {
        		cnt = 2;
        	} else if (priorities[i] == x){
        		cnt++;
        	}
        }
        answer = cnt;
        return answer;
	}
}