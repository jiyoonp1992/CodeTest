package Level0;

public class level0_20 {

	public static void main(String[] args) {
		System.out.println(solution(5500));
		System.out.println(solution(15000));
	}
	
	public static int[] solution(int money) {
        int[] answer = new int[2];
		boolean check = false;
		check = 0 < money && money <= 1000000;
		int sum = 0;
		int change = 0;
		if(check) {
			sum = money / 5500;
			change = money - (sum*5500);
		}
		answer[0] = sum;
		answer[1] = change;
        return answer;
	}

}
