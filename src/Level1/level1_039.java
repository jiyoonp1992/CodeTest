package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_039 {
	//[1차] 비밀지도
	public static void main(String[] args) {
		int[] num01 = {9, 20, 28, 18, 11};
		int[] num02 = {30, 1, 21, 17, 28};
		System.out.println(solution(5, num01, num02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
		boolean check = 1 <= n && n <= 16;
		if(check) {
			String str01 = "", str02 = "";
			for(int i = 0; i < n;i++) {
				answer = Arrays.copyOf(answer, answer.length+1);
				str01 = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr1[i])));
				str02 = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr2[i])));
				answer[i] = "";
				for(int j = 0; j < str01.length(); j++) {
					if(str01.charAt(j) == '0' && str02.charAt(j) == '0') {
						answer[i] += ' ';
					} else {
						answer[i] += '#';
					}
				}
			}
		}
        return answer;
	}
}