package Level2;

import java.util.Arrays;

public class level2_054 {
	//가장 큰 수
	public static void main(String[] args) {
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(int[] numbers) {
        String answer = "";
        Integer[] numArr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(numArr, (x , y) -> {
        	String xStr = String.valueOf(x);
        	String yStr = String.valueOf(y);
        	if(xStr.length() == yStr.length()) {
        		if (x < y) {
                    return -1;
                } else if (x > y) {
                    return 1;
                } else {
                    return 0;
                }
        	} else if(xStr.length() > yStr.length()) {
        		for(int i = 0; i < xStr.length(); i++) {
        			
        		}
        	} else {
        		for(int i = 0; i < xStr.length(); i++) {
        			
        		}
        	}
        });
        
//        Arrays.sort(files, (iStr, jStr) -> {
//        	String[] iStrArr = ((String) iStr).split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
//        	String[] jStrArr = ((String) jStr).split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
//        	int cnt = iStrArr[0].compareToIgnoreCase(jStrArr[0]);
//        	int iNum = iStrArr[1].length() <= 5 ? Integer.valueOf(iStrArr[1]).intValue() : Integer.valueOf(iStrArr[1].substring(0, 5)).intValue();
//			int jNum = jStrArr[1].length() <= 5 ? Integer.valueOf(jStrArr[1]).intValue() : Integer.valueOf(jStrArr[1].substring(0, 5)).intValue();
//        	if (cnt == 0) {
//        		if(iNum == jNum) {
//        			return 0;
//        		}
//                return iNum - jNum;
//            }
//            return cnt;
//        });
        
        
        return answer;
	}
}