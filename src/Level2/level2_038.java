package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class level2_038 {
	//오픈채팅방
	public static void main(String[] args) {
		String[] str = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(str)));
	}
	
	public static String[] solution(String[] record) {
        String[] answer = {};
        Map<String, String> mapID = new HashMap<>();
        List<String> list = new ArrayList<>();
        String[] strArr = {};
        for(String str : record) {
        	strArr = str.split(" ");
        	System.out.println(Arrays.toString(strArr));
        	if(strArr[0].equals("Enter")) {
        		mapID.put(strArr[1], strArr[2]);
        		list.add(strArr[1] + "님이 들어왔습니다.");
        		//list.add(strArr[1] + "/님이 들어왔습니다.");
        	} else if (strArr[0].equals("Leave")){
        		list.add(strArr[1] + "님이 나갔습니다.");
        		//list.add(strArr[1] + "/님이 나갔습니다.");
        	} else {
        		mapID.put(strArr[1], strArr[2]);
        	}
        }
        answer = new String[list.size()];
        String tempID = "";
        int cnt = 0;
        for(String strTemp : list) {
        	tempID = strTemp.substring(0, strTemp.indexOf("님"));
        	//tempID = strTemp.substring(0, strTemp.indexOf("/"));
        	answer[cnt] = strTemp.replace(tempID, mapID.get(tempID));
        	//answer[cnt] = strTemp.replace(tempID + "/", mapID.get(tempID));
        	cnt++;
        }
        return answer;
	}
}