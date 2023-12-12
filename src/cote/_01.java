package cote;

public class _01 {

	public static void main(String[] args) {
		//answer : 정답 번호 (1~5), score : number }로 이루어진 배열 arr이 정답지로 넘어갈 때,
		//가장 점수가 높은 수포자의 이름과 점수를 “이름 : 점수” 형태로 리턴해 주세요
		//시험 응시자는 1번으로 모두 찍은 a, 3번으로 모두 찍은 b, 5번으로 모두 찍은 c가 있습니다.
		
		//[ { answer : 1, score : 5 }, { answer : 3, score : 3 }, { answer : 2, score : 4 } ] → a : 5
		//[ { answer : 1, score : 5 }, { answer : 5, score : 5 }, { answer : 2, score : 4 } ] → a : 5, c : 5
		int max = 0;
		int[] intArr = {0, 0, 0};
		String answer = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].answer == "1") {
				intArr[0] += arr[i].score;
			} else if (arr[i].answer == "3") {
				intArr[1] += arr[i].score;
			} else if (arr[i].answer == "5") {
				intArr[2] += arr[i].score;
			}
		}
		max = Math.max(Math.max(intArr[0], intArr[1]), intArr[2]);
		if(intArr[0] == max) {
			answer += "a : " + intArr[0]; 
		}
		if(intArr[1] == max) {
			if(answer.equals("")) {
				answer += "b : " + intArr[1];
			} else {
				answer += ", b : " + intArr[1];
			}
		}
		if(intArr[2] == max) {
			if(answer.equals("")) {
				answer += "c : " + intArr[2];
			} else {
				answer += ", c : " + intArr[2];
			}
		}
		return answer;
	}

}
