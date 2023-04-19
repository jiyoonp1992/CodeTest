package Level2;

import java.util.Arrays;

public class level2_041 {
	//스킬트리
	public static void main(String[] args) {
		String[] str = {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println(solution("C", str));
		//System.out.println(Arrays.toString(solution()));
	}
	
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
        String[] strArr = {};
        strArr = skill.split("");
       	for(String str : skill_trees){
       		if(strArr.length == 1) {
       			answer = skill_trees.length;
       		}
       		for(int i = 0; i < strArr.length - 1;i++){
       			if(str.indexOf(strArr[i]) == -1 && str.indexOf(strArr[i+1]) != -1){
       				break;
       			} else if(str.indexOf(strArr[i]) > str.indexOf(strArr[i+1]) && str.indexOf(strArr[i+1]) != -1){
       				break;
       			} else {
       				if(i == strArr.length - 2) {
       					answer++;
       				}
       			}
       		}
       	}
        return answer;
	}
}