package Q1114;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1114
//@Memory 14316, @Time 114

public class Answer1 {
	// 두 정수를 입력받아 합을 출력한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		// 입력 받은 두 정수의 합 출력
		System.out.println(number1 + number2);
		
		sc.close();
	}

}
