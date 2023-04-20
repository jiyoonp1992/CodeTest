package Level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class level2_043 {
	//방문 길이
	public static void main(String[] args) {
		System.out.println(solution("UDU"));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String dirs) {
		int answer = 0;
		int x = 0, y = 0, px = 0, py = 0;
		String[] strArr = {};
		String strKey = "", pStrKey = "", pStr = "";
		Map<String, String> map = new HashMap<>();
		strArr = dirs.split("");
		for (String str : strArr) {
			px = x; py = y;
			if(str.equals("U")){
				if(y < 5){
					y++;
					pStr = "D";
				} else {
					continue;
				}
			} else if (str.equals("R")){
				if(x < 5){
					x++;
					pStr = "L";
				} else {
					continue;
				}
			} else if (str.equals("D")) {
				if(y > -5){
					y--;
					pStr = "U";
				} else {
					continue;
				}
			} else {
				if(x > -5){
					x--;
					pStr = "R";
				} else {
					continue;
				}
			}
			
			pStrKey = px + "," + py;
			strKey = x + "," + y;
			if(map.containsKey(strKey) && map.containsKey(pStrKey)) {
				if(!map.get(strKey).contains(pStr) && !map.get(pStrKey).contains(str)) {
					map.put(strKey, map.get(strKey) + pStr);
					map.put(pStrKey, map.get(pStrKey) + str);
					answer++;
				} else if(!map.get(strKey).contains(pStr)) {
					map.put(strKey,pStr);
				} else if(!map.get(pStrKey).contains(str)) {
					map.put(pStrKey,str);
				}
			} else {
				if(map.containsKey(strKey) && !map.get(strKey).isEmpty()) {
					map.put(strKey, map.get(strKey) + pStr);
				} else {
					map.put(strKey,pStr);
				}
				
				if(map.containsKey(pStrKey) && !map.get(pStrKey).isEmpty()) {
					map.put(pStrKey, map.get(pStrKey) + str);
				} else {
					map.put(pStrKey,str);
				}
				
				answer++;
			}
		}
		return answer;
	}
}