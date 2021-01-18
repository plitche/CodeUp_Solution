package Q1047;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1047
//@How Scanner
//@Memory 14292, @Time 113

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		// 정수 하나를 입력 받는다.
		System.out.println(number*2);	//입력받은 정수의 2배 값을 출력한다.
		
		// 물론 입력 받자마자 *2하여 출력하여도 무관하다.
		// System.out.println(sc.nextInt()*2);
		
		sc.close();
	}
}

