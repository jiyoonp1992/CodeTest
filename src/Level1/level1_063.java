package Level1;

import java.util.Arrays;

public class level1_063 {
	//카드 뭉치
	public static void main(String[] args) {
		String[] str01 = {"a", "b", "c"};
		String[] str02 = {"d", "e"};
		String[] str03 = {"b", "c", "d", "e"};
		System.out.println(solution(str01,str02,str03));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
		boolean check = 1 <= cards1.length && cards1.length <= 10 && 1 <= cards2.length && cards2.length <= 10;
		if(check) {
			int x = 0, y = 0, cnt = 0;
			for(int i = 0; i < goal.length; i++) {
				if(x < cards1.length && goal[i].equals(cards1[x])) {
					x++;
					cnt++;
				}
				if(y < cards2.length && goal[i].equals(cards2[y])) {
					y++;
					cnt++;
				}
			}
			
			if(x == cards1.length && y == cards2.length || cnt == goal.length) {
				answer = "Yes";
			} else {
				answer = "No";
			}
		}
        return answer;
	}
}