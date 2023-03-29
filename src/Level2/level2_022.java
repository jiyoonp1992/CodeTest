package Level2;

import java.util.Arrays;
import java.util.Comparator;

public class level2_022 {
	//튜플
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
		//System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
		System.out.println(Arrays.toString(solution("{{4,2,3},{3},{2,3,4,2},{2,3}}")));
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
		String[] reArrStr = {};
		Arrays.sort(strArr, Comparator.comparingInt(String::length));
		Arrays.sort(arrStr, Comparator.comparingInt(String::length).reversed());
		int num = 0, cnt = 0, x = 0;
		num = (int) arrStr[0].chars().filter(i -> i == ',').count();
		arrStr = arrStr[0].split(",");
		reArrStr = arrStr.clone();
		reArrStr = Arrays.stream(reArrStr).distinct().toArray(String[]::new);
		x = reArrStr.length == arrStr.length ? 0 : 1;
		answer = new int[num + 1];
		for(String temp:strArr) {
			if(cnt == 0) {
				answer[cnt] = Integer.valueOf(temp).intValue();
			} else {
				arrStr = temp.split(",");
				for(String str:arrStr) {
					if(x == 0) {
						if(!Arrays.toString(answer).contains(str)) {
							answer[cnt] = Integer.valueOf(str).intValue();
							break;
						}
					} else {
						answer[cnt] = Integer.valueOf(str).intValue();
						break;
					}
				}
			}
			cnt++;
		}
		return answer;
	}
}