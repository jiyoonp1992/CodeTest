package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level2_030 {
	//전화번호 목록
	public static void main(String[] args) {
		String[] str = {"88","121","1238","1235","567"};
		System.out.println(solution(str));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.asList(phone_book));
        for(int i = 0; i < phone_book.length; i++) {
        	System.out.println(sb);
        }
        return answer;
	}
}