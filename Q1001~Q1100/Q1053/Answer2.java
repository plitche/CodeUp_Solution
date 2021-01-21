package Q1053;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1053
//@How Scanner
//@Memory 14308, @Time 106

public class Answer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		// 정수 1개를 입력 받는다.
		
		System.out.println(number==1 ? 0 : 1);
						// 삼항 연산자를 사용하여 훨신 더 간결하게 풀 수 있다.
						// number가 1이면 0출력
						// 그렇지 않으면 ? => 1 출력
		sc.close();
	}
}

