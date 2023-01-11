package Level0;

public class level0_31 {
	//배열의 유사도
	public static void main(String[] args) {
		String[] srt00 = {"a", "b", "c"};
		String[] srt01 = {"com", "b", "d", "p", "c"};
		String[] srt10 = {"n", "omg"};
		String[] srt11 = {"m", "dot"};
		System.out.println(solution(srt00, srt01));
		System.out.println(solution(srt10, srt11));
	}
	
	public static int solution(String[] s1, String[] s2) {
        int answer = 0;
		boolean check = false;
		check = 1 <= s1.length && s1.length <= 100 && 1<= s2.length && s2.length <= 100;  
		if(check) {
			for(String strs1:s1) {
				if(1 <= strs1.length() && strs1.length() <= 10) {
					for(String strs2:s2) {
						if(1 <= strs2.length() && strs2.length() <= 10) {
							if(strs1.equals(strs2)) {
								answer++;
							}
						}
					}
				}
			}
		}
        return answer;
	}
}