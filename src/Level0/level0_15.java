package Level0;

import java.util.Arrays;

public class level0_15 {

	public static void main(String[] args) {
		int[] arList = {1,2,3,4,5};
		int[] arList2 = {};
		int[] arList3 = {1,0,1,1,1,3,5};
		/*
		 * System.out.println(solution(arList)); System.out.println(solution(arList2));
		 * System.out.println(solution(arList3));
		 */
		int cnt = 0;
		cnt = arList.length;
		System.out.println(cnt);
		arList2 = new int[cnt];
    	for(int i = 0; i <= cnt -1 ; i++) {
    		if(0 <= arList[i] && arList[i] <= 1000) {
    			System.out.println(cnt);
    			System.out.println(arList[cnt-1 - i]);
    			System.out.println(arList[i]);
    			arList2[i] = arList[cnt-1 - i]; 
    		}
    		System.out.println("-----------------------------");
    	}
    	System.out.println(Arrays.toString(arList));
    	System.out.println(Arrays.toString(arList2));
    }
	
	
	public static int[] solution(int[] num_list) {
		int[] answer = {};
        int cnt = 0;
        boolean check = false;
        check = 1 <= num_list.length && num_list.length <= 1000;
        if(check) {
        	answer = new int[num_list.length];
        	cnt = num_list.length;
        	for(int i = 0; i <= cnt - 1; i++) {
        		if(0 <= num_list[i] && num_list[i] <= 1000) {
        			answer[i] = num_list[cnt - 1 - i];
        		}
        	}
        }
        return answer;
	}
}
