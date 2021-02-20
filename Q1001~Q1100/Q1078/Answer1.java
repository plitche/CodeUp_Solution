package Q1078;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1078
//@How Scanner, for
//@Memory 14332, @Time 115

public class Answer1 {
	// 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lastNum = sc.nextInt();
		
		int sum = 0;
		for (int i=0; i<=lastNum; i=i+2) {	// i가 0부터 입력받은 숫자까지 2씩 증가 = 짝수
			sum += i;
		}
		System.out.println(sum);
		sc.close();
	}
}

