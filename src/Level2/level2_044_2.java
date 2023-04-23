package Level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class level2_044_2 {
	//게임 맵 최단거리
	public static void main(String[] args) {
		int[][] num = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		System.out.println(solution(num));
		//System.out.println(Arrays.toString(solution()));
	}
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { -1, 0, 1, 0 };
	static boolean[][] visited;
	static int n, m;
	static int dfs_answer = -1;
	
	public static int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
		m = maps[0].length;

		visited = new boolean[n][m];
		answer = dfs(0, 0, maps, 1);
        return answer;
	}

	public static int dfs(int x, int y, int[][] maps, int depth) {
		if (x == n - 1 && y == m - 1) {
			if (dfs_answer == -1)
				dfs_answer = depth;
			else
				dfs_answer = dfs_answer > depth ? depth : dfs_answer;
			return dfs_answer;
		}
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
				if (maps[nx][ny] == 1 && !visited[nx][ny]) {
					visited[nx][ny] = true;
					dfs(nx, ny, maps, depth + 1);
					visited[nx][ny] = false;
				}
			}
		}
		
		return dfs_answer;
	}
}
