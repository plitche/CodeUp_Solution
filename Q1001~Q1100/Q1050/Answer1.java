package Q1050;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1050
//@How Scanner
//@Memory 14284, @Time 133

public class Answer1 {

	public static void main(String[] args) {
		// 이문제의 기본적인 풀이는 1049번과 동일하다.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 a,b 두개를 입력 받는다.
		
		if (a==b) {	// a가 b와 같으면 1 출력
			System.out.println(1);
		} else { // a와 b가 같지 않으면
			System.out.println(0);
		}
		
		sc.close();
	}
}

