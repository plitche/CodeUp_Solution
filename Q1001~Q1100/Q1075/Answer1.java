package Q1075;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1075
//@How Scanner, for
//@Memory 14364, @Time 114

public class Answer1 {
	// 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for (int i=number-1; i>=0; i--) {	// i가 number부터 시작해서 1까지 
			System.out.println(i);	// 순차적으로 출력한다.
		}
		
		sc.close();
	}
}

