package Q1041;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1041
//@How Scanner
//@Memory 14224, @Time 108

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int letter = sc.next().charAt(0);
		// 문자 하나를 입력 받는다.
		// int 타입으로 저장을 하면 아스키 코드 값의 해당 정수 값으로 자동 저장된다.		
		System.out.println((char)(letter+1));
		// 저장한 letter의 1을 더하여 char타입으로 변환하여 다음 문자를 출력한다.
		sc.close();
	}
}

