package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level2_035 {
	//[3차] n진수 게임
	public static void main(String[] args) {
		//System.out.println(solution(10,30,2,2));
//		System.out.println(solution(11,30,2,2));
//		System.out.println(solution(12,30,2,2));
//		System.out.println(solution(13,30,2,2));
//		System.out.println(solution(14,30,2,2));
//		System.out.println(solution(15,30,2,2));
		System.out.println(solution(15,100,10,2));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static String solution(int n, int t, int m, int p) {
//        String answer = "";
//        StringBuilder sb01 = new StringBuilder();
//        int x = 0;
//        for(int i = 0;i >= 0;i++) {
////        	if(n >= 11) {
////        		if(10 <= i%n && i%n <= 15) {
////        			sb01.append(String.valueOf(((char)(55+i))));
////            	} else {
////            		sb01.append(Integer.toString(i,n));
////            	}
////        	} else {
////        		sb01.append(Integer.toString(i,n));
////        	}
//        	x = i%n;
////        	if(10 <= x && x <= 15) {
////        		sb01.append(String.valueOf(((char)('A'+x%10))));
////        	} else {
//            	sb01.append(Integer.toString(i,n));
//        	//}
//        	if(sb01.length() > t * m + 1) {
//        		break;
//        	}
//        	String str01 = sb01.toString();
//        	str01 = str01.toUpperCase();
//        	System.out.println("sb01 = " + str01);
//        	System.out.println("sb01 = " + sb01);
//        }
//        
//        String s = getArithmeticString(n, t, m);
//        StringBuilder sb = new StringBuilder();
//
//        int order = 1;
//        for (int i = 0; i < sb.length(); i++) {
//            if (sb.length() == t)
//                break;
//            if (order > m) {
//                order = 1;
//            }
//            if (order == p) {
//                sb.append(s.charAt(i));
//            }
//            order++;
//        }
//        
//        
//        String str = sb.toString();
////        for(int j = p - 1; t > answer.length(); j += p) {
////        	if(p == 1) {
////        		p = 2;
////        	}
////        	//answer += str.charAt(j);
////        }
//        return answer;
//	}
//	
//	private static String getArithmeticString(int n, int t, int m) {
//		String[] str = {"A", "B", "C", "D", "E", "F"};
//        StringBuilder sb = new StringBuilder("0");
//        StringBuilder s;
//        for (int i = 1; i <= t * m; i++) {
//            s = new StringBuilder();
//            int tmp = i;
//            while (tmp > 0) {
//                int x = tmp % n;
//                if (x == 10) {
//                    s.append(str[0]);
//                } else if (x == 11) {
//                    s.append(str[1]);
//                } else if (x == 12) {
//                    s.append(str[2]);
//                } else if (x == 13) {
//                    s.append(str[3]);
//                } else if (x == 14) {
//                    s.append(str[4]);
//                } else if (x == 15) {
//                    s.append(str[5]);
//                } else {
//                    s.append(x);
//                }
//                tmp /= n;
//                System.out.println(s);
//            }
//
//            sb.append(s.reverse());
//            System.out.println("sb02 = " + sb);
//        }
//
//        return sb.toString();
		
		String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i >= 0;i++) {
            sb.append(Integer.toString(i,n));
        	
        	if(sb.length() > t * m + 1) {
        		break;
        	}
        }
        
        String str = sb.toString().toUpperCase();
        for(int j = p - 1; t > answer.length(); j += m) {
        	if(m == 1) {
        		m = 2;
        	}
        	answer += str.charAt(j);
        }
        return answer;
	}
}