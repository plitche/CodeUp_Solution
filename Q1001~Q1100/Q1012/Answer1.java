package Q1012;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1012
//@How Scanner + System.out.prinln()
//@Memory 14204, @Time 129

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		
		float number = sc.nextFloat();	
		// System.out.println(number);	//그대로 출력하면 입력받은 소수점 자리수 까지만 출력되므로.
		System.out.println(String.format("%.6f", number));
		// String.format은  String의 static()메소드인 format()메소드로 문자열의 형식을 설정한다.
		// %d, %x, %o, %f, %s 등등 타입에 맞게 사용해야 함.
		
		// 입력 받은 문자를 따로 저장하지 않고 바로 출력 할 수도 있다.
		// System.out.println(String.format("%.6f", sc.nextFloat()));

		sc.close();
	}
}
