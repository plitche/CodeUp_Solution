package Q1052;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1052
//@How Scanner
//@Memory 14324, @Time 111

public class Answer1 {

	public static void main(String[] args) {
		// 이 문제의 기본적인 풀이는 1049/1050/1051번과 동일하다.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 a,b 두개를 입력 받는다.
		
		if (a!=b) {	// a와 b가 같지 않다면
			System.out.println(1);
		} else { // a와 b가 같으면
			System.out.println(0);
		}
		
		sc.close();
	}
}

