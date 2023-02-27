package Level1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.*;

public class level1_053 {
	//실패율
	public static void main(String[] args) {
		//int[] num01 = {2, 1, 2, 6, 2, 4, 3, 3};
		//int[] num01 = {3,3,3,3,3};
		int[] num01 = {2, 1, 2, 6, 2, 4, 3, 3};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(5, num01)));
	}
	
	public static int[] solution(int N, int[] stages) {
		int[] answer = {};
	    double[] failureRates = new double[N];

	    int numOfPlayers = stages.length;

	    for (int i = 1; i <= N; i++) {
	        int numOfUnsolvedPlayers = 0;
	        for (int j = 0; j < stages.length; j++) {
	            if (stages[j] == i) {
	                numOfUnsolvedPlayers++;
	            }
	        }

	        if (numOfUnsolvedPlayers == 0) {
	            failureRates[i - 1] = 0;
	        } else {
	            failureRates[i - 1] = (double) numOfUnsolvedPlayers / numOfPlayers;
	        }

	        numOfPlayers -= numOfUnsolvedPlayers;
	    }

	    // failureRates를 내림차순으로 정렬하여 answer 배열에 넣어줌
	    answer = IntStream.range(0, N)
	                      .boxed()
	                      .sorted((i, j) -> Double.compare(failureRates[j], failureRates[i]))
	                      .mapToInt(i -> i + 1)
	                      .toArray();

	    return answer;
	}
	
	
//	public static int[] solution(int N, int[] stages) {
//		int[] answer = {};
//		double[] chAnswer = {};
//		String[] strArr = {};
//		chAnswer = new double[N];
//		strArr = new String[N];
//		answer = new int[N];
//		for(int i : stages) {
//			if(i <= N) {
//					chAnswer[i-1]++;
//				}
//		}
//		
//		int x = stages.length, y = x;
//		
//		for(int i = 0; i < N; i++) {
//			y -= chAnswer[i];
//			if(chAnswer[i] != 0) {
//				chAnswer[i] /= x;
//				strArr[i] = String.valueOf(chAnswer[i]); 
//			} else {
//				chAnswer[i] = 0;
//				strArr[i] = String.valueOf(chAnswer[i]); 
//			}
//			x = y;
//		}
//		
//		String[] arr =  Arrays.copyOf(strArr, strArr.length);
//		Arrays.sort(arr, Collections.reverseOrder());
//		//String[] strArr =  Arrays.stream(chAnswer).mapToObj(String::valueOf).toArray(String[]::new);
//		int n = 0;
//		for(String s : arr) {
//			for(int m = 0; m < chAnswer.length; m++) {
//				if(s.equals(strArr[m])) {
//					answer[n] = m + 1;
//					strArr[m] = "-1";
//					n++;
//					break;
//				}
//			}
//		}
//		return answer;
//	}
}