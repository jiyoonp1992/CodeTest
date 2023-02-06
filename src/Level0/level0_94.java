package Level0;

import java.util.Arrays;

public class level0_94 {
	//다음에 올 숫자
	public static void main(String[] args) {
		int[] num01 = {1, 2, 3, 4};
		int[] num02 = {2, 4, 8};
		int[] num03 = {2, 0, -2};
		System.out.println(solution(num01));
		System.out.println(solution(num02));
		System.out.println(solution(num03));
	}
	
	public static int solution(int[] common) {
        int answer = 0;
		boolean check = false;
		check = 2 < common.length && common.length < 1000;
		if(check) {
			int x = 0, y= 0;
			for(int i = 0; i < common.length - 2; i++) {
				if(common[i] == 0 || common[i+1] == 0 || common[i+2] == 0) {
					x = common[i+1]-common[i] == common[i+2]-common[i+1]?common[i+1]-common[i]:0; 
				} else {
					x = common[i+1]-common[i] == common[i+2]-common[i+1]?common[i+1]-common[i]:0; 
					y = common[i+1]/common[i] == common[i+2]/common[i+1]?common[i+1]/common[i]:0; 
				}
			}
			answer = (x == 0)?common[common.length - 1] * y:common[common.length - 1] + x;
		}
        return answer;
	}
}