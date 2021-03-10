package Q1113;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1113
//@Memory 14320, @Time 113

public class Answer1 {
	// 두 정수를 입력받아 순서를 바꿔서 출력하시오.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		// 입력 받은 순서와 거꾸로 출력
		System.out.println(number2 + " " + number1);
		
		sc.close();
	}

}
