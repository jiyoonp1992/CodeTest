package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class level2_033 {
	//할인 행사
	public static void main(String[] args) {
		String[] str01 = {"banana", "apple", "rice", "pork", "pot"};
		String[] str02 = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		int[] num01 = {3, 2, 2, 2, 1};
		System.out.println(solution(str01,num01,str02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        String[] temp = {};
        int cnt = 0;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < number.length; i++) {
        	cnt = number[i];
        	for(int j = 1; j <= cnt;j++) {
        		list.add(want[i]);
        	}
        }
        Collections.sort(list);
        for(int j = 0; j < discount.length - 9;j++) {
        	if(Arrays.asList(want).contains(discount[j])) {
        		temp = Arrays.copyOfRange(discount, j, j + 10);
        		Arrays.sort(temp);
        	}
        	if(Arrays.asList(temp).equals(list)) {
        		answer++;
        	}
        }
        return answer;
	}
}