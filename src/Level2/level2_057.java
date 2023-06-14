package Level2;

import java.util.Arrays;

public class level2_057 {
	//큰 수 만들기
	public static void main(String[] args) {
		System.out.println(solution("4177252841", 4));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String number, int k) {
        String answer = "";
        int index = 0;
        while (k >= 1) {
        	index = maxNum(number, k);
        	if(k > 1) {
        		answer += number.substring(index, index+1);
        		number = number.substring(index+1);
        	} else if(k == 1){
        		number = number.substring(0, index) + number.substring(index + 1);
        		k--;
        	}
        	k -= index;
		}
        answer += number;
        return answer;
	}
	
	public static int maxNum(String numStr, int x){
		String[] numArr = {};
		if(x != 1) {
			numArr = numStr.substring(0, x).split("");
		} else {
			numArr = numStr.split("");
		}
        Arrays.sort(numArr);
        if(x != 1) {
        	x = numStr.indexOf(numArr[numArr.length-1]);
        } else {
        	x = numStr.indexOf(numArr[0]);
        }
        return x;
    }
}