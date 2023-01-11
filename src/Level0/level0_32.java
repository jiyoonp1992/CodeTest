package Level0;

import java.util.Arrays;

public class level0_32 {
	//중앙값 구하기
	public static void main(String[] args) {
		int[] str1 = {1, 2, 7, 10, 11};
		int[] str2 = {9, -1, 0};
		System.out.println(solution(str1));
		System.out.println(solution(str2));
	}
	
	public static int solution(int[] array) {
        int answer = 0;
		boolean check = false;
		check = array.length % 2 != 0 && 0 < array.length && array.length < 100;
		if(check) {
			Arrays.sort(array);
			answer = array[(array.length / 2)];
		}
        return answer;
	}
}