package Level0;

import java.util.Arrays;

public class level0_92 {
	//최빈값 구하기
	public static void main(String[] args) {
		int[] num01 = {1, 2, 3, 3, 3, 4};
		int[] num02 = {1, 1, 2, 2};
		int[] num03 = {1};
		int[] num04 = {0, 0, 0, 1};
		//System.out.println(solution(num01));
		//System.out.println(solution(num02));
		//System.out.println(solution(num03));
		System.out.println(solution(num04));
	}
	
	public static int solution(int[] array) {
        int answer = 0;
		boolean check = false;
		check = 0 < array.length && array.length < 100;
		if(check) {
			int[] numList = {};
			int x = 0, cnt = 0;
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < numList.length; j++) {
					if(array[i] == numList[j]) {
						cnt++;
					}
				}
				if(cnt == 0) {
					numList = Arrays.copyOf(numList, numList.length + 1);
					numList[numList.length - 1] = array[i];
				}
				cnt = 0;
			}
			
			for(int n : numList) {
				x = 0;
				for(int m : array) {
					if(n == m) {
						x++;
					}
				}
				
				if(cnt < x) {
					answer = n;
					cnt = x;
				} else if ( cnt == x) {
					if(cnt > x) {
						answer = n;
					} else {
						answer = -1;
					}
					cnt = x;
				}
			}
		}
        return answer;
	}
}