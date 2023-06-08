package Level2;

import java.math.BigInteger;
import java.util.Arrays;

public class level2_054 {
	//가장 큰 수
	public static void main(String[] args) {
		int[] str = {1, 10, 100, 1000, 818, 81, 898, 89, 0, 0};
		System.out.println(solution(str));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(int[] numbers) {
        String answer = "";
        String[] strArr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(strArr, (x , y) -> {
//        	if((x + y).compareTo(y + x) < 0) {
//        		return 1;
//        	} else {
//        		return -1;
//        	}
        	return (y+x).compareTo(x+y);
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strArr.length; i++) {
        	sb.append(strArr[i]);
        }
        answer = String.valueOf(sb);
        if(answer.charAt(0) == '0') {
        	answer = "0";
        }
        return answer;
		
		
//        String answer = "";
//        String[] strArr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
//        Arrays.sort(strArr, (x , y) -> {
//        	if(x.length() == y.length()) {
//        		if(x.compareTo(y) <= 0) {
//        			return 1;
//        		} else {
//        			return -1;
//        		}
//        	} else if(x.length() > y.length()) {
//        		if((x.substring(0, y.length())).compareTo(y) == 0) {
//        			if((x.substring(y.length(), x.length())).length() > y.length()){
//        				if((x.substring(y.length(), y.length() + y.length())).compareTo(y) <= 0) {
//        					return 1;
//        				} else {
//        					return -1;
//        				}
//        			} else {
//        				for(int i = 0; i < (x.substring(y.length(), x.length())).length();i++) {
//        					if((x.substring(y.length(), x.length())).charAt(i) < y.charAt(i)) {
//        						return 1;
//            				} else if ((x.substring(y.length(), x.length())).charAt(i) > y.charAt(i)) {
//            					return -1;
//        					}
//        				}
//        				return 0;
//        			}
//        		} else if((x.substring(0, y.length())).compareTo(y) < 0) {
//        			return 1;
//        		} else {
//        			return -1;
//        		}
//        	} else {
//        		if((y.substring(0, x.length())).compareTo(x) == 0) {
//        			if((y.substring(x.length(), y.length())).length() > x.length()){
//        				if((y.substring(x.length(), x.length() + x.length())).compareTo(x) <= 0) {
//        					return -1;
//        				} else {
//        					return 1;
//        				}
//        			} else {
//        				for(int i = 0; i < (x.substring(y.length(), x.length())).length();i++) {
//        					if((x.substring(y.length(), x.length())).charAt(i) < y.charAt(i)) {
//        						return 1;
//            				} else if ((x.substring(y.length(), x.length())).charAt(i) > y.charAt(i)) {
//            					return -1;
//        					}
//        				}
//        				return 0;
//        			}
//        		} else if((y.substring(0, x.length())).compareTo(x) < 0) {
//        			return -1;
//        		} else {
//        			return 1;
//        		}
//        	}
//        });
//        answer = Arrays.toString(strArr).replace("[", "").replace("]", "").replace(", ", "");
//        if(Integer.valueOf(answer).intValue() == 0) {
//        	answer = "0";
//        }
//        return answer;
		
//        String answer = "";
//        Integer[] numArr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
//        String[] strArr1 = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
//        Arrays.sort(numArr, (x , y) -> {
//        	System.out.println(Arrays.toString(numArr));
//        	String xStr = String.valueOf(x);
//        	String yStr = String.valueOf(y);
//        	System.out.println(xStr);
//        	System.out.println(yStr);
//        	if((xStr + yStr).compareTo(yStr + xStr) < 0) {
//        		return 1;
//        	} else {
//        		return -1;
//        	}
//        });
//        Arrays.sort(strArr, (x , y) -> {
//        	if((x + y).compareTo(y + x) <= 0) {
//        		return 1;
//        	} else {
//        		return -1;
//        	}
//        });
//        answer = Arrays.toString(strArr).replace("[", "").replace("]", "").replace(", ", "");
//        if(Integer.valueOf(answer).intValue() == 0) {
//        	answer = "0";
//        }
//        return answer;
        }
	}
