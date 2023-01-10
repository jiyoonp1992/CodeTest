package Level0;

public class level0_14 {

	public static void main(String[] args) {
		int[] arrayList = {1,1,2,3,4,5};
		int j = 1;
		System.out.println(solution(arrayList, j));
	}
	
	public static double solution(int[] array, int n) {
		int answer = 0;
		boolean check = false;
		check = 1 <= array.length && array.length <= 100 && 0 <= n && n <= 1000;
		if(check) {
			for(int i = 0; i <+ array.length; i++) {
				if(0 <= array[i] && array[i] <= 1000) {
					if (array[i] == n) {
						answer++;
					}
				}
			}
		}
        return answer;
	}
}