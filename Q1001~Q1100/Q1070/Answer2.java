package Q1070;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1070
//@How Scanner, switch
//@Memory 14288, @Time 108

public class Answer2 {
	// 월이 입력될 때 계절 이름이 출력되도록 해보자
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		// 월을 입력받는다.
		
		switch (month) { 
		case 12 :
		case 1 : 
		case 2 : System.out.println("winter"); break;
		case 3 : 
		case 4 : 
		case 5 : System.out.println("spring"); break;
		case 6 : 
		case 7 : 
		case 8 : System.out.println("summer"); break;
		default: System.out.println("fall"); break;
		}
		
		sc.close();
	}
}

