package Q1081;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1081
//@Memory 14344, @Time 118

public class Answer1 {
	// 1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		
		for (int i=1; i<=dice1; i++) {		// 첫번째 주사위 
			for (int j=1; j<=dice2; j++) {	// 두번째 주사위
				System.out.println(i + " " + j);	// 2중 for문을 이용하여 한줄씩 출력
			}
		}
		
		sc.close();
	}
}

