package Level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class level2_044 {
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
	
	public static int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
		m = maps[0].length;

		visited = new boolean[n][m];
		answer = bfs(0, 0, maps);
        return answer;
	}
	public static class Node {
		int x;
		int y;
		int cost;

		public Node(int x, int y, int cost) {
			this.x = x;
			this.y = y;
			this.cost = cost;
		}
	}
	public static int bfs(int x, int y, int[][] maps) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y, 1));
		visited[x][y] = true;

		while (!q.isEmpty()) {
			Node node = q.poll();
			if (node.x == n - 1 && node.y == m - 1) {
				return node.cost;
			}

			for (int i = 0; i < 4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					System.out.println("x = " + node.x);
					System.out.println("y = " + node.y);
					System.out.println("i = " + i);
					System.out.println("dx = " + dx[i]);
					System.out.println("dy = " + dy[i]);
					System.out.println("nx = " + nx);
					System.out.println("ny = " + ny);
					System.out.println("cost = " + node.cost);
					System.out.println("maps = " + Arrays.toString(maps[nx]));
					System.out.println("visited = " + Arrays.toString(visited[nx]));
					System.out.println("----------------");
					if (maps[nx][ny] == 1 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						System.out.println("++++++++++++");
						System.out.println("maps = " + Arrays.toString(maps[nx]));
						System.out.println("visited = " + Arrays.toString(visited[nx]));
						System.out.println("++++++++++++");
						q.offer(new Node(nx, ny, node.cost + 1));
					}
				}
			}
		}
		return -1;
	}
}
