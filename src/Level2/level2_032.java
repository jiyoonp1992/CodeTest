package Level2;

import java.util.Arrays;

public class level2_032 {
	//피로도
	public static void main(String[] args) {
		int[][] num01 = {{80,20},{30,10},{50,40}};
		System.out.println(solution(80, num01));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int k, int[][] dungeons) {
        int answer = 0;
        int tk = k;
        int sum = 0;
        sum = permutation(dungeons,0,dungeons.length - 1, tk, sum);
        System.out.println("*********");
        System.out.println(sum);
        System.out.println("*********");
        answer = Math.max(answer, sum);
        return answer;
	}
	
	static int permutation(int[][] arr, int depth, int n, int tk, int sum) {
		if(tk >= arr[depth][0]) {
			tk -= arr[depth][1];
			sum++;
		}
		if(depth == n || tk < arr[depth][0]) {
			return sum;
		}
		
		for(int i = depth; i <= n; i++) {
			swap(arr, depth, i);
			permutation(arr,depth + 1, n, tk, sum);
			swap(arr, depth, i);
		}
		System.out.println("------");
		System.out.println(sum);
		return sum;
	}
	
	static void swap (int[][] arr, int depth, int i) {
		int[] temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
	}
}