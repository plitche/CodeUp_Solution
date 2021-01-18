package Q1046;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1046
//@How Scanner
//@Memory 14508, @Time 119

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long total = sc.nextInt() + sc.nextInt() + sc.nextInt();
		double avg = total/3.0;
			// 평균은 소수점이 있는 실수로 값이 나올 가능성이 있기 때문에 3.0 인 실수타입으로 나누어준다.
			// 물론 (double)타입으로 캐스팅하여 정수를 나누어줘도 무관하다.
		System.out.println(total);
		System.out.println(String.format("%.1f", avg));
		sc.close();
	}
}

