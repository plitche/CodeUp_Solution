package Q1123;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1123
//@Memory 12660, @Time 98

public class Answer1 {
	// 섭씨 온도가 입력되면 화씨 온도로 변환하시오.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int degree = sc.nextInt();
		
		System.out.println(String.format("%.3f", 9/5.0*degree+32));
		// 화씨 온도 = 9 / 5 * 섭씨온도 + 32
		
		sc.close();
	}

}
