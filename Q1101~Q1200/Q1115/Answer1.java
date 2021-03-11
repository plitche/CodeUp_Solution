package Q1115;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1115
//@Memory 14308, @Time 118

public class Answer1 {
	// 두 정수의 덧셈의 결과를 출력한다.두 수는 int 범위를 넘어선 64비트 정수형 값이다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number1 = sc.nextLong();
		long number2 = sc.nextLong();
		
		// 입력 받은 두 정수의 합 출력
		System.out.println(number1 + number2);
		
		sc.close();
	}

}
