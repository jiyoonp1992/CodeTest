package Level1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class level1_048 {
	//폰켓몬
	public static void main(String[] args) {
		int[] num01 = {3,1,2,3};
		System.out.println(solution(num01));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] nums) {
        int answer = 0;
		boolean check = 1 <= nums.length && nums.length <= 10000;
		if(check) {
			int k = (int) Arrays.stream(nums).distinct().count();
			if(nums.length / 2 <= k) {
				answer = nums.length / 2;
			} else {
				answer = k;
			}
		}
        return answer;
	}
}