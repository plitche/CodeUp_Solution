package Q1119;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1119
//@Memory 14328, @Time 234

public class Answer1 {
	// 일(day)이 입력으로 주어지면 시간으로 변환하시오.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		System.out.println(day*24);
		
		sc.close();
	}

}
