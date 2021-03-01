package Q1090;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1090
//@Memory 14336, @Time 113

public class Answer1 {
	// 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가 공백을 두고 입력된다.(모두 0 ~ 10)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		// 물론 for문을 사용하도 무관하다.
		// while문을 이용하여 n을 1씩 줄여나가고 그 숫자가 1이상이어야만 반복한다.
		while(n-->1) {
			a *= r;	// 반복할 때 마다 등비의 값 r만큼 시작 값 a에 곱하여 준다.
		}
		
		System.out.println(a);
		sc.close();
	}
}

