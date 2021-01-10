package Q1015;

import java.util.Scanner;

// @author Yongsoo Kwon
// @URL https://www.codeup.kr/problem.php?id=1015
// @How Scanner, Math.round()
// @Memory 14324, @Time 132

public class Answer3 {

	public static void main(String[] args) {
		
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		float number = sc.nextFloat();
		
		number = (float)(Math.round(number*100) / 100.0);
		// Math함수의 round() 메소드는 실수의 소수점 첫번째 자리에서 반올림하여 정수로 리턴한다.
		// 때문에 소수점 3째자리에서 반올림 하기위해 100을 곱하고 100을 나눠준다.
		
		System.out.println(String.format("%.2f", number));
		// String.format을 쓴 이유: 그냥 number를 출력하게되면 1.0형태로 출력됨. 1.00형태로 출력하기 위해
		// String.format에 대한 설명은 Q1012 - Answer1 참고
	}
}
