package Q1073;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1073
//@How Scanner, for
//@Memory 14292, @Time 114

public class Answer1 {
	// 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {	// 무한 루프 while문
			int a = sc.nextInt();
			if (a==0) {
				break;	// 입력받은 값이 0이면 while문 종료
			}
			System.out.println(a);	// 아니면 하나씩 출력하기 (줄바꿈)
		}
		
		sc.close();
	}
}

