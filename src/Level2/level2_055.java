package Level2;

import java.util.HashSet;
import java.util.Iterator;

public class level2_055 {
	//소수 찾기
	public static void main(String[] args) {
		System.out.println(solution("123"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	static HashSet<Integer> numberSet = new HashSet<>();
	
	public static boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			return false;
		}
		
		int lim = (int)Math.sqrt(num);
		
		for(int i = 2; i <= lim; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void recursive(String com, String others) {
		if(!com.equals("")) {
			numberSet.add(Integer.valueOf(com));
		}
		
		for(int i = 0; i < others.length(); i++) {
			recursive(com + others.charAt(i), others.substring(0,i) + others.substring(i+1));
		}
	}
	
	public static int solution(String numbers) {
        int answer = 0;
        
        recursive("", numbers);
        
        Iterator<Integer> it = numberSet.iterator();
        while(it.hasNext()) {
        	int number = it.next();
        	if(isPrime(number)) {
        		answer++;
        	}
        }
        return answer;
	}
}