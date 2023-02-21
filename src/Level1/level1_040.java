package Level1;

import java.util.Arrays;

public class level1_040 {
	//문자열 내 마음대로 정렬하기
	public static void main(String[] args) {
		//String[] str01 = {"abcf", "bbcd"};
		//String[] str02 = {"ae","be","ce","ae"};
		//String[] str02 = {"zbcde", "ybcdf", "xbcdg"};
		String[] str02 = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
		String[] str03 = {"aooc", "coob", "cooa" };
		//String[] str03 = {"abce", "abcd", "cdx"};
		//System.out.println(solution());
		//System.out.println(Arrays.toString(solution(str01,2)));
		System.out.println(Arrays.toString(solution(str02,2)));
		System.out.println(Arrays.toString(solution(str03,2)));
	}
	
	public static String[] solution(String[] strings, int n) {
        String[] answer = {};
		boolean check = 1 <= strings.length && strings.length <= 50;
		if(check) {
			String temp = "";
			for(int i = 0; i < strings.length; i++) {
				for(int j = 0; j < strings.length; j++) {
					if(strings[i].charAt(n) < strings[j].charAt(n)) {
						temp = strings[j];
						strings[j] = strings[i];
						strings[i] = temp;
					} else if (strings[i].charAt(n) == strings[j].charAt(n)) {
						for(int k = 0; k < strings.length + 1; k++) {
							if(strings[i] == strings[j]) {
								break;
							} else if(strings[i].charAt(k) < strings[j].charAt(k)) {
								if(i > j) {
									temp = strings[i];
									strings[i] = strings[j];
									strings[j] = temp;
									break;
								} else {
									break;
								}
							} else if(strings[i].charAt(k) > strings[j].charAt(k)) {
								if(i < j) {
									temp = strings[j];
									strings[j] = strings[i];
									strings[i] = temp;
									break;
								} else {
									break;
								}
							}
						}
					}
				}
			}
			answer = strings;
		}
        return answer;
	}
}