package Level0;

public class level0_12 {
	public static void main(String[] args) {
		int[] num = {180, 120, 140};
		int hei = 190;
		System.out.println(solution(num, hei));
	}
	
	public static int solution(int[] array, int height) {
		int answer = 0;
        boolean check = false;
        check = 1 <= array.length && array.length <= 100 && 1 <= height && height <= 200;
        if(check) {
        	for(int i = 0; i <= array.length - 1; i++) {
        		if(1 <= array[i] && array[i] <= 200) {
        			if(array[i] > height) {
            			answer += 1;
            		}
        		}
        	}
        }
        return answer;
    }
}