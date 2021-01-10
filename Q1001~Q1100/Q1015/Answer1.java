package Q1015;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1015
//@How Scanner + System.out.prinln()
//@Memory 14312, @Time 152

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		float number = sc.nextFloat();

		// 반올림 메소드 없이 소수점 셋 째 자리에서 반올림하기
		number = number*100;	// ex) 0.456789 => 45.6789
		
		String strNumber = String.valueOf(number);
		if (strNumber.charAt(strNumber.indexOf('.')+1) >= '5') {
			//실수타입의 number의 .바로 뒤에있는 소수점 첫 번째 숫자가 5보다 크면
			number+=1;	// number에 1을 더하라 == 반올림하라 (number = 46.6789)
		}
		
		number = (int)number;
		// int 타입으로 케스팅하여 소수점 밑의 숫자를 제거한다.
		// 46.6789 => 46
		number /= 100.0;
		// 위에서 곱한만큼 나누어라
		// 46 => 0.46

		System.out.println(String.format("%.2f", number));
		// String.format에 대한 설명은 Q1012 - Answer1 참고

		sc.close();
	}
}
