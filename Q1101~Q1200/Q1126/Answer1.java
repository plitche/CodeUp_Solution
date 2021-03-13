package Q1126;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1126
//@Memory 12496, @Time 96

public class Answer1 {
	// 입력받은 두 수의 기본 연산 5가지를 자동으로 하는 정수 계산기를 제작하시오.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " * " + b + " = " + (a*b));
		System.out.println(a + " / " + b + " = " + (a/b));
		System.out.println(a + " % " + b + " = " + (a%b));
		
		sc.close();
	}

}
