package Q1059;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1059
//@How Scanner
//@Memory 12452, @Time 94

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		// 정수 1개를 입력 받는다.
		
		// 입력받은 정수를 비트단위 연산자로 계산한다.
		System.out.println(~number);
		// ~(bitwise not)
		// &(bitwise and)
		// |(bitwise or)
		// ^(bitwise xor)
		// <<(bitwise left shift)
		// >>(bitwise right shift)
		sc.close();
	}
}

