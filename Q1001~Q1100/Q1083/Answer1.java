package Q1083;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1083
//@Memory 14356, @Time 113

public class Answer1 {
	// 3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxNum = sc.nextInt();
		
		for (int i=1; i<=maxNum; i++) {		// 1부터 최대 숫자까지 1씩 증가 
			if (i%3==0) {	// 3의 배수이면
				System.out.print('X' + " ");
			} else {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}
}