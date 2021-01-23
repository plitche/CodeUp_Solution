package Q1058;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1058
//@How Scanner
//@Memory 12436, @Time 87

public class Answer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 2개를 입력 받는다.
		
		System.out.println(a==0 && b==0 ? 1 : 0);
						// 삼항 연산자를 사용하여 훨신 더 간결하게 풀 수 있다.
						// a와 b가 둘다 거짓일 때만 1 출력
						// 둘 중 하나라도 거짓이 아니면 0 출력
		sc.close();
	}
}

