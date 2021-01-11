package Q1017;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1017
//@How Scanner + System.out.prinln()
//@Memory 12440, @Time 117

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		System.out.println(number + " " + number + " " + number);
		// 공백을 사이에 두고 3번 출력이라고 하여 위와 같은 형태가 가능하지만, 
		// 차후 수정을 위해서는 아래와 같이 작성하는 것이 좋다.
		/*
			for (int i=0; i<3; i++) {
				System.out.print(number + " ");
			}
		*/
		sc.close();
	}
}
