package Level1;

import java.util.Arrays;

public class level1_071 {
	//대충 만든 자판
	public static void main(String[] args) {
		String[] str01 = {"ABCE"};
		String[] str02 = {"ABDE"};
		System.out.println(solution(str01,str02));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        int[] ansNum = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			answer = new int[targets.length];
			for(String str : keymap) {
				for(char i = 65; i <= 90; i++) {
					if(str.contains(String.valueOf((char) i))) {
						if(ansNum[i-65] == 0) {
							ansNum[i-65] = str.indexOf((char) i) + 1;
						} else {
							ansNum[i-65] = Math.min(ansNum[i-65], str.indexOf((char) i) + 1);
						}
					}
				}
			}
			int cnt = 0;
			for(String tarStr : targets) {
				for(int j = 0; j < tarStr.length(); j++) {
					if(ansNum[tarStr.charAt(j)-65] != 0) {
						answer[cnt] += ansNum[tarStr.charAt(j)-65];
					} else {
						answer[cnt] = 0;
						break;
					}
				}
				if(answer[cnt] == 0) {
					answer[cnt] = -1;
				}
				cnt++;
			}
        return answer;
	}
}