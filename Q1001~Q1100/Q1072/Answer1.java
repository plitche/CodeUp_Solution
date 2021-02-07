package Q1072;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1072
//@How Scanner, for
//@Memory 14388, @Time 121

public class Answer1 {
	// n개의 입력된 정수를 순서대로 출력해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		// 몇개의 숫자를 입력받을지 입력받는다.
		
		for (int i=0; i<testCase; i++) {	// 입력받은 숫자만큼 for문을 돌린다.
			System.out.println(sc.nextInt()); 
			// 줄을 바꾸어서 출력해야 하기 때문에 그냥 print로 하면 안된다.
		}
		
		sc.close();
	}
}
