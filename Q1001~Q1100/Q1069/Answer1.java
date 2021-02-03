package Q1069;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1069
//@How Scanner
//@Memory 14212, @Time 113

public class Answer1 {
	// 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
	// A : best!!!, B : good!!, C : run!, D : slowly~, 나머지 문자들 : what?
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letter = sc.next().charAt(0);
		// 문자 1개를 입력 받는다.
		
		if (letter == 'A') { // 입력받은 문자가 'A'이면, 혹은 아스키 코드를 활용해서 숫자 65랑 비교해도 된다.
			System.out.println("best!!!");
		} else if (letter == 'B'){	// 입력받은 문자가 'B'이면, 혹은 숫자 66랑 비교해도 된다.
			System.out.println("good!!");
		} else if (letter == 'C'){	// 입력받은 문자가 'C'이면, 혹은 숫자 67랑 비교해도 된다.
			System.out.println("run!");
		} else if (letter == 'D'){	// 입력받은 문자가 'D'이면, 혹은 숫자 68랑 비교해도 된다.
			System.out.println("slowly~");
		} else {	// A,B,C,D 이외의 문자이면
			System.out.println("what?");
		}
		
		sc.close();
	}
}

