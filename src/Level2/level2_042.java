package Level2;

import java.util.Arrays;

public class level2_042 {
	//덧칠하기
	public static void main(String[] args) {
		int[] num = {2,3,6};
		System.out.println(solution(8,4,num));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int n, int m, int[] section) {
//		int answer = 0;
//        double num = 0;
//        if(m == 1){
//            answer = section.length;
//        } else {
//            num = section[section.length - 1] - section[0] + 1;
//            answer = (int) Math.ceil(num / m);
//        }
//        return answer;
		
		int answer = 0;
        if(m == 1){
            answer = section.length;
        } else {
            for(int i = 0; i < section.length;){
            	int j = i + 1;
            	for(; j < section.length;j++) {
            		if(m < section[j] - section[i] + 1) {
            			answer++;
            			i = j;
            		}
            	}
            	if(m >= section[j - 1] - section[i] + 1 && j == section.length) {
        			answer++;
        			break;
        		}
            }
        }
        return answer;
	}
}