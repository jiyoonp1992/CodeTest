package Level0;

import java.util.Arrays;

public class level0_66 {
	//k의 개수
	public static void main(String[] args) {
		System.out.println(solution(1,13,1));
		System.out.println(solution(10,50,5));
		System.out.println(solution(3,10,2));
	}
	
	public static int solution(int i, int j, int k) {
        int answer = 0;
		boolean check = false;
		check = 1 <= i && i < j && j <= 100000 && 0 <= k && k <= 9;
		if(check) {
			for(int s = i; s <= j; s++) {
				String str = String.valueOf(s);
				for(int num = 0; num < str.length(); num++) {
					if(Character.getNumericValue(str.charAt(num)) == k) {
						answer++;
					}
				}
			}
		}
        return answer;
	}
}