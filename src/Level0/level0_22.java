package Level0;

public class level0_22 {
//배열 두 배 만들기
	public static void main(String[] args) {
		int[] numList = {1,2,3,4,5};
		int[] numList2 = {1,2,100,-99,1, 2,3};
		System.out.println(solution(numList));
		System.out.println(solution(numList2));
	}
	
	public static int[] solution(int[] numbers) {
        int[] answer = {};
		boolean check = false;
		check = 1 <= numbers.length && numbers.length <= 1000;
		if(check) {
			answer = new int[numbers.length];
			int inD = 0;
			for(int twNum:numbers) {
				answer[inD] = twNum*2;
				inD++;
			}
		}
        return answer;
	}

}
