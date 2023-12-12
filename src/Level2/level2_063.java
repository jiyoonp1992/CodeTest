package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class level2_063 {
	//메뉴 리뉴얼
	public static void main(String[] args) {
		String[] str = {"XYZ", "XWY", "WXA"};
		int[] in = {2, 3, 4}; 
		//System.out.println(solution(str, in));
		System.out.println(Arrays.toString(solution(str, in)));
	}
	
	static char[] chArr = {};
	public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        String str = "";
        int r = 0;
        List<String> combinations = new ArrayList<>();
        List<String> sbList = new ArrayList<>();
        List<String> anList = new ArrayList<>();
        Map<String, Integer> comMap = new HashMap<>(); 
        int maxNum = 0, num = 0;
        
        for(int j = 0; j < course.length; j++) {
        	r = course[j];
        	maxNum = 0;
        	for(int i = 0; i < orders.length; i++) {
        		str = orders[i];
        		combinations.addAll(generateCombinations(str, r));
        		sbList.clear();
        		// 조합 출력
        		for (String combination : combinations) {
        			combination = Stream.of(combination.split(""))
                            .sorted()
                            .collect(Collectors.joining());
        			comMap.put(combination, comMap.getOrDefault(combination, 0) + 1);
        		}
        		for(String key : comMap.keySet()) {
        			num = comMap.get(key);
        			if(num > 1) {
        				if(maxNum < num) {
        					sbList.clear();
        					sbList.add(key);
        					maxNum = num;
        				} else if(maxNum == num) {
        					if(!sbList.contains(key)) {
        						sbList.add(key);
        					}
        				}
        			}
        		}
        		combinations.clear();
        	}
        	comMap.clear();
        	anList.addAll(sbList);
        }
        answer = anList.stream().toArray(String[]:: new);
        Arrays.sort(answer);
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