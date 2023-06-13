package Level2;

import java.util.*;

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
		boolean[][] bCheck = {};
		int x = arr.length, cnt = 0;
		answer = new int[2];
		bCheck = new boolean[x][x];
		Set<Integer> set = new HashSet<>();
		int num = 0;
		while(num < 100) {
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr.length; j++) {
					Arrays.toString(bCheck[i]);
					if(bCheck[i][j] != true) {
						for(int k = 0; cnt < x/2;k++) {
							set.add(arr[i][j]);
							set.add(arr[i][j+k]);
							set.add(arr[i+k][j]);
							set.add(arr[i+k][j+k]);
							System.out.println("arr[" + i + "][" + j +"] = " + arr[i][j]);
							System.out.println("arr[" + i + "][" + (j + k) +"] = " + arr[i][j + k]);
							System.out.println("arr[" + (i + k) + "][" + j +"] = " + arr[i + k][j]);
							System.out.println("arr[" + (i + k) + "][" + (j + k) +"] = " + arr[i + k][j + k]);
							cnt++;
							System.out.println("set = " + set);
							System.out.println("set size = " + set.size());
							System.out.println("cnt = " + cnt);
							if(set.size() != 1) {
								j = x/2 - 1;
								set.clear();
								cnt = 0;
								break;
							}
							
							if(set.size() == 1 && cnt == x /2) {
								bCheck[i][j] = true;
								bCheck[i][j+k] = true;
								bCheck[i+k][j] = true;
								bCheck[i+k][j+k] = true;
								answer[set.iterator()]++;
							}
						}
					} else {
						break;
					}
				}
			}
			num++;
		}
		
//        int[] answer = {};
//        answer = new int[2];
//        int x = arr.length;
//        int y = (int) (Math.log(x) / Math.log(2));
//        HashMap<Integer, LinkedList<Integer>> map00 = new HashMap<>();
//        HashMap<Integer, LinkedList<Integer>> map01 = new HashMap<>();
//        if(x > 1) {
//        	for(int i = 0; i < arr.length - 1; i += 2) {
//        		for(int j = 0; j < arr[0].length - 1; j += 2) {
//        			if(arr[i][j] == arr[i][j+1] && arr[i+1][j]  == arr[i+1][j+1] && arr[i][j] == arr[i+1][j]) {
//        				if(arr[i][j] == 0) {
//        					LinkedList<Integer> list00 = map00.getOrDefault(i, new LinkedList<>());
//                            list00.add(j);
//                            map00.put(i, list00);
//                        } else {
//                        	LinkedList<Integer> list01 = map01.getOrDefault(i, new LinkedList<>());
//                            list01.add(j);
//                            map01.put(i, list01);
//        				}
//        			} else {
//        				if(arr[i][j] == 0) {
//        					answer[0]++;
//        				} else {
//        					answer[1]++;
//        				}
//        				
//        				if(arr[i][j+1] == 0) {
//        					answer[0]++;
//        				} else {
//        					answer[1]++;
//        				}
//        				
//        				if(arr[i+1][j] == 0) {
//        					answer[0]++;
//        				} else {
//        					answer[1]++;
//        				}
//        				
//        				if(arr[i+1][j+1] == 0) {
//        					answer[0]++;
//        				} else {
//        					answer[1]++;
//        				}
//        			}
//        		}
//        	}
//        } else {
//        	if(arr[0][0] == 0 ) {
//        		answer[0]++;
//        	} else {
//        		answer[1]++;
//        	}
//        }
//        System.out.println("map00 = " + map00);
//        System.out.println("map01 = " + map01);
//        int iCnt = 0;
//        if(!map00.isEmpty()) {
//        	for (Map.Entry<Integer, LinkedList<Integer>> entry : map01.entrySet()) {
//                if (entry.getValue().size() == 1) {
//                    answer[1]++;
//                }
//            }
//        }
//        
//        if(!map01.isEmpty()) {
//        	for (Map.Entry<Integer, LinkedList<Integer>> entry : map01.entrySet()) {
//                if (entry.getValue().size() == 1) {
//                    answer[1]++;
//                }
//            }
//        }
		
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