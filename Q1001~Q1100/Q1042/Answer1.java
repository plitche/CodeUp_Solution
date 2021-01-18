package Q1042;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1042
//@How Scanner
//@Memory 14280, @Time 111

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt()/sc.nextInt());
		// int 타입으로 나누기 연산을 하면 소수점은 계산 되지 않기 떄문에 몫만 얻을 수 있다.
		sc.close();
	}
}

