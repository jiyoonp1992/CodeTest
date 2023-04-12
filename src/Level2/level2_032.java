package Level2;

import java.util.Arrays;

public class level2_032 {
	//피로도
	public static void main(String[] args) {
		int[][] num01 = {{80,20},{30,10},{50,40}};
		System.out.println(solution(80, num01));
		//System.out.println(Arrays.toString(solution()));
	}
	
//	public static int solution(int k, int[][] dungeons) {
//        int answer = 0;
//        int tk = k;
//        int sum = 0;
//        sum = permutation(dungeons,0,dungeons.length - 1, tk);
//        answer = Math.max(answer, sum);
//        return answer;
//	}
//	
//	public static int permutation(int[][] arr, int depth, int n, int tk) {
//		int totalnum = 0;
//		if (depth == n) { // 하나의 순열이 완성된 경우
//			totalnum = sumTi(arr, tk);
//			return totalnum;
//        } else {
//        	for(int i = depth; i <= n; i++) {
//        		swap(arr, depth, i);
//        		permutation(arr,depth + 1, n, tk);
//        		swap(arr, depth, i);
//        	}
//        }
//		return totalnum;
//	}
//	
//	public static void swap (int[][] arr, int depth, int i) {
//		int[] temp = arr[depth];
//        arr[depth] = arr[i];
//        arr[i] = temp;
//	}
//	
//	public static int sumTi (int[][] arr, int tk) {
//		int num = 0;
//		for (int i = 0; i < arr.length; i++) {
//            if(tk < arr[i][0]) {
//            	break;
//            } else {
//            	tk -= arr[i][1];
//            	num++;
//            }
//        }
//		return num;
//	}
	public static int solution(int k, int[][] dungeons) {
        int answer = 0;
        int tk = k;
        int sum = 0;
        sum = permutation(dungeons,0,dungeons.length - 1, tk);
        answer = Math.max(answer, sum);
        return answer;
	}
	
	public static int permutation(int[][] arr, int depth, int n, int tk) {
		int totalnum = 0;
		if (depth == n) { // 하나의 순열이 완성된 경우
			totalnum = sumTi(arr, tk);
			return totalnum;
        } else {
        	for(int i = depth; i <= n; i++) {
        		swap(arr, depth, i);
        		totalnum = Math.max(totalnum, permutation(arr,depth + 1, n, tk));
        		swap(arr, depth, i);
        	}
        }
		return totalnum;
	}
	
	public static void swap (int[][] arr, int depth, int i) {
		int[] temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
	}
	
	public static int sumTi (int[][] arr, int tk) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
            if(tk < arr[i][0]) {
            	break;
            } else {
            	tk -= arr[i][1];
            	num++;
            }
        }
		return num;
	}
}