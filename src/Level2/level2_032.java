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
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
        return answer;
	}
}