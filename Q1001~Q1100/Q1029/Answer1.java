package Q1029;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1029
//@How Scanner
//@Memory 14268, @Time 131

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double number = sc.nextDouble();
		System.out.println(String.format("%.11f", number));
		// String.format() 메소드를 통해 소수점 11자리까지 반올림한다.
		// X 10의 11승 하여 Math.round()를 통해 반올림 후 10의 11승으로 나누어 풀이도 가능하다.
		sc.close();
	}
}

