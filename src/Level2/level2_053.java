package Level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
		Set<Integer> setLe = new HashSet<>();
		List<Integer> list = new LinkedList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int x = 0, y = 0;
		for(int i = 0; i < topping.length; i++) {
			if(map.containsKey(topping[i])) {
				map.put(topping[i],map.get(topping[i]) + 1);
			} else {
				map.put(topping[i],1);
			}
		}
		y = map.size();
		for(int j = 0; j < topping.length; j++) {
			setLe.add(topping[j]);
			if(map.get(topping[j]) > 1) {
				map.put(topping[j],map.get(topping[j]) - 1);
			} else {
				y--;
			}
			if(setLe.size() == y) {
				answer++;
			}
		}
		return answer;
		
//		int answer = 0;
//		Set<Integer> setLe = new HashSet<>();
//		List<Integer> list = new LinkedList<>();
//		list = Arrays.stream(topping).boxed().collect(Collectors.toList());
//		int x = 0, y = 0;
//		y = (int) Arrays.stream(topping).distinct().count();
//		for(int i = 0; i < list.size();) {
//			x = list.get(i);
//			setLe.add(x);
//			list.remove(i);
//			if(!list.contains(x)) {
//				y--;
//			}
//			if(setLe.size() == y) {
//				answer++;
//			}
//		}
//		return answer;
		
		
//		int answer = 0;
//		Set<Integer> setLe = new HashSet<>();
//		Set<Integer> setRi = new HashSet<>();
//		Map<Integer, String> map = new HashMap<>();
//		int x = topping.length;
//		for(int i = 0; i < topping.length; i++) {
//			setLe.add(topping[i]);
//			setRi.add(topping[x - 1 - i]);
//			if(map.containsKey(setLe.size())) {
//				if(map.get(setLe.size()).contains((i + 1) + "/")) {
//					answer++;
//				} else {
//					map.put(setLe.size(), map.get(setLe.size()) + (i + 1) + "/");
//				}
//			} else {
//				map.put(setLe.size(), (i + 1) + "/");
//			}
//			
//			if(map.containsKey(setRi.size())) {
//				if(map.get(setRi.size()).contains((x - 1 - i) + "/")) {
//					answer++;
//				} else {
//					map.put(setRi.size(), map.get(setRi.size()) + (x - 1 - i) + "/");
//				}
//			} else {
//				map.put(setRi.size(), (x - 1 - i) + "/");
//			}
//			System.out.println(map);
//			System.out.println(setLe.size());
//			System.out.println(i + "/");
//			System.out.println(setRi.size());
//			System.out.println((x - 1 - i) + "/");
//			System.out.println(answer);
//		}
//		return answer;
		
		
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