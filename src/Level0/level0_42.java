package Level0;

import java.util.Arrays;
import java.util.Scanner;

public class level0_42 {
	//직각삼각형 출력하기
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = false;
        check = 1 <= n && n <= 10;
        if(check) {
        	for(int i = 1; i <= n; i++) {
        		for(int j = 1; j <= i; j++) {
        			System.out.print("*");
        		}
        		System.out.println("");
        	}
        }
        System.out.println(n);
    }
}