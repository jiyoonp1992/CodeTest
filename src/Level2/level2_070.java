package Level2;

import java.util.*;
import java.util.stream.Collectors;

public class level2_070 {
	//[PCCE 기출문제] 10번 / 데이터 분석
	public static void main(String[] args) {
		int[][] intArr = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
		System.out.println(Arrays.toString(solution(intArr, "date", 20300501,"remain")));//10
	}
	public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        List<List<Integer>> list = new ArrayList<>();
        int std1 = 0, cnt = 0, std3 = 0;
        if(ext.equals("code")) {
        	std1 = 0;
        } else if(ext.equals("date")) {
        	std1 = 1;
        } else if(ext.equals("maximum")) {
        	std1 = 2;
        } else if(ext.equals("remain")) {
        	std1 = 3;
        }
        for(int[] arr : data) {
        	if(arr[std1] < val_ext) {
        		list.add(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        	}
        	cnt++;
        }
        Collections.sort(list, (l1, l2) -> {
        	int std2 = 0;
        	if(sort_by.equals("code")) {
        		std2 = 0;
        	} else if(sort_by.equals("date")) {
        		std2 = 1;
        	} else if(sort_by.equals("maximum")) {
        		std2 = 2;
        	} else if(sort_by.equals("remain")) {
        		std2 = 3;
        	}
        	return l1.get(std2) - l2.get(std2);
        });
        answer = new int[list.size()][4];
        for(int i = 0; i < list.size(); i++) {
        	for(int j = 0; j < 4; j ++) {
        		answer[i][j] = list.get(i).get(j);
        	}
        }
        return answer;
	}
}