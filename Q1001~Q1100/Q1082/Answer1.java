package Q1082;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1082
//@Memory 14312, @Time 110

public class Answer1 {
	// A, B, C, D, E, F 중 하나가 입력될 때, 1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letter = sc.nextLine();
		
		//String에서 16진수로 변경
		int a = Integer.valueOf(letter, 16);
		
		String multipleNum;
		String result;
		for (int i = 1; i < 16; i++) {
			multipleNum = Integer.toHexString(i).toUpperCase();
			result = Integer.toHexString(a * i).toUpperCase();
			System.out.println(letter + "*" + multipleNum + "=" + result);
		}
		
		sc.close();
	}
}

