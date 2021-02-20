package Q1077;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1077
//@How Scanner, for
//@Memory 14352, @Time 121

public class Answer1 {
	// 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lastNum = sc.nextInt();
		
		for (int i=0; i<=lastNum; i++) {	// i가 0부터 입력받은 숫자까지 1씩 증가
			System.out.println(i);	
		}
		
		sc.close();
	}
}

