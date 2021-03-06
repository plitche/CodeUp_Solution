package Q1258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1258
//@Memory 11148, @Time 61

public class Answer2 {
	//	정수 n이 입력으로 들어오면 1부터 n까지의 합을 구하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());

		int n = 0;	// 처음부터 시작될 숫자 n을 초기화 선언
		int total = 0; 	// 합계를 0으로 초기화 선언
		
		// 입력받은 숫자 만큼 for문 반복
		while (n++<number) {
			total += n;
		}
		
		System.out.println(total);
	}
	
}