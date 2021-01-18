package Q1048;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1048
//@How Scanner
//@Memory 14308, @Time 111

public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 정수 a,b 두개를 입력 받는다.
		
		System.out.println(a*(int)Math.pow(2, b));
					// a을 2의 b제곱 하여 출력한다.
					// Math.pow() 메소드는 double 타입임을 결과가 정수형으로 나오게 하기 위해 캐스팅한다.
		
		// 물론 입력 받자마자 연산하여 출력하여도 무관하다.
		// System.out.println(sc.nextInt()*(int)Mapth.pow(2, sc.nextInt());
		
		sc.close();
	}
}

