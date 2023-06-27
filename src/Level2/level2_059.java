package Level2;

import java.util.Arrays;

public class level2_059 {
	//삼각 달팽이
	public static void main(String[] args) {
		//System.out.println(solution(5));
		System.out.println(Arrays.toString(solution(1)));
	}
	
	public static int[] solution(int n) {
		int[] answer = {};
		int check = 1, cnt = 1, ans = n*(n+1)/2, i = 0, j = 0;
		answer = new int [ans];
		int[][] numArr = new int[n][n];
		if(n == 1) {
			answer[0] = 1;
		} else {
			while(cnt <= ans) {
				numArr[i][j] = cnt;
				if((check - 1) % 3 == 0 && i < n) {
					cnt++;
					i++;
					if(i == n - 1 || numArr[i+1][j] != 0) {
						check++;
					}
				} else if ((check - 2) % 3 == 0 && j < n) {
					cnt++;
					j++;
					if(j == n - 1 || numArr[i][j+1] != 0) {
						check++;
					}
				} else if (check % 3 == 0) {
					cnt++;
					if(numArr[i-1][j-1] == 0) {
						i--;
						j--;
					} else {
						check++;
						i++;
					}
				}
				if (cnt == ans) {
					i--;
					if(numArr[i+1][j] == 0) {
						numArr[i+1][j] = cnt;
					} else if(numArr[i][j+1] == 0) {
						numArr[i][j+1] = cnt;
					} else if(numArr[i+1][j+1] == 0) {
						numArr[i+1][j+1] = cnt;
					}
					cnt++;
				}
			}
			
			cnt = 0;
			for(int k = 0; k < numArr.length; k++) {
				for(int l = 0; l <= k; l++) {
					answer[cnt] = numArr[k][l];
					cnt++;
				}
			}
		}
		
		
		
		
//        int[] answer = {};
//        int[][] numArr = new int[n][n];
//        int x = 0, y = 0, ri = 0, dow = 0;
//        answer = new int[n*(n+1)/2];
//        for(int i = 1; i <= n*(n+1)/2;i++) {
//        	if(x == n) {
//        		dow = 1;
//        		y++;
//        		x--;
//        	}
//        	if(y == n) {
//        		ri = 1;
//        		y--;
//        	}
//        	System.out.println("====================");
//        	System.out.println("x = " + x);
//        	System.out.println("y = " + y);
//        	System.out.println("dow = " + dow);
//        	System.out.println("ri = " + ri);
//        	System.out.println("i = " + i);
//        	if(dow == 0 && x < n) {
//        		numArr[x][y] = i;
//        		x++;
//        	} else if(ri == 0 && y < n) {
//        		System.out.println("3333333");
//        		numArr[x][y] = i;
//        		y++;
//        	} else if(dow == 1 && ri == 1) {
//        		if(numArr[x-1][y-1] == 0) {
//        			x--;
//        			y--;
//        			numArr[x][y] = i; 
//        		} else {
//        			x++;
//        			dow = 0;
//        			ri = 0;
//        		}
//        	}
//        	for(int j = 0;j < numArr.length;j++) {
//        		System.out.println(Arrays.toString(numArr[j]));
//        	}
//        }
        
        return answer;
	}
}