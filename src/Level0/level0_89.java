package Level0;

import java.util.Arrays;

public class level0_89 {
	//특이한 정렬
	public static void main(String[] args) {
		int[] num01 = {1, 2, 3, 4, 5, 6};
		int[] num02 = {10000,20,36,47,40,6,10,7000};
		int[] num03 = {600, 400, 300, 200, 700, 800, 100, 900};
		int[] num04 = {4, 6, 7, 8, 9};
		//System.out.println(Arrays.toString(solution(num01, 4)));
		//System.out.println(Arrays.toString(solution(num02, 30)));
		System.out.println(Arrays.toString(solution(num03, 500)));
		//System.out.println(Arrays.toString(solution(num04, 5)));
	}
	
	public static int[] solution(int[] numlist, int n) {
        int[] answer = {};
		boolean check = false;
		check = 1 <= n && n <= 10000 && 1 <= numlist.length && numlist.length <= 100;
		if(check) {
			answer = new int[numlist.length];
			int max = 0, num = 0;
			for(int i = 0; i < numlist.length; i++) {
				max = 0;
				for(int j = 0; j < numlist.length; j++) {
					if(numlist[i] >= n && numlist[j] >= n) {
						if(numlist[i] - n > numlist[j] - n) {
							if(i < j) {
								max = numlist[j];
								numlist[j] = numlist[i];
								numlist[i] = max;
							}
						}
					} else if (numlist[i] < n || numlist[j] < n) {
						if(Math.abs(numlist[i] - n) > Math.abs(numlist[j] - n)) {
							if(i < j) {
								max = numlist[j];
								numlist[j] = numlist[i];
								numlist[i] = max;
							}
						} else if(Math.abs(numlist[i] - n) == Math.abs(numlist[j] - n)) {
							if(numlist[i] > numlist[j]) {
								if(i > j) {
									max = numlist[i];
									numlist[i] = numlist[j];
									numlist[j] = max;									
								}
							} else if (numlist[i] < numlist[j]) {
								if(i < j) {
									max = numlist[j];
									numlist[j] = numlist[i];
									numlist[i] = max;
								}
							}
						}
					} else {
						if(Math.abs(numlist[i] - n) > Math.abs(numlist[j] - n)) {
							if(i < j) {
								max = numlist[j];
								numlist[j] = numlist[i];
								numlist[i] = max;
							}
						}
					}
				}
				answer = numlist;
			}
		}
        return answer;
	}
}