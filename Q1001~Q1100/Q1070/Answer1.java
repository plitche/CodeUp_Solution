package Q1070;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1070
//@How Scanner, if
//@Memory 14304, @Time 117

public class Answer1 {
	// 월이 입력될 때 계절 이름이 출력되도록 해보자
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		// 문자열 1개를 입력 받는다.
		
		if (month == 12 || month == 1 || month == 2) {
			System.out.println("winter");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.println("spring"); 
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("summer"); 
		} else {
			System.out.println("fall");
		}
		
		sc.close();
	}
}

