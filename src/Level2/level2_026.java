package Level2;

import java.util.Arrays;

public class level2_026 {
	//기능개발
	public static void main(String[] args) {
		//int[] num01 = {93, 30, 55};
		//int[] num02 = {1, 30, 5};
		int[] num01 = {99, 99, 99, 90, 90, 90};
		int[] num02 = {1,1,1,1,1,1};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num01, num02)));
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int num = 0, day = 0, cnt = 0;
        answer = new int[1];
        for(int i = 0; i < progresses.length; i++) {
        	if(i == 0) {
        		day = 100 - progresses[i];
        		if(day % speeds[i] == 0) {
        			day = day / speeds[i];
        		} else {
        			day = day / speeds[i] + 1;
        		}
        		answer[cnt]++;
        	} else {
        		num = 100 - progresses[i];
        		if(num % speeds[i] == 0) {
        			num = num / speeds[i];
        		} else {
        			num = num / speeds[i] + 1;
        		}
        		
        		if(day >= num) {
        			answer[cnt]++;
        		} else {
        			day = num;
            		answer = Arrays.copyOf(answer, answer.length + 1);
            		cnt++;
            		answer[cnt]++;
        		}
        	}
        }
        return answer;
	}
}