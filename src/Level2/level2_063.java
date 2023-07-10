package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class level2_063 {
	//메뉴 리뉴얼
	public static void main(String[] args) {
		String[] str = {"ABCFG", "ABC"};
		int[] in = {2, 3, 4}; 
		System.out.println(solution(str, in));
		//System.out.println(Arrays.toString(solution()));
	}
	
	static char[] chArr = {};
	public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        String str = "";
        int r = 0;
        List<String> combinations = new ArrayList<>();
        Map<String, Integer> comMap = new HashMap<>(); 
        for(int i = 0; i < orders.length; i++) {
        	str = orders[i];
        	for(int j = 0; j < course.length; j++) {
        		r = course[j];
        		combinations.addAll(generateCombinations(str, r));
        	}
        }

        // 조합 출력
        for (String combination : combinations) {
        	comMap.put(combination, comMap.getOrDefault(combination, 0) + 1);
        }
        System.out.println(comMap);

        return answer;
	}
	
    private static List<String> generateCombinations(String str, int r) {
        List<String> combinations = new ArrayList<>();

        if (r > str.length()) {
            return combinations;
        }

        generateCombinationsHelper(str, 0, r, new StringBuilder(), combinations);

        return combinations;
    }
    
    private static void generateCombinationsHelper(String str, int start, int r, StringBuilder currentCombination, List<String> combinations) {
        if (r == 0) {
            combinations.add(currentCombination.toString());
            return;
        }

        for (int i = start; i < str.length(); i++) {
            currentCombination.append(str.charAt(i));
            generateCombinationsHelper(str, i + 1, r - 1, currentCombination, combinations);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }

}