package Level1;

import java.util.Arrays;

public class level1_073 {
	//신고 결과 받기
	public static void main(String[] args) {
		//String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] id_list = {"con", "ryan"};
		//String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
		//System.out.println(solution(id_list, report, 2));
		System.out.println(Arrays.toString(solution(id_list, report, 3)));
	}
	
	public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
		boolean check = 2 <= id_list.length && id_list.length <= 1000 && 1 <= report.length && report.length <= 200000;
		if(check) {
			answer = new int[id_list.length];
			int[] reportCnt = new int[id_list.length];
			String[] reportStr = new String[id_list.length];
			Arrays.sort(report);
			report = Arrays.stream(report).distinct().toArray(String[]:: new);
			String id_str = "";
			String rp_str = "";
			int idx = 0;
			for(int i = 0; i < report.length; i++) {
				rp_str = report[i].substring(report[i].indexOf(" ") + 1, report[i].length());
				id_str = report[i].substring(0, report[i].indexOf(" "));
				idx = Arrays.asList(id_list).indexOf(rp_str);
				reportCnt[idx]++;
				
				if(reportStr[idx] == null) {
					reportStr[idx] = id_str;
				} else {
					reportStr[idx] = reportStr[idx] + " " + id_str;
				}
			}
			
			int cnt = 0;
			String[] id_ck_Str = {};
			for(String chStr : reportStr) {
				if(reportCnt[cnt] >= k) {
					id_ck_Str = chStr.split(" ");
				}
				if(id_ck_Str.length != 0) {
					for(int j = 0; j < id_ck_Str.length; j++) {
						idx = Arrays.asList(id_list).indexOf(id_ck_Str[j]);
						answer[idx]++;
					}
					id_ck_Str = new String[0];
				}
				cnt++;
			}
		}
        return answer;
	}
}