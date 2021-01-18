package Q1049;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1049
//@How Scanner
//@Memory 14300, @Time 112

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 a,b 두개를 입력 받는다.
		
		if (a>b) {	// a가 b보다 크면 1 출력
			System.out.println(1);
		} else if (a<=b) { // a가 b보다 작거나 같으면 0 출력
			System.out.println(0);
		}
		
		sc.close();
	}
}

