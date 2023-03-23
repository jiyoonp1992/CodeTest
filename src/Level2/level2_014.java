package Level2;

import java.util.Arrays;

public class level2_014 {
	//점프와 순간 이동
	public static void main(String[] args) {
		System.out.println(solution(5000));
		System.out.println(solution(5));
		System.out.println(solution(6));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n) {
        int ans = 0;
        for(;n>0;) {
        	if(n % 2 != 0) {
        		ans++;
        		n--;
        	}
        	n /= 2;
        }
        return ans;
	}
}