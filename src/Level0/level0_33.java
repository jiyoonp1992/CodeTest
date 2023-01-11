package Level0;

import java.util.Arrays;
//옷가게 할인받기
public class level0_33 {
	
	public static void main(String[] args) {
		System.out.println(solution(90000));
		System.out.println(solution(150000));
		System.out.println(solution(150010));
		System.out.println(solution(580000));
	}
	
	public static int solution(int price) {
        int answer = 0;
		boolean check = false;
		check = 10 <= price && price <= 1000000;
		if(check) {
			if(100000 > price) {
				answer = Math.round(price);
			} else if(100000 <= price && price < 300000) {
				answer = (int) (price * 0.95);
			} else if(300000 <= price && price < 500000){
				answer = (int) (price * 0.9);
			} else {
				answer = (int) (price * 0.8);
			}
		}
        return answer;
	}
}