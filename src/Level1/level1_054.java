package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_054 {
	//[1차] 다트 게임
	public static void main(String[] args) {
		System.out.println(solution("10D4S10D"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String dartResult) {
        int answer = 0;
        char[] ch = dartResult.toCharArray();
        String str = "";
        int x = 0, y = 0, z = 0, cnt = 0;
        for(int i = 0; i < ch.length; i++) {
        	if(Character.isDigit(ch[i])) {
        		str += ch[i];
        		if(i < ch.length - 1 && Character.isDigit(ch[i]) && !Character.isDigit(ch[i + 1])) {
        			cnt++;
        		}
        	} else {
        		if(str != "") {
        			answer = Integer.parseInt(str);
        			str = "";
        		}
        		if(ch[i] == 'S') {
        			if(cnt == 1) {
        				x = (int) Math.pow(answer, 1);
        			} else if(cnt == 2) {
        				y = (int) Math.pow(answer, 1);
        			} else {
        				z = (int) Math.pow(answer, 1);
        			}
        		} else if(ch[i] == 'D') {
        			if(cnt == 1) {
        				x = (int) Math.pow(answer, 2);
        			} else if(cnt == 2) {
        				y = (int) Math.pow(answer, 2);
        			} else {
        				z = (int) Math.pow(answer, 2);
        			}
        		} else if(ch[i] == 'T') {
        			if(cnt == 1) {
        				x = (int) Math.pow(answer, 3);
        			} else if(cnt == 2) {
        				y = (int) Math.pow(answer, 3);
        			} else {
        				z = (int) Math.pow(answer, 3);
        			}
        		} else if(ch[i] == '*') {
        			if(cnt == 1) {
        				x *= 2;
        			} else if(cnt == 2) {
        				x *= 2;
        				y *= 2;
        			} else {
        				y *= 2;
        				z *= 2;
        			}
        		} else if(ch[i] == '#') {
        			if(cnt == 1) {
        				x *= -1;
        			} else if(cnt == 2) {
        				y *= -1;
        			} else {
        				z *= -1;
        			}
        		}
        	}
        }
        answer = x + y + z;
        return answer;
	}
}