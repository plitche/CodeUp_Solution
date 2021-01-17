package Q1040;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1040
//@How Scanner
//@Memory 14308, @Time 114

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		// 숫자 하나를 입력 받는다.
		number -= number*2;	//입력받은 숫자의 배수만큼 뺴준다.
		System.out.println(number);
		sc.close();
	}
}

