package Q1116;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1116
//@Memory 14320, @Time 117

public class Answer1 {
	// a와 b에 대한 사칙연산 결과를 양식에 맞추어 출력한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		// 입력 받은 두 정수의 합 출력
		System.out.println(number1 + "+" + number2 + "=" + (number1+number2));
		System.out.println(number1 + "-" + number2 + "=" + (number1-number2));
		System.out.println(number1 + "*" + number2 + "=" + (number1*number2));
		System.out.println(number1 + "/" + number2 + "=" + (number1/number2));
		
		sc.close();
	}

}
