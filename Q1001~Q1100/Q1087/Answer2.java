package Q1087;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1087
//@Memory 11148, @Time 67

public class Answer2 {
	// 1, 2, 3 ... 을 순서대로 계속 더해나갈 때, 그 합이 입력한 정수보다 작을 동안만 계속 더하는 프로그램을 작성해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int output = 0;	// 출력할 결과값
		for(int i=1; input>output; i++) {	// input이 output보다 큰 경우 반복 실행 
			output+=i;
		}
		
		System.out.println(output);
		br.close();
	}
}