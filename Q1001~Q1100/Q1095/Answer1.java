package Q1095;

import java.util.Arrays;
import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1095
//@Memory 31520, @Time 240

public class Answer1 {
	// 출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[sc.nextInt()];	// 총 출석을 부를 숫자만큼 배열 길이 선언
		
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();	// 순차적으로 출석 부른 숫자를 배열에 저장
		}
		
		Arrays.sort(a);	// 기본타입 배열 오른차순 정렬 
		System.out.print(a[0]);	// 정렬 후 첫번째 index 값 출력
	
		sc.close();
	}
}