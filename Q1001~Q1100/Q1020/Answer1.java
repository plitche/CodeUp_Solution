package Q1020;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1020
//@How Scanner, indexOf(), subString()
//@Memory 12392, @Time 129

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();	//주민등록번호 입력받기
		
		// indexOf(), subString()에 대한 설명은 Q1019 - Answer1 참고
		int position = line.indexOf('-');
		String front = line.substring(0, position);
		String back = line.substring(position+1);
		
		System.out.println(front+back);

		sc.close();
	}
}
