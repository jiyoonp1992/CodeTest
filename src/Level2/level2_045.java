package Level2;

import java.util.Arrays;

public class level2_045 {
	//모음 사전
	public static void main(String[] args) {
		System.out.println(solution("AAAAE"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	static boolean[] visit = new boolean[5];
	public static int solution(String word) {
        int answer = 0;
        char[] chArr = {'A', 'E', 'I', 'O', 'U'};
//        for(;;) {
//        	
//        }
        answer = dfs(0,word, chArr,0);
        return answer;
	}
	
	public static int dfs(int x, String word, char[] chArr, int depth) {
		StringBuilder sb = new StringBuilder();
		if(sb.equals(word)) {
			return x;
		}
		
			if (!visit[depth] && depth < chArr.length) {
				sb.append(chArr[depth]);
				visit[depth] = true;
				System.out.println(Arrays.toString(visit));
				System.out.println(sb.toString());
				System.out.println("--------------------");
				dfs(depth, word, chArr, depth + 1);
				visit[depth] = false;
				sb.deleteCharAt(sb.length() - 1);
				System.out.println(Arrays.toString(visit));
				System.out.println(sb.toString());
				System.out.println("++++++++++++++++++++");
			}
		return x;
	}
}