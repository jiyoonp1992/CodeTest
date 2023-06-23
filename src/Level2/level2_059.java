package Level2;

import java.util.Arrays;

public class level2_059 {
	//삼각 달팽이
	public static void main(String[] args) {
		System.out.println(solution(4));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int[] solution(int n) {
        int[] answer = {};
        int[][] numArr = new int[n][n];
        int x = 0, y = 0, ri = 0, dow = 0;
        answer = new int[n*(n+1)/2];
        for(int i = 1; i <= n*(n+1)/2;i++) {
        	if(x == n) {
        		dow = 1;
        		y++;
        		x--;
        	}
        	if(y == n) {
        		ri = 1;
        		y--;
        	}
        	System.out.println("====================");
        	System.out.println("x = " + x);
        	System.out.println("y = " + y);
        	System.out.println("dow = " + dow);
        	System.out.println("ri = " + ri);
        	System.out.println("i = " + i);
        	if(dow == 0 && x < n) {
        		numArr[x][y] = i;
        		x++;
        	} else if(ri == 0 && y < n) {
        		System.out.println("3333333");
        		numArr[x][y] = i;
        		y++;
        	} else if(dow == 1 && ri == 1) {
        		if(numArr[x-1][y-1] == 0) {
        			x--;
        			y--;
        			numArr[x][y] = i; 
        		} else {
        			x++;
        			dow = 0;
        			ri = 0;
        		}
        	}
        	for(int j = 0;j < numArr.length;j++) {
        		System.out.println(Arrays.toString(numArr[j]));
        	}
        }
        
        return answer;
	}
}