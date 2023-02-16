package Level1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class level1_030 {
	//직사각형 별찍기
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(a + b);
        
        for(int i = 0; i < b; i++) {
        	for(int j = 0; j < a; j++) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }
    }
}