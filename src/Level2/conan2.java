package Level2;

import java.io.DataOutput;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class conan2 {
	public static void main(String[] args) {
		int[] num01 = {3, 2, 4, 8, 7};
		String str = "+82-10-3434-2323";
		System.out.println(solution(str));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String phone_number) {
		int answer = 0;
        int check = 0;
        if(phone_number.length() <= 16 &&  phone_number.length() >= 11){
        	if(phone_number.substring(0, 4).equals("010-")) {
        		check = 1;
        	} else if(phone_number.substring(0, 3).equals("010")) {
        		check = 2;
        	} else if(phone_number.substring(0, 7).equals("+82-10-")) {
        		check = 3;
        	}
        	
        	phone_number = phone_number.replaceAll("[+-]","");
        	
        	if(phone_number.length() == 11 && check == 1){
        		answer = 1;
        	} else if(phone_number.length() == 11 && check == 2){
        		answer = 2;
        	} else if(phone_number.length() == 12 && check == 3){
        		answer = 3;
        	} else {
        		answer = -1;
        	}
        } else {
        	answer = -1;
        }
        
        return answer;
	}
	
	/*
	 * public static int solution(String phone_number) { int answer = 0; int check =
	 * 0; String str = ""; int num = 0; if(phone_number.charAt(0) == '0'){ check =
	 * 2; } else if(phone_number.charAt(0) == '+'){ check = 3; } else
	 * if(phone_number.charAt(3) == '-'){ check = 1; } Arrays.sort(null);
	 * phone_number = phone_number.replaceAll("[+-]",""); str = phone_number; try{
	 * System.out.println(phone_number.substring(0, 4)); Long.parseLong(str);
	 * if(phone_number.length() == 11 && check == 1 && phone_number.substring(0, 3)
	 * == "010"){ answer = 1; } else if(phone_number.length() == 11 && check == 2 &&
	 * phone_number.substring(0, 3) == "010"){ answer = 2; } else
	 * if(phone_number.length() == 12 && check == 3 && phone_number.substring(0,
	 * 4).equals("8210")){ answer = 3; } } catch(Exception e){ answer = -1; }
	 * 
	 * return answer; }
	 */
	
	/*
	 * public static int solution(int n) { int answer = 0; while(n > 0) { answer +=
	 * n %10; n /= 10;
	 * 
	 * if(n == 0 && answer / 10 > 1) { n = answer; answer = 0; } } return answer; }
	 */

}
