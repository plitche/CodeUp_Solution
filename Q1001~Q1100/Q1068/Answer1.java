package Q1068;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1068
//@How Scanner
//@Memory 14308, @Time 118

public class Answer1 {
	// 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
	//  90 ~ 100 : A, 70 ~   89 : B, 40 ~   69 : C, 0 ~   39 : D
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		// 정수 1개를 입력 받는다.
		
		if (a >= 90) { // 입력받은 점수가 90점 이상이면
			System.out.println('A');
		} else if (a >= 70){	// 90점 미만 70점 이상이면
			System.out.println('B');
		} else if (a >= 40){	// 70점 미만 40점 이상이면
			System.out.println('C');
		} else {	// 40점 미만이면
			System.out.println('D');
		}
		
		sc.close();
	}
}

