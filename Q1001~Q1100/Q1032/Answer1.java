package Q1032;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1032
//@How Scanner
//@Memory 12452, @Time 114

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Integer.toHexString(sc.nextInt()));
		// 10진수를 2, 8, 16진수를 바꾸는 메소드
		// 10진수 -> 2진수 : Integer.toBinaryString()
		// 10진수 -> 8진수 : Integer.toOctalString()
		// 10진수 -> 16진수 : Integer.toHexString()
		sc.close();
	}
}

