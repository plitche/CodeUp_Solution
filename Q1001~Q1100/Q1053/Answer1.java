package Q1053;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1053
//@How Scanner
//@Memory 14252, @Time 112

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		// 정수 1개를 입력 받는다.
		
		if (number==1) {	// number가 1이면 0 출력
			System.out.println(0);
		} else { // 그렇지 않으면 1 출력
			System.out.println(1);
		}
		
		sc.close();
	}
}

