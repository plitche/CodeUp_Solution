package Q1135;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1135
//@Memory 12468, @Time 95

public class Answer1 {
	// 두 정수(a, b)를 입력받아 a가 b보다 크거나 같으면(이상) 1, a가 b보다 작으면(미만) 0을 출력하는 프로그램을 작성해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a>=b) {	// 크거나 같으면
			System.out.println(1);	// 1출력
		} else {	// 작으면
			System.out.println(0);	// 0출력
		}
		
		sc.close();
	}

}
