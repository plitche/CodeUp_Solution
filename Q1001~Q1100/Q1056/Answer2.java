package Q1056;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1056
//@How Scanner
//@Memory 12468, @Time 97

public class Answer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 2개를 입력 받는다.
		
		System.out.println(a==b ? 0 : 1);
						// 삼항 연산자를 사용하여 훨신 더 간결하게 풀 수 있다.
						// a와 b가 둘다 참이거나 둘다 참이 아니면 0 출력
						// 그렇지 않으면 ? => 1 출력
		sc.close();
	}
}

