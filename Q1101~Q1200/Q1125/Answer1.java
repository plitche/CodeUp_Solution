package Q1125;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1125
//@Memory 12492, @Time 90

public class Answer1 {
	// 10진수 정수를 입력받아 8진수와 16진수로 출력한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimalNo = sc.nextInt();
		
		String octalNo = Integer.toOctalString(decimalNo);
		String hexNo = Integer.toHexString(decimalNo).toUpperCase();
		
		System.out.println(octalNo + " " + hexNo);
		
		sc.close();
	}

}
