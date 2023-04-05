package Level2;

import java.util.ArrayList;
import java.util.List;

public class level2_029 {
	//타겟 넘버
	public static void main(String[] args) {
		int[] num = {1, 1, 1, 1, 1};
		System.out.println(solution(num,3));
		//System.out.println(Arrays.toString(solution(num,3)));
	}
	
	public static int solution(int[] numbers, int target) {
        int answer = 0;
        List<Integer> list01 = new ArrayList<Integer>();
        List<Integer> list02 = new ArrayList<Integer>();
        int cnt = 1, num = 0;
        list01.add(numbers[0]);
        list01.add(numbers[0] * -1);
        for(int i = 0; i < list01.size();i++) {
        	if(cnt == numbers.length) {
        		break;
        	} else {
        		num = numbers[cnt];
        	}
       		list02.add(list01.get(i) + num);
       		list02.add(list01.get(i) + (num * -1));
        	
        	if(i == list01.size() - 1) {
        		i = -1;
        		list01.clear();
        		list01.addAll(list02);
        		list02.clear();
        		cnt++;
        	}
        }
        for(int j : list01) {
        	if(j == target) {
        		answer++;
        	}
        }
        return answer;
	}
}