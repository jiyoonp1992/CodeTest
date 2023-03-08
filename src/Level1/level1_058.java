package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_058 {
	//체육복
	public static void main(String[] args) {
		int[] num01 = {1, 2, 5, 6, 10, 12, 13};
		int[] num02 = {2, 3, 4, 5, 7, 8, 9, 10, 11, 12};
		System.out.println(solution(13, num01,num02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
		boolean check = 2 <= n && n <= 30;
		if(check) {
			int cnt = 0;
			Arrays.sort(lost);
			Arrays.sort(reserve);
			for(int i = 0; i < lost.length; i++) {
				for(int j = 0; j < reserve.length; j++) {
					if(lost[i] == reserve[j]) {
						lost[i] = -1;
						reserve[j] = -1;
						cnt++;
						break;
					}
				}
			}
			System.out.println(Arrays.toString(lost));
			for(int i : lost) {
				for(int k = 0; k < reserve.length; k++) {
					if(i == reserve[k] + 1 || i == reserve[k] - 1) {
						reserve[k] = -1;
						cnt++;
						break;
					}
				}
			}
			answer = n - lost.length + cnt;
		}
        return answer;
	}
}
//5/12/24