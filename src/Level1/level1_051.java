package Level1;

import java.util.Arrays;
import java.util.*;

public class level1_051 {
	//모의고사
	public static void main(String[] args) {
		//int[] num01 = {1,3,2,4,2,1,3,2,4,2,1,3,2,4,2};
		int[] num01 = {1,1,1,1,1,1,1,1,1,1,1,1};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num01)));
	}
	
	public static int[] solution(int[] answers) {
        int[] answer = {};
        int[][] stu = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int x = 0, y = 0, z = 0;
        	for(int i = 0; i < answers.length; i++) {
        		if(i < stu[0].length) {
        			x = answers[i] == stu[0][i] ? ++x:x;
        		} else {
        			x = answers[i] == stu[0][i-stu[0].length * (i / stu[0].length)] ? ++x:x;
        		}
        		if(i < stu[1].length) {
        			y = answers[i] == stu[1][i] ? ++y:y;
        		} else {
        			y = answers[i] == stu[1][i-stu[1].length * (i / stu[1].length)] ? ++y:y;
        		}
        		if(i < stu[2].length) {
        			z = answers[i] == stu[2][i] ? ++z:z;
        		} else {
        			z = answers[i] == stu[2][i-stu[2].length * (i / stu[2].length)] ? ++z:z;
        		}
        	}
        
        if(x == 0 && y == 0 && z == 0) {
        	answer = answer;
        } else if(x == y && y == z) {
        	answer = new int[] {1,2,3};
        } else if(x == y && x > z) {
        	answer = new int[] {1,2};
        } else if(x == z && x > y) {
        	answer = new int[] {1,3};
        } else if(y == z && y > x) {
        	answer = new int[] {2,3};
        } else if(x > y && x > z) {
        	answer = new int[] {1};
        } else if(y > x && y > z) {
        	answer = new int[] {2};
        } else if(z > y && z > x) {
        	answer = new int[] {3};
        }
        return answer;
	}
}