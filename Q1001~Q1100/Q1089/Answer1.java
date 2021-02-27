package Q1089;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1089
//@Memory 14300, @Time 123

public class Answer1 {
	// 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가	공백을 두고 입력된다.(모두 0 ~ 100)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		for (int i=1; i<n; i++) {	// 1부터 n까지 반복문 실행
			a += d;	// 반복문이 실행될 때마다 등차의 값을 시작값에 더하라.
		}
		
		System.out.println(a);
		sc.close();
	}
}

