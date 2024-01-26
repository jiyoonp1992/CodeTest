package Level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class level2_068_1 {
	//전력망 둘로 나누기
	public static void main(String[] args) {
		int[][] intArr1 = {{1,3}, {2,3}, {3,4}, {4,5}, {4,6}, {4,7}, {7,8}, {7,9}};
		int[][] intArr2 = {{1,2}, {2,7}, {3,7}, {3,4}, {4,5}, {6,7}};
		int[][] intArr3 = {{1,2}, {1,3}, {1,4}};
		int[][] intArr4 = {{1, 2}, {3, 4}, {5, 6}, {1, 3}, {3, 5}};
		//System.out.println(solution(9, intArr1));
		//System.out.println(solution(7, intArr2));
		System.out.println(solution(4, intArr3));
		//System.out.println(solution(6, intArr4));
	}
	
	public static int solution(int n, int[][] wires) {
		int answer = n;
		int len = wires.length - 1;
		Set<Integer> xSet = new HashSet<Integer>();
		Set<Integer> ySet = new HashSet<Integer>();
		for(int i = 0; i <= len; i++) {
			xSet.add(wires[i][0]);
			ySet.add(wires[i][1]);
			for(int j = 0; j <= len; j++) {
				if(i != j && (xSet.contains(wires[j][0]) || xSet.contains(wires[j][1]))) {
					xSet.add(wires[j][0]);
					xSet.add(wires[j][1]);
				};
				if(i != j && (ySet.contains(wires[j][0]) || ySet.contains(wires[j][1]))) {
					ySet.add(wires[j][0]);
					ySet.add(wires[j][1]);
				};
			}
			if(xSet.size() + ySet.size() != n) {
				i--;
			} else {
				answer = Math.min((Math.max(xSet.size(),ySet.size())-Math.min(xSet.size(),ySet.size())), answer); 
				xSet.clear();
				ySet.clear();
			}
		}
		return answer;
	}
	
//	public static int solution(int n, int[][] wires) {
//		int answer = 0;
//		int[] answerArr = new int[n];
//		int std = 0;
//		if(n%2 == 0) {
//			std = n/2;
//		} else {
//			std = n/2 + 1;
//		}
//		int x = 0, y = 0;
//		Set<Integer> xSet = new HashSet<Integer>();
//		Set<Integer> ySet = new HashSet<Integer>();
//		for(int i = 0; i < n - 1; i++) {
//			xSet.add(wires[i][0]);
//			ySet.add(wires[i][1]);
//			for(int j = 1; j < n - 1; j++) {
//				System.out.println("i = "+ Arrays.toString(wires[i]));
//				if(i - j >= 0) {
//					System.out.println("j1 = "+ Arrays.toString(wires[i - j]));
//					if(xSet.contains(wires[i - j][0]) || xSet.contains(wires[i - j][1])) {
//						xSet.add(wires[i - j][0]);
//						xSet.add(wires[i - j][1]);
//					}
//					if(ySet.contains(wires[i - j][0]) || ySet.contains(wires[i - j][1])) {
//						ySet.add(wires[i - j][0]);
//						ySet.add(wires[i - j][1]);
//					}
//				}
//				if(i + j < wires.length) {
//					System.out.println("j2 = "+ Arrays.toString(wires[i + j]));
//					if(xSet.contains(wires[i + j][0]) || xSet.contains(wires[i + j][1])) {
//						xSet.add(wires[i + j][0]);
//						xSet.add(wires[i + j][1]);
//					}
//					if(ySet.contains(wires[i + j][0]) || ySet.contains(wires[i + j][1])) {
//						ySet.add(wires[i + j][0]);
//						ySet.add(wires[i + j][1]);
//					}
//				}
//				System.out.println("xSet = " + xSet);
//				System.out.println("ySet = " + ySet);
//			}
//			xSet.clear();
//			ySet.clear();
//			System.out.println("----------------------------------");
//		}
//		return answer;
//	}
}