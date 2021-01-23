package Q1056;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1056
//@How Scanner
//@Memory 12472, @Time 95

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 2개를 입력 받는다.
		
		if (a!=b) {	// a와 b가 둘이 참/거짓이 다를 때 1 출력
			System.out.println(1);
		} else { // a와 b가 모두 참이거나 모두 거짓일때 0 출력
			System.out.println(0);
		}
		
		sc.close();
	}
}

