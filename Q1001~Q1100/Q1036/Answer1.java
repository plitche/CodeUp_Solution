package Q1036;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1036
//@How Scanner
//@Memory 12348, @Time 107

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println((int)sc.next().charAt(0));
		// 문자열로 입력을 받아서, charAt(0)으로 문자를 추출하여 정수형으로 캐스팅한다.
		// 아스키 코드로 형변환이 가능하다.
		sc.close();
	}
}

