package Q1058;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1058
//@How Scanner
//@Memory 12484, @Time 96

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 2개를 입력 받는다.
		
		if (a==0 && b==0) {	// a와 b가 모두 거짓일 때만 1 출력
			System.out.println(1);
		} else { // a와 b 둘 중 하나라도 거짓이 아니면 0 출력
			System.out.println(0);
		}
		
		sc.close();
	}
}

