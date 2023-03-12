package Level1;

import java.util.Arrays;

public class level1_068 {
	//성격 유형 검사하기
	public static void main(String[] args) {
		//String[] str = {"AN", "CF", "MJ", "RT", "NA"};
		String[] str = {"RT", "TR", "FC"};
		//int[] num = {5, 3, 2, 7, 5};
		int[] num = {1, 2, 5};
		System.out.println(solution(str, num));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String[] survey, int[] choices) {
        String answer = "";
		boolean check = 1 <= survey.length && survey.length <= 1000;
		if(check) {
			int[][] num = {
							{0,0},
							{0,0},
							{0,0},
							{0,0}
						};
			int sum = 0, j = 0, x = 0, y = 0;
			for(int i = 0; i < survey.length; i++) {
				switch (choices[i]) {
				case 1:
					j = 0;
					sum = 3;
					break;
				case 2:
					j = 0;
					sum = 2;
					break;
				case 3:
					j = 0;
					sum = 1;
					break;
				case 5:
					j = 1;
					sum = 1;
					break;
				case 6:
					j = 1;
					sum = 2;
					break;
				case 7:
					j = 1;
					sum = 3;
					break;
				case 4:
					break;
				};
				
				switch (survey[i].charAt(j)) {
				case 'R':
					x = 0;
					y = 0;
					break;
				case 'T':
					x = 0;
					y = 1;
					break;
				case 'C':
					x = 1;
					y = 0;
					break;
				case 'F':
					x = 1;
					y = 1;
					break;
				case 'J':
					x = 2;
					y = 0;
					break;
				case 'M':
					x = 2;
					y = 1;
					break;
				case 'A':
					x = 3;
					y = 0;
					break;
				case 'N':
					x = 3;
					y = 1;
					break;
				}
				num[x][y] += sum; 
			}
			
			for(int k = 0; k < 4;k++) {
				System.out.println(Arrays.toString(num[k]));
				if(num[k][0] < num[k][1]) {
					if(k == 0) {answer += "T";};
					if(k == 1) {answer += "F";};
					if(k == 2) {answer += "M";};
					if(k == 3) {answer += "N";};
				} else {
					if(k == 0) {answer += "R";};
					if(k == 1) {answer += "C";};
					if(k == 2) {answer += "J";};
					if(k == 3) {answer += "A";};
				}
			}
		}
        return answer;
	}
}