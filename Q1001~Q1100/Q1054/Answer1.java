package Q1054;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1054
//@How Scanner
//@Memory 14332, @Time 116

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 2개를 입력 받는다.
		
		if (a==1 && b==1) {	// a와 b가 모두! 1이면 1 출력
			System.out.println(1);
		} else { // a와 b중 하나라도 1이 아니면 0 출력
			System.out.println(0);
		}
		
		sc.close();
	}
}

