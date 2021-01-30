package Q1066;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1066
//@How Scanner
//@Memory 14312, @Time 115

public class Answer1 {
	// 세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 정수 3개를 입력 받는다.
		
		// 짝수를 찾는다.
		// 나누기 2를하여 나머지가 없으면 그 수는 짝수이므로 even을 출력한다. 홀수이면 odd를 출력한다.
		if (a%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		if (b%2 == 0) {	
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		if (c%2 == 0) {	
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		sc.close();
	}
}

