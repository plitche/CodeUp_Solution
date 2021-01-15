package Q1034;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1034
//@How Scanner
//@Memory 12388, @Time 113

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Integer.valueOf(sc.next(), 8));
		// 2진수 -> 10진수 변환 : Integer.valueOf(string, 2);
		// 8진수 -> 10진수 변환 : Integer.valueOf(string, 8);
		// 16진수 -> 10진수 변환 : Integer.valueOf(string, 16);
		// 숫자 스트링을 10진수 int로 반환해줍니다.
		sc.close();
	}
}

