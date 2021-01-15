package Q1033;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1033
//@How Scanner
//@Memory 12448, @Time 119

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Integer.toHexString(sc.nextInt()).toUpperCase());
		// 소문자를 대문자로 변환하는 함수 : toUpperCase()
		sc.close();
	}
}

