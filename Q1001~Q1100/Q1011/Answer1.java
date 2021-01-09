package Q1011;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1011
//@How Scanner + System.out.prinln()
//@Memory 12392, @Time 159

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		
		char letter = sc.next().charAt(0);	//입력 받은 문자열의 첫번째 문자를 letter에 저장한다.
		// next() 메소드는 String으로 입력 받기 때문에 형변환이 필요하다.
		// 혹은 그냥 String으로 받아도 무관하나, 문제에서 char타입으로 변수를 저장하라고 했으므로.
		
		System.out.println(letter);
		
		// 입력 받은 문자를 따로 저장하지 않고 바로 출력 할 수도 있다.
		// System.out.println(sc.next().charAt(0));

		sc.close();// 
	}
}
