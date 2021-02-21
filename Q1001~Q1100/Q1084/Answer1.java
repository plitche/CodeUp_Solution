package Q1084;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1084
//@Memory, @Time : 시간초과

public class Answer1 {
	// 주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과 총 가짓 수를 계산해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		
		int total = 0;
		for (int i=0; i<r; i++) {	// 0부터 r보다 작은 수까지
			for (int j=0; j<g; j++) {	// 0부터 g보다 작은 수까지
				for (int k=0; k<b; k++) {	// 0부터 b보다 작은 수까지
					System.out.println(i + " " + j + " " + k);
					total += 1;	// for문이 한번 돌때마다 total 1씩 증가
				}
			}
		}
		
		System.out.println(total); //총 경우의 수 출력
		sc.close();
	}
}

