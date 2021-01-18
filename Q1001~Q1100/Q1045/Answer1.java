package Q1045;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1045
//@How Scanner
//@Memory 14488, @Time 115

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1+num2);	//합
		System.out.println(num1-num2);	//차
		System.out.println(num1*num2);	//곱
		System.out.println(num1/num2);	//몫
		System.out.println(num1%num2);	//나머지
		System.out.println(String.format("%.2f", num1/(double)num2));	//나누기
		sc.close();
	}
}

