package Q1094;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1094
//@Memory 33404, @Time 379

public class Answer1 {
	// 출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[sc.nextInt()];	// 총 출석을 부를 숫자만큼 배열 길이 선언
		
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();	// 순차적으로 출석 부른 숫자를 배열에 저장
		}
		
		for(int i=a.length-1; i>=0; i--) {	// 배열 마지막 index부터 거꾸로
			System.out.print(a[i] + " ");	// 각 index별 총 불린 횟수 출력
		}
	
		sc.close();
	}
}