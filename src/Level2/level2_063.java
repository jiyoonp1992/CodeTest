package Level2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class level2_063 {
	//메뉴 리뉴얼
	public static void main(String[] args) {
		String[] str = {"ABCFG"};
		int[] in = {2}; 
		System.out.println(solution(str, in));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        char[] chArr = {};
        Map<String, Integer> strMap = new LinkedHashMap<>();
        for(String str : orders) {
        	chArr = str.toCharArray();
        	for(int i = 0; i < chArr.length; i++) {
        		for(int j = i; j < chArr.length; j++) {
        			String sub = "";
        			StringBuilder sb = new StringBuilder();
        			for(int k = j+1; k < chArr.length; k++) {
        				sb.append(chArr[i]);
        				sub += chArr[i];
        			}
        			System.out.println(sb);
        			System.out.println(sub);
        		}
        	}
        	
        }
        return answer;
	}
}