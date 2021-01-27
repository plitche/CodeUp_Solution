package Q1063;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1063
//@How Scanner
//@Memory 12444, @Time 96

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 2개를 입력 받는다.
		
		// 삼항 연산자를 이용해서 출력한다. (문제 조건)
		System.out.println(a>b ? a : b);
		
		sc.close();
	}
}

