package Level1;

import java.util.Arrays;

public class level1_076 {
	//추억 점수
	public static void main(String[] args) {
		String[] str01 = {"may", "kein", "kain", "radi"};
		int[] num = {5, 10, 1, 3};
		String[][] str03 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(str01, num, str03)));
	}
	
	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
//		int[] answer = {};
//        int sum = 0, idx = 0;
//        answer = new int[photo.length];
//        String str = "";
//        String[] arrStr = {};
//        for(String[] strArr : photo) {
//        	sum = 0;
//        	str = Arrays.toString(strArr).replace("[", "").replace("]", "");
//        	for(int i = 0; i < name.length; i++) {
//        		str = str.replaceAll(name[i], String.valueOf(yearning[i]));
//        	}
//        	arrStr = str.split(",");
//        	for(String strNum : arrStr) {
//        		try {
//					sum += Integer.valueOf(strNum.trim()).intValue();
//				} catch (Exception e) {
//					continue;
//				}
//        	}
//        	answer[idx] = sum;
//        	idx++;
//        }
//        return answer;
        int[] answer = {};
        int sum = 0, cnt = 0;
        answer = new int[photo.length];
        for(String[] strArr : photo) {
        	sum = 0;
        	for(String str : strArr) {
        		if(Arrays.asList(name).contains(str)) {
        			sum += yearning[Arrays.asList(name).indexOf(str)];
        		}
        	}
        	answer[cnt] = sum;
        	cnt++;
        }
        return answer;
	}
}