package Q1035;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1035
//@How Scanner
//@Memory 12412, @Time 105

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hexadecimal = sc.nextLine();	//16진수 입력받기
		int decimalNumber = Integer.valueOf(hexadecimal, 16); // 10진수로 변환
		String octalNumber = Integer.toOctalString(decimalNumber); //8진수로 변환
		System.out.println(octalNumber);
		sc.close();
	}
}

