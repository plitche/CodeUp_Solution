package Q1015;

import java.util.Scanner;

// @author Yongsoo Kwon
// @URL https://www.codeup.kr/problem.php?id=1015
// @How Scanner, String.format()
// @Memory 14360, @Time 154

public class Answer2 {

	public static void main(String[] args) {
		
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		float number = sc.nextFloat();
		
		System.out.println(String.format("%.2f", number));
		// String.format에 대한 설명은 Q1012 - Answer1 참고
		// String.format은 앞서 설명한 것처럼 리턴되는 문자열 형태를 지정하는 함수인데, 
		// Math.round() 함수와 같이 n번째 자리까지 반올림하여 나타낼 수 있다.
		
		// Math.round()와 String.format에 대한 차이점은 Q1015 - Answer3에서 설명
	}
}
