package Level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collector;

public class level2_022 {
	//튜플
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
		//System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
		System.out.println(Arrays.toString(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));
	}
	
//	public static int[] solution(String s) {
//        int[] answer = {};
//        String[] strArr = s.replace("{{", "").replace("}}", "").split("\\},\\{");
//        String temp = "";
//        for(String str : strArr) {
//        	if(temp.length() < str.length()) {
//        		temp = str;
//        	}
//        }
//        answer = Arrays.stream(temp.split(",")).mapToInt(i -> Integer.valueOf(i).intValue()).toArray();
//        return answer;
//	}
	
	
	public static int[] solution(String s) {
		int[] answer = {};
		String[] strArr = s.replace("{{", "").replace("}}", "").split("\\},\\{");
		String[] arrStr = strArr.clone();
		String[] ansArr = {};

		Arrays.sort(strArr, Comparator.comparingInt(String::length));
		Arrays.sort(arrStr, Comparator.comparingInt(String::length).reversed());
		
		int num = 0;
		
		num = (int) arrStr[0].chars().filter(i -> i == ',').count();
		answer = new int[num + 1];
		ansArr = new String[num + 1];
		String str = "";
		
		for(int i = 0; i < num + 1;i++) {
			if(i == 0) {
				ansArr[i] = strArr[i];
			} else {
				arrStr = strArr[i].split(",");
				for(int j = 0; i < arrStr.length; j++) {
					str = arrStr[j];
					if(!Arrays.asList(ansArr).contains(str)) {
						ansArr[i] = str;
						break;
					}
				}
			}
		}
//		
//		for(String temp:strArr) {
//			if(cnt == 0) {
//				answer[cnt] = Integer.valueOf(temp).intValue();
//			} else {
//				arrStr = temp.split(",");
//				for(String str:arrStr) {
//					if(x == 0) {
//						if(!Arrays.toString(answer).contains(str)) {
//							answer[cnt] = Integer.valueOf(str).intValue();
//							break;
//						}
//					} else {
//						answer[cnt] = Integer.valueOf(str).intValue();
//						break;
//					}
//				}
//			}
//			cnt++;
//		}
		answer = Arrays.stream(ansArr).mapToInt(Integer::parseInt).toArray();
		return answer;
	}
}