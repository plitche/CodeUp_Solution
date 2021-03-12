package Q1117;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1117
//@Memory 14676, @Time 197

public class Answer1 {
	// 두 실수를 입력받아 두 실수의 곱을 출력하되 소수 둘째자리까지 출력하시오
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double number1 = sc.nextDouble();
		Double number2 = sc.nextDouble();
		
		// 입력 받은 두 실수의 곱
		Double multiple = number1*number2;
		
		// 소수 둘째자리 까지 표현하기 위해
		multiple = (double)Math.round(multiple*100);
		multiple /= 100; 
		
		System.out.println(multiple);
		
		sc.close();
	}

}
