package Level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class level2_056 {
	//쿼드압축 후 개수 세기
	public static void main(String[] args) {
		//int[][] num = {{1,1,0,0}, {1,0,0,0}, {1,0,0,1}, {1,1,1,1}};
		int[][] num = {{1,1,1,1,1,1,1,1}, {0,1,1,1,1,1,1,1}, {0,0,0,0,1,1,1,1}, {0,1,0,0,1,1,1,1}, {0,0,0,0,0,0,1,1}, {0,0,0,0,0,0,0,1}, {0,0,0,0,1,0,0,1}, {0,0,0,0,1,1,1,1}};
		//System.out.println(solution());
		System.out.println(Arrays.toString(solution(num)));
	}
	
	public static int[] solution(int[][] arr) {
        int[] answer = {};
        answer = new int[2];
        int x = arr.length;
        int y = (int) (Math.log(x) / Math.log(2));
        HashMap<Integer, LinkedList<Integer>> map00 = new HashMap<>();
        LinkedList<Integer> list00 = new LinkedList<>();
        HashMap<Integer, LinkedList<Integer>> map01 = new HashMap<>();
        if(x > 1) {
        	for(int i = 0; i < arr.length - 1; i += 2) {
        		for(int j = 0; j < arr[0].length - 1; j += 2) {
        			list00.clear();
        			if(arr[i][j] == arr[i][j+1] && arr[i+1][j]  == arr[i+1][j+1] && arr[i][j] == arr[i+1][j]) {
        				if(arr[i][j] == 0) {
        					if(map00.containsKey(i)) {
        						list00.addAll(map00.get(i));
        					}
        					list00.add(j);
        					map00.put(i, list00);
        				} else {
        					if(map01.containsKey(i)) {
        						list00.addAll(map01.get(i));
        					}
        					list00.add(j);
        					map01.put(i, list00);
        				}
        			} else {
        				if(arr[i][j] == 0) {
        					answer[0]++;
        				} else {
        					answer[1]++;
        				}
        				
        				if(arr[i][j+1] == 0) {
        					answer[0]++;
        				} else {
        					answer[1]++;
        				}
        				
        				if(arr[i+1][j] == 0) {
        					answer[0]++;
        				} else {
        					answer[1]++;
        				}
        				
        				if(arr[i+1][j+1] == 0) {
        					answer[0]++;
        				} else {
        					answer[1]++;
        				}
        			}
        			System.out.println("map00 = " + map00);
        			System.out.println("map01 = " + map01);
        		}
        	}
        } else {
        	if(arr[0][0] == 0 ) {
        		answer[0]++;
        	} else {
        		answer[1]++;
        	}
        }
        int cnt = 1, listCnt = 0;
        if(!map00.isEmpty()) {
        	for(int n = 0; n < map00.size();n++) {
        		if(map00.size() == 1 && map00.get(n).size() == 1) {
        			answer[0]++;
        		}
        	}
        }
        if(!map01.isEmpty()) {
        	for(int m = 0; m < map01.size();m++) {
        		if(map01.size() == 1 && map01.get(m).size() == 1) {
        			answer[1]++;
        		}
        	}
        }
//        if(!list00.isEmpty()) {
//        	listCnt = list00.size();
//        	for(int n = 0; n < listCnt; n++) {
//        		if(list00.get(n) == list00.get(n + cnt * 2)) {
//        			
//        		}
//        	}
//        }
//        
//        if(!list01.isEmpty()) {
//        	for(int m = 0; m < list00.size(); m++) {
//        		
//        	}
//        }
        return answer;
	}
}