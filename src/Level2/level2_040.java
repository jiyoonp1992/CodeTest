package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class level2_040 {
	//땅따먹기
	public static void main(String[] args) {
		int[][] num = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		System.out.println(solution(num));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(int[][] land) {
//        int answer = 0;
//        List<Integer> list = new ArrayList<Integer>();
//        int idx = 0, max = 0;
//        for(int[] numArr : land) {
//        	list.addAll(Arrays.stream(numArr).boxed().collect(Collectors.toList()));
////        	if(answer != 0) {
////        		list.set(idx, -1);
////        		idx = 0;
////        	}
////        	for(int i = 0; i < list.size();i++) {
////        		if(max < list.get(i)) {
////        			max = list.get(i);
////        			idx = i;
////        		}
////        	}
////        	answer += max;
////        	max = 0;
//        }
//        max = Collections.max(list);
//        idx = list.indexOf(max);
//        for(int i = 0; i < land.length - 1; i += 4) {
//        	answer += max;
//        }
//        return answer;
		
//        int answer = 0;
//        List<Integer> list = new ArrayList<Integer>();
//        List<Integer> listTemp = new ArrayList<Integer>();
//        int idx01 = 0, idx02 = 0, idx03 = 0, idx04 = 0, max01 = 0, max02 = 0, max03 = 0, max04 = 0, cnt = 0, num = 0;
//        for(int[] numArr : land) {
//        	list = Arrays.stream(numArr).boxed().collect(Collectors.toList());
//        	if(cnt == 0) {
//        		max01 = list.get(0);
//        		max02 = list.get(1);
//        		max03 = list.get(2);
//        		max04 = list.get(3);
//        		idx01 = 0;
//        		idx02 = 1;
//        		idx03 = 2;
//        		idx04 = 3;
//        	} else {
//        		num = 0;
//        		listTemp.clear();
//        		listTemp.addAll(list);
//        		listTemp.set(idx01, -1);
//        		System.out.println(listTemp);
//        		for(int i = 0; i < listTemp.size();i++) {
//        			if(num < listTemp.get(i)) {
//        				num = listTemp.get(i);
//        				idx01 = i;
//        			}
//        		}
//        		max01 += num;
//        		num = 0;
//        		listTemp.clear();
//        		listTemp.addAll(list);
//        		listTemp.set(idx02, -1);
//        		for(int i = 0; i < listTemp.size();i++) {
//        			if(num < listTemp.get(i)) {
//        				num = listTemp.get(i);
//        				idx02 = i;
//        			}
//        		}
//        		max02 += num;
//        		num = 0;
//        		listTemp.clear();
//        		listTemp.addAll(list);
//        		listTemp.set(idx03, -1);
//        		for(int i = 0; i < listTemp.size();i++) {
//        			if(num < listTemp.get(i)) {
//        				num = listTemp.get(i);
//        				idx03 = i;
//        			}
//        		}
//        		max03 += num;
//        		num = 0;
//        		listTemp.clear();
//        		listTemp.addAll(list);
//        		listTemp.set(idx04, -1);
//        		for(int i = 0; i < listTemp.size();i++) {
//        			if(num < listTemp.get(i)) {
//        				num = listTemp.get(i);
//        				idx04 = i;
//        			}
//        		}
//        		max04 += num;
//        	}
//        	cnt++;
//        }
//        answer = Math.max(Math.max(max01, max02), Math.max(max03, max04));
//        return answer;
//		int answer = 0;
//      List<Integer> list = new ArrayList<Integer>();
//      int idx = 0, max = 0;
//      for(int[] numArr : land) {
//      	list.addAll(Arrays.stream(numArr).boxed().collect(Collectors.toList()));
//      	if(answer != 0) {
//      		list.set(idx, -1);
//      		idx = 0;
//      	}
//      	for(int i = 0; i < list.size();i++) {
//      		if(max < list.get(i)) {
//      			max = list.get(i);
//      			idx = i;
//      		}
//      	}
//      	answer += max;
//      	max = 0;
//      }
//      max = Collections.max(list);
//      idx = list.indexOf(max);
//      for(int i = 0; i < land.length - 1; i += 4) {
//      	answer += max;
//      }
//      return answer;
      
      int answer = 0;

      for(int i = 1; i < land.length;i++){
          land[i][0] += Math.max(land[i-1][1],Math.max(land[i-1][2],land[i-1][3]));
          land[i][1] += Math.max(land[i-1][0],Math.max(land[i-1][2],land[i-1][3]));
          land[i][2] += Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][3]));
          land[i][3] += Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][2]));

      }

      return Math.max(Math.max(land[land.length-1][0], land[land.length-1][1]), Math.max(land[land.length-1][2],land[land.length-1][3]));
	}
}