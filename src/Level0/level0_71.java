package Level0;

import java.util.Arrays;

public class level0_71 {
	//7의 개수
	public static void main(String[] args) {
		int[] num01 = {7, 77, 17};
		int[] num02 = {10, 29};
		System.out.println(solution(num01));
		System.out.println(solution(num02));
	}
	
	public static int solution(int[] array) {
        int answer = 0;
		boolean check = false;
		check = 1 <= array.length && array.length <= 100;
		if(check) {
			for(int i = 0; i < array.length; i++) {
				for(;array[i] > 0;) {
					if(array[i]%10 == 7) {
						answer++;
					}
					array[i] /= 10;
				}
			}
		}
        return answer;
	}
}