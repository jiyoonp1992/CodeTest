package Level1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.*;

public class level1_050_1 {
	//소수 찾기
	public static void main(String[] args) {
		//System.out.println(solution(10));
		System.out.println(solution(1000));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n) {
        int answer = 0;
		boolean check = 2 <= n && n <= 1000000;
		if(check) {
			int[] num = IntStream.range(0, n + 1).toArray();
			num[1] = 0;
			for(int i = 2; i <= n; i++) {
				if(num[i] == 0) {
					continue;
				}
				for(int j = i * 2;j <= n; j+=i) {
					num[j] = 0;
				}
			}
			answer = (int) Arrays.stream(num).distinct().count() - 1;
		}
        return answer;
	}
}