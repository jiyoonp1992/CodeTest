package Level2;

import java.util.Arrays;

public class level2_012 {
	//구명보트
	public static void main(String[] args) {
		int[] num01 = {70, 50, 80, 50};
		System.out.println(solution(num01, 100));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int cnt = 0;
        for(int i = people.length - 1; i >= 0; i--) {
        	if(people[i] == limit) {
        		answer++;
        	} else if (people[i] + people[cnt] <= limit) {
        		cnt++;
        		answer++;
        	} else if (people[i] < limit) {
        		answer++;
        	}
        	
        	if(i <= cnt) {
        		break;
        	}
        }
        return answer;
	}
}