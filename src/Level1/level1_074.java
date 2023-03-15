package Level1;

import java.util.Arrays;

public class level1_074 {
	//바탕화면 정리
	public static void main(String[] args) {
		//String[] str = {".#...", "..#..", "...#."};
		//String[] str = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
		String[] str = {"#.", "#."};
		//System.out.println(solution(str));
		System.out.println(Arrays.toString(solution(str)));
	}
	
	public static int[] solution(String[] wallpaper) {
        int[] answer = {};
			answer = new int [4];
			answer[0] = wallpaper.length + 1;
			answer[1] = wallpaper.length + 1;
			int x = 0, y = 0;
			for(int i = 0; i < wallpaper.length; i++) {
				if(wallpaper[i].contains("#")) {
					x = i;
					y = wallpaper[i].indexOf('#');
					answer[0] = Math.min(answer[0], x);
					answer[1] = Math.min(answer[1], y);
					answer[2] = Math.max(answer[2], x + 1);
					answer[3] = Math.max(answer[3], y + 1);
					wallpaper[i] = wallpaper[i].replaceFirst("#", ".");
					i--;
				}
			}
			if(answer[0] == wallpaper.length + 1 && answer[1] == wallpaper.length + 1 ) {
				answer[0] = 0;
				answer[1] = 0;
			}
        return answer;
	}
}