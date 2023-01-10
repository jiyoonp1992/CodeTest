package Level0;

public class level0_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(solution(num));
	}
	
	public static double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        int cnt = numbers.length - 1;
        if(0 <= cnt  && cnt <= 99){
            for(int i=0; i <= cnt; i++){
                if(0 <= numbers[i] && numbers[i] <= 1000){
                    sum += numbers[i];
                }
            }
        }
        System.out.println(cnt);
        System.out.println(sum);
        answer = sum / (cnt + 1);
        return answer;
    }

}
