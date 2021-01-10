package Q1013;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1013
//@How Scanner + System.out.prinln()
//@Memory 12480, @Time 112

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();	

		System.out.println(number1 + " " + number2);
		// " " 대신 "\s" 사용 가능
		
		// 입력 받은 문자를 따로 저장하지 않고 바로 출력 할 수도 있다.
		// System.out.println(sc.nextInt() + " " sc.nextInt());

		sc.close();
	}
}
