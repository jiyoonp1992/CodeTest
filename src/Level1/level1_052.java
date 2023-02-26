package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_052 {
	//소수 만들기
	public static void main(String[] args) {
		int[] num01 = {1,2,3,4};
		System.out.println(solution(num01));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] nums) {
        int answer = 0;
        boolean check = 3 <= nums.length && nums.length <= 50;
        if(check) {
        	int cnt = 0;
        	for(int i = 0; i < nums.length-2;i++) {
        		for(int j = i + 1; j < nums.length -1; j++) {
        			for(int k = j + 1; k < nums.length; k++) {
        				cnt = 0;
        				for(int x = 2; x <= Math.sqrt(nums[i] + nums[j] + nums[k]);x++) {
        					if((nums[i] + nums[j] + nums[k]) % x == 0) {
        						cnt++;
        					}
        				}
        				if(cnt < 1) {
        					answer++;
        				}
        			}
        		}
        	}
        }
        return answer;
	}
}