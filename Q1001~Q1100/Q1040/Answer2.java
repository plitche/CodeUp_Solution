package Q1040;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1040
//@How Scanner
//@Memory 14300, @Time 117

public class Answer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt()*-1);
		// 앞선 Answer1 보다 더 간편한 방법은 -1을 곱하여 부호를 바꿔준다.
		sc.close();
	}
}

