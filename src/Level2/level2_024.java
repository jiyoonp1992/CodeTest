package Level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class level2_024 {
	//위장
	public static void main(String[] args) {
		String[][] str = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
		System.out.println(solution(str));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> map = new HashMap();
        for(int i = 0; i < clothes.length;i++) {
        	if(i == 0) {
        		map.put(clothes[i][1], 1);
        	} else {
        		if(map.containsKey(clothes[i][1])) {
        			map.replace(clothes[i][1], map.get(clothes[i][1]) + 1);
        		} else {
        			map.put(clothes[i][1], 1);
        		}
        	}
        }
        System.out.println(map);
        
        for (Map.Entry<String, Integer> ans : map.entrySet()) {
        	System.out.println(ans.getValue());
        	answer *= (ans.getValue() + 1);
        }
        System.out.println(answer);
        answer -= 1;
        return answer;
	}
}