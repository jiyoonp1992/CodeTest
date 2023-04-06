package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level2_030 {
	//전화번호 목록
	public static void main(String[] args) {
		//String[] str = {"88","121","1238","1235","567"};
		String[] str = {"123", "456", "4567", "999"};
		System.out.println(solution(str));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static boolean solution(String[] phone_book) {
//		boolean answer = true;
//        Arrays.sort(phone_book);
//        List<String> list = new ArrayList<String>(Arrays.asList(phone_book));
//        StringBuilder sb = new StringBuilder();
//        sb.append(list);
//        for(int i = 0; i < list.size(); i++) {
//        	if(sb.indexOf(" " + list.get(i)) != -1) {
//        		answer = false;
//        		break;
//        	}
//        }
//        return answer;
        boolean answer = true;
        Arrays.sort(phone_book);
        List<String> list = new ArrayList<String>(Arrays.asList(phone_book));
        StringBuilder sb = new StringBuilder();
        String str = "";
        for(int i = 0; i < list.size();) {
        	str = " " + list.get(i);
        	list.remove(i);
        	sb.append(list).replace(0, 1, " ");
        	if(sb.indexOf(str) != -1) {
        		answer = false;
        		break;
        	} else {
        		sb.delete(0, sb.length());
        	}
        }
        return answer;
	}
}