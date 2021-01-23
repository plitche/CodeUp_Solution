package Q1060;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1060
//@How Scanner
//@Memory 12448, @Time 93

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 2개를 입력 받는다.
		
		// 입력받은 정수를 비트단위 연산자로 계산한다.
		System.out.println(a&b);
		// ~(bitwise not)
		// &(bitwise and)
		// |(bitwise or)
		// ^(bitwise xor)
		// <<(bitwise left shift)
		// >>(bitwise right shift)
		
		sc.close();
	}
}

