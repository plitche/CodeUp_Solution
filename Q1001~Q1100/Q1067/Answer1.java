package Q1067;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1067
//@How Scanner
//@Memory 14300, @Time 114

public class Answer1 {
	// 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		// 정수 1개를 입력 받는다.
		
		if (a < 0) { // 입력받은 숫자가 음의 수면
			System.out.println("minus");
		} else {
			System.out.println("plus");
		}

		if (a%2 == 0) { // 입력받은 숫자가 짝수면
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		sc.close();
	}
}

