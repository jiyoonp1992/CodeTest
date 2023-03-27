package Level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class level2_010_1 {
	//영어 끝말잇기
	public static void main(String[] args) {
		//String[] str01 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		//String[] str01 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		//String[] str01 = {"hello", "one", "even", "never", "now", "world", "draw"};
		//String[] str01 = {"qwe", "eqwe", "eqwe", "qwe"};
		//String[] str01 = {"abb", "baa", "ccc", "cda", "abb"};
		//String[] str01 = {"land", "dream", "mom", "mom", "ror"};
		String[] str01 = {"tank", "kick", "know", "wheel", "land", "dream", "tank", "mother", "robot", "tank"};
		//String[] str01 = {"ac","ca","ac","ac"};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(3, str01)));
	}
	
	public static int[] solution(int n, String[] words) {
     	int[] answer = {};
        int cnt = 0;
		Map<String, Integer> map = new HashMap<>();
		
        answer = new int [2];
        int i = 0;
        for(; i < words.length;i++) {
            if(i == 0) {
                map.put(words[i], 1);
                cnt++;
            } else {
                if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0) || map.containsKey(words[i])) {
                    if(cnt >= n) {
                        cnt = cnt - n + 1;
                    } else {
                        cnt++;
                    }
                    
                    i++;
                    
                    answer[0] = cnt;
                    
                    if (i % n == 0) {
                        answer[1] = i / n;
                    } else {
                        answer[1] = i / n + 1;
                    }
                    
                    break;
                } else {
                    if(cnt >= n) {
                        cnt = cnt - n + 1;
                    } else {
                        cnt++;
                    }
                    map.put(words[i], 1);
                }
            }
        }
        
        return answer;
    }
}