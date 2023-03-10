package Level1;

import java.util.Arrays;

public class level1_064 {
	//[카카오 인턴] 키패드 누르기
	public static void main(String[] args) {
		int[] num = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5, 0};
		System.out.println(solution(num,"right"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(int[] numbers, String hand) {
        String answer = "";
		boolean check = 1 <= numbers.length && numbers.length <= 1000;
		if(check) {
			char[][] chArr = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};
			int[] numArr = {0, 0, 0, 0};
			int leI = 3, leJ = 0, riI = 3, riJ = 2;
			int i = 0, j = 0;
			for(int num : numbers) {
				if(num == 1 || num == 4 || num == 7) {
					switch (num) {
					case 1:
						leI = 0;
						leJ = 0;
						break;
					case 4:
						leI = 1;
						leJ = 0;
						break;
					case 7:
						leI = 2;
						leJ = 0;
						break;
					}
					answer += "L";
				} else if(num == 3 || num == 6 || num == 9) {
					switch (num) {
					case 3:
						riI = 0;
						riJ = 2;
						break;
					case 6:
						riI = 1;
						riJ = 2;
						break;
					case 9:
						riI = 2;
						riJ = 2;
						break;
					}
					answer += "R";
				} else {
					switch (num) {
					case 2:
						i = 0;
						j = 1;
						break;
					case 5:
						i = 1;
						j = 1;
						break;
					case 8:
						i = 2;
						j = 1;
						break;
					case 0:
						i = 3;
						j = 1;
						break;
					}
					
					numArr[0] = Math.abs(i -  leI); 
					numArr[1] = Math.abs(j -  leJ); 
					numArr[2] = Math.abs(i -  riI); 
					numArr[3] = Math.abs(j -  riJ);
					
					if(numArr[0] + numArr[1] < numArr[2] + numArr[3]) {
						answer += "L";
						leI = i;
						leJ = j;
					} else if(numArr[0] + numArr[1] > numArr[2] + numArr[3]) {
						answer += "R";
						riI = i;
						riJ = j;
					} else {
						if(hand.equals("left")) {
							answer += "L";
							leI = i;
							leJ = j;
						} else {
							answer += "R";
							riI = i;
							riJ = j;
						}
					}
				}
			}
		}
        return answer;
	}
}