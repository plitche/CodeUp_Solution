package Q1020;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1020
//@How Scanner, indexOf(), subString()
//@Memory 12400, @Time 112

public class Answer2 {

	public static void main(String[] args) {
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		String[] Number = line.split("-");
		// String.split()메소드는 특정 문자를 기준으로 문자열을 나누어 배열(Array)에 저장하여 리턴한다.
		// 따로 배열의 길이를 선언하지 않아도 분리된 문자열의 갯수만큼 자동으로 생성된다.
		
		// String.split(string, int) 인자가 2개인 경우엔,
		// 두번째 인자는 배열의 크기를 한정해준다.
		
		System.out.println(Number[0] + Number[1]);
		
		sc.close();
	}
}
