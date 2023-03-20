package Level2;

import java.util.Arrays;

public class level2_008 {
	//다음 큰 숫자
	public static void main(String[] args) {
		System.out.println(solution(15));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n) {
		//시간초과
//        int answer = 0;
//        String[] strArr01 = {}, strArr02 = {};
//        Integer.bitCount(1);
//        strArr01 = Integer.toBinaryString(n).split("");
//        for(int i = n + 1; ;i++) {
//        	strArr02 = Integer.toBinaryString(i).split("");
//        	if(Arrays.stream(strArr01).filter(m -> m.equals("1")).count() == Arrays.stream(strArr02).filter(k -> k.equals("1")).count()) {
//        		answer = i;
//        		break;
//        	}
//        }
        
        int answer = 0;
        int cnt = Integer.bitCount(n);
        for(int i = n + 1; ;i++) {
        	if(cnt == Integer.bitCount(i)) {
        		answer = i;
        		break;
        	}
        }
        return answer;
	}
}