package Q1122;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1122
//@Memory 12484, @Time 85

public class Answer1 {
	// 초를 입력받아 분 / 초의 형태로 출력하시오.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seconds = sc.nextInt();
		
		int minutes = seconds/60;	// 60으로 나누었을 때 몫
		seconds = seconds%60;	// 60으로 나누었을 때 나머지
		
		System.out.println(minutes + " " + seconds);
		
		sc.close();
	}

}
