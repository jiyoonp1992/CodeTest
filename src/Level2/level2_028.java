package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class level2_028 {
	//프린터
	public static void main(String[] args) {
		int[] num01 = {1, 1, 9, 1, 1, 1}; // 0 5
		int[] num = {2,1,3,2};  // 2 1
		//int[] num = {1, 1, 1, 2};// 2 4
		System.out.println(solution(num,2));
		System.out.println(solution(num01,0));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> list01 = new ArrayList<Integer>();
        List<Integer> list02 = new ArrayList<Integer>();
        list01 = Arrays.stream(priorities).boxed().collect(Collectors.toList());
        list02 = Arrays.stream(priorities).boxed().collect(Collectors.toList());
        Collections.sort(list01, Collections.reverseOrder());
        for(int i = 0; list02.size() > 0; i++) {
        	
        	if(i > list02.size() - 1) {
        		i = 0;
        	}
        	
        	if(i == location && list01.get(0) == list02.get(location)) {
        		answer++;
        		break;
        	} else if(list01.get(0) == list02.get(i)) {
        		list01.remove(0);
        		answer++;
        	}
        	
        }
        return answer;
	}
}