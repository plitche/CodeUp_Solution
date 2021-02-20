package Q1076;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1076
//@How Scanner, for
//@Memory 14268, @Time 107

public class Answer1 {
	// 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letter = sc.nextLine().charAt(0);
		
		for (int i=97; i<=letter; i++) {	// i가 97부터 letter까지
											// 아스키코드로 97이 소문자 a이다.
			System.out.print((char)i + " ");	
			// 순차적으로 출력한다. 대신 (char)타입으로 캐스팅해야한다.
			// 줄바꿈을 하면 안된다.
		}
		
		sc.close();
	}
}

