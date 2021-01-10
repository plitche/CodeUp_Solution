package Q1014;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1014
//@How Scanner + System.out.prinln()
//@Memory 12364, @Time 107

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		String letter1 = sc.next();
		String letter2 = sc.next();	

		System.out.println(letter2 + " " + letter1);	//순서를 바꿔서 출력
		// " " 대신 "\s" 사용 가능

		sc.close();
	}
}
