package Q1136;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1136
//@Memory 12448, @Time 93

public class Answer1 {
	// 두 정수(a, b)를 입력받아 a와 b가 같으면 1, 같지 않으면 0을 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a==b) {	// 같으면
			System.out.println(1);	// 1출력
		} else {	// 같지 않으면
			System.out.println(0);	// 0출력
		}
		
		sc.close();
	}

}
