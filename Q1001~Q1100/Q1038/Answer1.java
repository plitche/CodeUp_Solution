package Q1038;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1038
//@How Scanner
//@Memory 14304, @Time 112

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLong()+sc.nextLong());
		// 두 정수를 입력을 받아, 그의 합을 출력한다. int타입으로 입력을 받으면 합계가 int의 범위를 벗어나기 때문에 오류가 발생한다.
		// 두 정수가 공백, 줄바꿈 등 무관하게 숫자 2개를 입력 받기 떄문에 따로 처리해주지 않아도 된다.
		
		sc.close();
	}
}

