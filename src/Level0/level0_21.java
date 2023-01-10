package Level0;

public class level0_21 {

	public static void main(String[] args) {
		int[] dot = {2,4};
		int[] dot1 = {-7,9};
		System.out.println(solution(dot));
		System.out.println(solution(dot1));
	}
	
	public static int solution(int[] dot) {
        int answer = 0;
		boolean check = false;
		check = -500 <= dot[0] && dot[0] != 0 && dot[0] <= 500 && -500 <= dot[1] && dot[1] != 0 && dot[1] <= 500;
		if(check) {
			if(dot[0] > 0 && dot[1] > 0) {
				answer = 1;
			} else if (dot[0] < 0 && dot[1] > 0) {
				answer = 2;
			} else if (dot[0] < 0 && dot[1] < 0) {
				answer = 3;
			}else {
				answer = 4;
			}
		}
        return answer;
	}

}
