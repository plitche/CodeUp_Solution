package Q1051;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1051
//@How Scanner
//@Memory 14296, @Time 107

public class Answer1 {

	public static void main(String[] args) {
		// 이 문제의 기본적인 풀이는 1049/1050번과 동일하다.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 a,b 두개를 입력 받는다.
		
		if (a<=b) {	// b가 a보다 크거나 같으면
			System.out.println(1);
		} else { // 그렇지 않으면
			System.out.println(0);
		}
		
		sc.close();
	}
}

