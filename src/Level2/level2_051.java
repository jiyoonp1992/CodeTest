package Level2;

import java.util.Arrays;

public class level2_051 {
	//숫자 변환하기
	public static void main(String[] args) {
		System.out.println(solution(2,5,4));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int x, int y, int n) {
		int answer = 0;
		int i = y, j = y, k = y;
		
		if(x == y) {
			answer = 0;
		} else {
			for(;;) {
				if(i > x) {
					i -= n;
				}
				if(y%2 == 0 && j > x) {
					j /= 2;
				}
				if(y%3 == 0 && k > x) {
					k /= 3;
				}
				answer++;
				if(i == x || j == x || k == x) {
					break;
				} else if(i <= x && (y%2 != 0 || j <= x) && (y%3 != 0 || k <= x)) {
					answer = -1;
					break;
				}
			}
		}
		
		return answer;
		
//		int answer = 0;
//		int i = x, j = x, k = x;
//		if(x == y) {
//			answer = 0;
//		} else if((y-x)%n != 0 && (y%x) != 0){
//			answer = -1;
//		} else {
//			for(;i <= y || j <= y || k <= y;) {
//				if(i > y && j > y && k > y) {
//					answer = -1;
//					break;
//				} else if(i >= y || j >= y || k >= y) {
//					break;
//				}
//				answer++;
//				i += n;
//				j *= 2;
//				k *= 3;
//			}
//		}
//		return answer;
		
//        int answer = 0;
//        int i = 1000000, j = 1000000, k = 1000000;
//        answer = 1000000;
//        if((y - x) % n == 0) {
//            i = (y - x)/n;
//        }
//        if((y%x) == 0 && Math.log(y/x)%Math.log(2) == 0 && (Math.log(y/x)/Math.log(2)) == ((int)(Math.log(y/x)/Math.log(2)))){
//        	j = (int) (Math.log(y/x)/Math.log(2));
//        }
//        if((y%x) == 0 && Math.log(y/x)%Math.log(3) == 0 && (Math.log(y/x)/Math.log(3)) == ((int)(Math.log(y/x)/Math.log(3)))){
//        	k = (int) (Math.log(y/x)/Math.log(3));
//        }
//        if(x == y) {
//        	answer = 0;
//        } else {
//        	if(i == 1000000 && j == 1000000 && k == 1000000) {
//        		answer = -1;
//        	} else {
//        		answer = Math.min(i,Math.min(j, k));
//        	}
//        }
//        
//        return answer;
	}
}