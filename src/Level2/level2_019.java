package Level2;

import java.util.Arrays;

public class level2_019 {
	//[1차] 캐시
	public static void main(String[] args) {
		String[] str01 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		String[] str02 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
		String[] str03 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		String[] str04 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		String[] str05 = {"Jeju", "Pangyo", "NewYork", "newyork"};
		String[] str06 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		String[] str07 = {"leo", "leo", "leo"};
		System.out.println(solution(7, str07));
		//System.out.println(solution(3, str02));
		//System.out.println(solution(2, str03));
		//System.out.println(solution(5, str04));
		//System.out.println(solution(2, str05));
		//System.out.println(solution(0, str06));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        String[] strArr = new String[cacheSize];
        String[] str01 = {};
        String[] str02 = {};
        int id = 0;
        if(cacheSize == 0) {
        	answer = cities.length * 5;
        } else {
        	for(String str:cities) {
        		str = str.toLowerCase();
        		if(Arrays.asList(strArr).contains(str)) {
        			id = Arrays.asList(strArr).indexOf(str);
        			str01 = Arrays.copyOfRange(strArr, 0, id);
        			str02 = Arrays.copyOfRange(strArr, id + 1, strArr.length);

        			System.arraycopy(str01, 0, strArr, 1, str01.length);
        	        System.arraycopy(str02, 0, strArr, str01.length + 1, str02.length);
        	        
        	        if(Arrays.asList(strArr).contains(null)) {
        				strArr[Arrays.asList(strArr).lastIndexOf(null)] = str;
        			} else {
        				strArr[0] = str;
        			}
        			answer += 1;
        		} else {
        			if(Arrays.asList(strArr).contains(null)) {
        				strArr[Arrays.asList(strArr).lastIndexOf(null)] = str;
        			} else {
        				for(int i = strArr.length - 1; i > 0; i--) {
        					strArr[i] = strArr[i-1];
        				}
        				strArr[0] = str;
        			}
        			answer += 5;
        		}
        	}
        }
        return answer;
	}
}