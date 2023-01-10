package Level0;

public class level0_19 {

	public static void main(String[] args) {
		int[] nList = {1,2,3,4,5};
		int[] nList2 = {1,3,5};
		
		System.out.println(solution(nList));
		System.out.println(solution(nList2));
	}
	
	public static int[] solution(int[] num_list) {
		int[] answer = new int[2];
		boolean check = false;
		check = 1 <= num_list.length && num_list.length <= 100;
		int even = 0, odd = 0;
		if(check) {
			for(int i = 0; i <= num_list.length - 1; i++) {
				if(num_list[i]%2 == 0) {
					even++;
				}else {
					odd++;
				}
			}
			answer[0] = even;
			answer[1] = odd;
		}
        return answer;
	}

}
