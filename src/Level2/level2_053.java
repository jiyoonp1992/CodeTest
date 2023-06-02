package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class level2_053 {
	//롤케이크 자르기
	public static void main(String[] args) {
		int[] num = {1, 2, 1, 3, 1, 4, 1, 2};
		System.out.println(solution(num));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] topping) {
		int answer = 0;
		int x = 0, y = 0, z = 0;
		List<Integer> list01 = new LinkedList<Integer>();
		Set<Integer> set01 = new HashSet<>();
		y = (int) Arrays.stream(topping).distinct().count();
		for(int i = 0; i < topping.length; i++) {
			z = topping[i];
			if(!set01.contains(z)) {
				set01.add(z);
				x++;
			}
			topping[i] = 0;
			if(!Arrays.asList(topping).contains(z)) {
				y--;
			}
			if(x == y) {
				answer++;
			}
		}
		return answer;
		
		
//		int answer = 0;
//		List<Integer> list01 = new ArrayList<>();
//		Set<Integer> setList01 = new LinkedHashSet<>();
//		Set<Integer> setList02 = new LinkedHashSet<>();
//		list01 = Arrays.stream(topping).boxed().collect(Collectors.toList());
//		for(int i = 0; i < topping.length; i++) {
//			setList02.add(topping[i]);
//			list01.remove(list01.indexOf(topping[i]));
//			setList01 = new LinkedHashSet<>(list01);
//			if(setList01.size() == setList02.size()) {
//				answer++;
//			}
//		}
//		return answer;
		
//        int answer = -1;
//        Map<Integer, Integer> mapSt = new HashMap<>();
//        Map<Integer, Integer> mapEn = new HashMap<>();
//        Queue<Integer> stQu = new LinkedList<>();
//        Queue<Integer> enQu = new LinkedList<>();
//        int stCnt = 0, enCnt = 0;
//        for(int i = 0; i < topping.length; i++) {
//        	if(!stQu.contains(topping[i])) {
//        		stQu.add(topping[i]);
//        		stCnt++;
//        	}
//        	if(!enQu.contains(topping[topping.length - 1 - i])) {
//        		enQu.add(topping[topping.length - 1 - i]);
//        		enCnt++;
//        	}
//        	mapSt.put(i + 1, stCnt);
//        	mapEn.put(topping.length - 1 - i, enCnt);
//        }
//        answer = 0;
//        for(int j = 1; j < mapSt.size(); j++) {
//        	if(mapSt.get(j).equals(mapEn.get(j))) {
//        		answer++;
//        	}
//        }
//        return answer;
	}
}