package Q1054;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1054
//@How Scanner
//@Memory 14284, @Time 113

public class Answer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 2개를 입력 받는다.
		
		System.out.println(a==b && a==1 ? 1 : 0);
						// 삼항 연산자를 사용하여 훨신 더 간결하게 풀 수 있다.
						// a와 b가 같고, a가 1이면 ? (a와 b가 모두 1이면) 1 출력
						// 그렇지 않으면 ? => 0 출력
		sc.close();
	}
}

