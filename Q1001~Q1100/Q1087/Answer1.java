package Q1087;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1087
//@Memory 14324, @Time 113

public class Answer1 {
	// 1, 2, 3 ... 을 순서대로 계속 더해나갈 때, 그 합이 입력한 정수보다 작을 동안만 계속 더하는 프로그램을 작성해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int output = 0;	// 출력할 결과값
		int plus = 1;	// 결과값에 더해줄 값
		while(input>output) {	//input이 output보다 큰 경우 반복 실행
			output += plus;
			plus++;	// 더해주고 난 이후 1씩 올려라
		}
		
		System.out.println(output);
		sc.close();
	}
}

