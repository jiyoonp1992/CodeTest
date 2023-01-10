package Level0;

public class level0_23 {
//삼각형의 완성조건(1)
	public static void main(String[] args) {
		int[] num1 = {1,2,3};
		int[] num2 = {3,6,2};
		int[] num3 = {199,72,222};
		System.out.println(solution(num1));
		System.out.println(solution(num2));
		System.out.println(solution(num3));
	}
	
	public static int solution(int[] sides) {
        int answer = 0;
        int maxSide = 0;
        int sum = 0;
		for(int maxNum:sides) {
			if(maxNum >= maxSide) {
				maxSide = maxNum;
			}
			sum += maxNum;
		}
		sum -= maxSide;
		answer = (sum > maxSide) ? 1 : 2;
        return answer;
	}

}
