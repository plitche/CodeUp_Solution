package Q1025;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1025
//@How Scanner, Math.pow()
//@Memory 12468, @Time 116

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();	// 숫자(문자열로) 1개를 입력 받는다.
		
		int length = String.valueOf(number).length();	//입력받은 숫자의 길이

		for (int i=0; i<length; i++) { // 입력받은 number의 길이만큼 for문 반복
			int tens = (int)Math.pow(10, length-(i+1));
				// 숫자의 자릿수만큼 10의 거듭제곱을 구한다.
			System.out.print("[");
			System.out.print(number/tens*tens);
			// int/int 의 결과는 int로 소수점 이하는 버리고 몫만 구해진다.
			// 그 구해진 몫에 나누었던 자리수의 10 거듭제곱만큼 다시 곱해준다.
			number -= number/tens*tens;
			// 기존 number에서 몫*tens를 순차적으로 빼준다.
			System.out.println("]");
		}
		sc.close();
	}
}
