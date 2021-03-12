package Q1118;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1118
//@Memory 14396, @Time 180

public class Answer1 {
	// 삼각형의 넓이를 구하는 프로그램을 작성한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 밑변 a
		int b = sc.nextInt(); // 높이 b
		
		double space = a*b/2.0;	// 자동 형변환을 위해 double타입으로 나누기.
		
		System.out.println(space);
		
		sc.close();
	}

}
