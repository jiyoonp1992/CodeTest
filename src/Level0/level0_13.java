package Level0;

public class level0_13 {
	public static void main(String[] args) {
		int n = 0, k = 0;
		// n = *120000 양꼬치
		// k = 2000 음료수
		System.out.println(solution(10, 3));
		System.out.println(solution(64, 6));
	}
	
	public static int solution(int n, int k) {
		int answer = 0;
        boolean check = false;
        check = 0 < n && n < 1000 && k < 1000;
        if(check) {
        	k -= n/10;
        	answer = (n * 12000) + (k * 2000);
        }
        return answer;
    }
}