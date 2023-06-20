package Level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class level2_057 {
	//큰 수 만들기
	public static void main(String[] args) {
		System.out.println(solution("54321", 2));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(String number, int k) {
		String answer = "";
		String[] strArr = {};
		StringBuffer sb = new StringBuffer();
		strArr = number.substring(0,k + 1).split("");
		Arrays.sort(strArr);
		if(strArr.length != 1) {
			answer = number.substring(number.indexOf(strArr[strArr.length - 1]), number.indexOf(strArr[strArr.length - 1]) + 1);
			sb.append(number.substring(number.indexOf(strArr[strArr.length - 1]), number.indexOf(strArr[strArr.length - 1]) + 1));
			k = k - number.indexOf(strArr[strArr.length - 1]); 
			sb.append(number.substring(number.indexOf(strArr[strArr.length - 1]) + 1));
		} else {
			sb.append(number);
		}
		int sumCnt = 0;
		boolean st = answer.length() == (sb.length() - k) ? false : true;
		while(st) {
			System.out.println(sb);
			if(k == 0 || sb.length() == k) {
				answer = sb.toString();
				st = false;
				break;
			}
			if(sumCnt == number.length()) {
				answer = sb.substring(0, sb.length()-k);
				st = false;
				break;
			}
			
			for(int i = 0; i < sb.length(); i++) {
				if(i < sb.length() - 1) {
					if(sb.charAt(i) < sb.charAt(i + 1)) {
						sb.deleteCharAt(i);
						k--;
						i--;
						sumCnt = 0;
					} else if(sb.charAt(i) > sb.charAt(i + 1)) {
						if(i < sb.length() - 2) {
							if(sb.charAt(i + 1) < sb.charAt(i + 2)) {
								sumCnt = 0;
								sb.deleteCharAt(i + 1);
								k--;
								i--;
							}
						} else if(k == 1 && sb.charAt(i) > sb.charAt(i + 1)) {
							sumCnt = 0;
							sb.deleteCharAt(i + 1);
							k--;
						}
					} else {
						sumCnt++;
					}
				}
			}
		}
		
//		StringBuffer sb = new StringBuffer();
//		boolean st = sb.length() == (number.length() - k) ? false : true;
//		while(st) {
//			for(int i = 0; i < number.length(); i++) {
//				if(i < number.length() - 1) {
//					if(sb.charAt(i) < sb.charAt(i + 1)) {
//						sb.deleteCharAt(i);
//						k--;
//						i--;
//						sumCnt = 0;
//					} else if(sb.charAt(i) > sb.charAt(i + 1)) {
//						if(i < sb.length() - 2) {
//							if(sb.charAt(i + 1) < sb.charAt(i + 2)) {
//								sumCnt = 0;
//								sb.deleteCharAt(i + 1);
//								k--;
//								i--;
//							}
//						} else if(k == 1 && sb.charAt(i) > sb.charAt(i + 1)) {
//							sumCnt = 0;
//							sb.deleteCharAt(i + 1);
//							k--;
//						}
//					} else {
//						sumCnt++;
//					}
//				}
//				if(k == 0) {
//					answer = sb.toString();
//					st = false;
//					break;
//				}
//				if(sumCnt == number.length()) {
//					answer = sb.substring(0, sb.length()-k);
//					st = false;
//					break;
//				}
//			}
//		}
		
//        String answer = "";
//        List<Integer> list = new LinkedList<>();
//        list = number.chars().map(Character::getNumericValue).boxed().collect(Collectors.toList());
//        int cnt = number.length() - k, bfSize = list.size();
//        
//        for(int i = 1; i < list.size(); i++) {
//        	if(list.get(i - 1) < list.get(i)) {
//        		list.remove(i - 1);
//        		i--;
//        	} else if(i + 1 == list.size() && list.get(i - 1) > list.get(i)) {
//        		list.remove(i);
//        		i--;
//        	}
//        	System.out.println(list);
//        	System.out.println(cnt);
//        	System.out.println(i+1);
//        	System.out.println(list.size());
//        	if(i + 1 == list.size() && cnt != list.size()) {
//        		i = 0;
//        	} else if (i + 1 == list.size() && cnt == list.size()) {
//        		answer = list.stream()
//                        .map(String::valueOf)
//                        .collect(Collectors.joining());
//        		break;
//        	}
//        	bfSize = list.size();
//        }
		
//        int index = 0;
//        while (k >= 1) {
//        	index = maxNum(number, k);
//        	if(k > 1) {
//        		answer += number.substring(index, index+1);
//        		number = number.substring(index+1);
//        	} else if(k == 1){
//        		number = number.substring(0, index) + number.substring(index + 1);
//        		k--;
//        	}
//        	k -= index;
//		}
//        answer += number;
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
