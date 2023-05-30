package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class level2_051 {
	//숫자 변환하기
	public static void main(String[] args) {
		System.out.println(solution(2,5,4));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int x, int y, int n) {
		int answer = 0;
		int maxCheck = 0;
		
		List<Long> list01 = new ArrayList<Long>();
		List<Long> list02 = new ArrayList<Long>();
		
		if(x == y) {
			answer = 0;
		} else {
			list01.add((long) y);
			for(int i = 0; i <= list01.size(); i++) {
				maxCheck = 0;
				if(i == list01.size()) {
					i = -1;
					if(maxCheck == list02.size()) {
						answer = -1;
						break;
					}
					list01.clear();
					list01.addAll(list02);
					list02.clear();
					answer++;
				} else {
					if(list01.get(i) - n > x) {
						list02.add(list01.get(i) - n);
					} else if(list01.get(i) - n == x) {
						answer++;
						break;
					} else {
						maxCheck++;
					}
					
					if(list01.get(i) % 2 == 0 && list01.get(i) / 2 > x) {
						list02.add(list01.get(i) / 2);
					} else if(list01.get(i) % 2 == 0 && list01.get(i) / 2 == x) {
						answer++;
						break;
					} else {
						maxCheck++;
					}
					
					if(list01.get(i) % 3 == 0 && list01.get(i) / 3 > x) {
						list02.add(list01.get(i) / 3);
					} else if(list01.get(i) % 3 == 0 && list01.get(i) / 3 == x) {
						answer++;
						break;
					} else {
						maxCheck++;
					}
					
					if(maxCheck == 3) {
						answer = -1;
						break;
					}
				}
			}
		}
		return answer;
		
//		int answer = 0;
//		int maxCheck = 0;
//		
//		List<Long> list01 = new ArrayList<Long>();
//		List<Long> list02 = new ArrayList<Long>();
//		
//		list01.add((long) x);
//		if(x == y) {
//			answer = 0;
//		} else {
//			for(int i = 0; i <= list01.size(); i++) {
//				if(i == list01.size()) {
//					i = -1;
//					if(maxCheck == list02.size()) {
//						answer = -1;
//						break;
//					}
//					list01.clear();
//					list01.addAll(list02);
//					list02.clear();
//					maxCheck = 0;
//					answer++;
//				} else {
//					maxCheck++;
//					if(list01.get(i) + n < y) {
//						list02.add(list01.get(i) + n);
//					} else if(list01.get(i) + n == y) {
//						answer++;
//						break;
//					}
//					
//					if(list01.get(i) * 2 < y) {
//						list02.add(list01.get(i) * 2);
//					} else if(list01.get(i) * 2 == y) {
//						answer++;
//						break;
//					}
//					
//					if(list01.get(i) * 3 < y) {
//						list02.add(list01.get(i) * 3);
//					} else if(list01.get(i) * 3 == y) {
//						answer++;
//						break;
//					}
//				}
//			}
//		}
//		return answer;
		
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