package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_040 {
	//문자열 내 마음대로 정렬하기
	public static void main(String[] args) {
		String[] str01 = {"abcf", "bbcd"};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(str01,2)));
	}
	
	public static String[] solution(String[] strings, int n) {
        String[] answer = {};
		boolean check = 1 <= strings.length && strings.length <= 50;
		if(check) {
			String tem = "";
			for(int i = 0; i < strings.length; i++) {
				for(int j = 0; j < strings.length; j++) {
					if(strings[i].charAt(n) < strings[j].charAt(n)) {
						tem = strings[j];
						strings[j] = strings[i];
						strings[i] = tem;
					} else if(strings[i].charAt(n) == strings[j].charAt(n)) {
						for(int k = 0;k < n - 1;) {
							if(strings[i].charAt(k) < strings[j].charAt(k)) {
								tem = strings[i];
								strings[i] = strings[j];
								strings[j] = tem;
							} else {
								k++;
							}
						}
					}
				}
			}
			answer = strings;
		}
        return answer;
	}
}