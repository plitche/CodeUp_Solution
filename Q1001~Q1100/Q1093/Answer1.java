package Q1093;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1093
//@Memory 29924, @Time 218

public class Answer1 {
	// 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 총 부른 횟수
		int[] a = new int[24];	// 각 번호(1~23) 총 24명의 숫자만큼 배열 길이 선언
		
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();	// 어떤 번호를 불렀는지.
			a[t] += 1;	// 불린 번호의 index 값에 1 추가 하기
		}
		
		for(int i = 1; i <= 23; i ++) {
			System.out.print(a[i] + " ");	// 각 index별 총 불린 횟수 출력
		}
	
		sc.close();
	}
}