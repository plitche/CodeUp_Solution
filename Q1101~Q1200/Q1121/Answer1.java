package Q1121;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1121
//@Memory 12464, @Time 96

public class Answer1 {
	// 정수 계산에서 나머지를 구하시오.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		System.out.println(number1%number2);
		
		sc.close();
	}

}
