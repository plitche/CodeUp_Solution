package Q1009;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1009
//@How Scanner + System.out.prinln()
//@Memory 12440, @Time 142

public class Answer1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //System.in > 입력한 값을 바이트 단위로 읽음	
		// 입력을 받을 때 사용. (java.util 패키지에 포함이 되어있어 import를 통해 외부 클래스 호출)
		// 예외처리나 코드 작성의 편리함으로 많이 쓰인다. (상대적으로 여러번 입력을 받을 때 성능이 떨어진다.)
		
		int number = sc.nextInt();	//입력 받을 (정수형)숫자를 number에 저장한다.
		System.out.println(number);
		
		// 입력 받은 숫자를 따로 저장하지 않고 바로 출력 할 수도 있다.
		// System.out.println(sc.nextInt());
		
		sc.close();
	}
}
