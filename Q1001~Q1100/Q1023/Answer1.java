package Q1023;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1023
//@How Scanner, substring(), indexOf()
//@Memory 13620, @Time 118

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		Double number = sc.nextDouble();
		
		// substring에 대한 설명은 Q1018 - Answer1 참고
		int frontNo = Integer.parseInt(String.valueOf(number).substring(0, String.valueOf(number).indexOf('.')));
		// Math.floor() 함수는 소수점 이하를 버림(내림) 처리하여, 음수일때 잘못된 값이 반환된다. 주의!
		// indexOf를 사용하여 "."의 index위치를 찾아 substring으로 처음부터 그 위치까지만 추출한다.
		
		int backNo = Integer.parseInt(String.valueOf(number).substring(String.valueOf(frontNo).length()+1));
		// number은 frontNo.backNo 형태이다.
		// frontNo의 String형태의 길이에 "."까지 1을 더하여 number에서 substring으로 추출한다.
		
		System.out.println(frontNo);
		System.out.println(backNo);
		sc.close();
	}
}
