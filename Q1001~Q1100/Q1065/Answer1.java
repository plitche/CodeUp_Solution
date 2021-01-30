package Q1065;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1065
//@How Scanner
//@Memory 14312, @Time 116

public class Answer1 {
	// 세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 정수 3개를 입력 받는다.
		
		// 짝수를 찾는다.
		if (a%2 == 0) {	//나누기 2를하여 나머지가 없으면 그 수는 짝수이다.
			System.out.println(a);
		}
		if (b%2 == 0) {	//나누기 2를하여 나머지가 없으면 그 수는 짝수이다.
			System.out.println(b);
		}
		if (c%2 == 0) {	//나누기 2를하여 나머지가 없으면 그 수는 짝수이다.
			System.out.println(c);
		}
		
		sc.close();
	}
}

