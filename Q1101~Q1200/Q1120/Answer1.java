package Q1120;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1120
//@Memory 14508, @Time 181

public class Answer1 {
	// 세 정수가 입력되면 평균을 출력하시오.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(String.format("%.2f", (a+b+c)/3.0));
		
		sc.close();
	}

}
