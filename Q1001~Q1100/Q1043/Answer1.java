package Q1043;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1043
//@How Scanner
//@Memory 14280, @Time 111

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt()%sc.nextInt());
		// int 타입으로  %연산을 하면 나누기 연산을 한 후 남은 나머지를 계산할 수 있다.
		sc.close();
	}
}

