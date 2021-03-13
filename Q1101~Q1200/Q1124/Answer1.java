package Q1124;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1124
//@Memory 12404, @Time 92

public class Answer1 {
	// 귀찮은 광곽이를 위해서 화학식을 입력하면 분자량을 구해주는 프로그램을 만들어 주자! 화학식은 CxHy의 꼴로 입력된다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String chemical = sc.next();
		
		int cIdx = 0;	// C*H* 형태이기 떄문에 문자 C가 가장 첫째 자리
		int hIdx = chemical.indexOf('H');	// H 문자가 위치한 index
		
		int c = Integer.parseInt(chemical.substring(cIdx+1, hIdx));
		int h = Integer.parseInt(chemical.substring(hIdx+1));
		
		System.out.println(c*12 + h*1);
		
		sc.close();
	}

}
