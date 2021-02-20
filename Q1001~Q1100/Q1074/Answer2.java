package Q1074;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1074
//@How BufferedReader
//@Memory 11160, @Time 68

public class Answer2 {
	// 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i=number; i>0; i--) {	// i가 number부터 시작해서 1까지 
			sb.append(i+"\n"); // 순차적으로 sb에 더해준다.
		}
		
		System.out.println(sb);
		br.close();
	}
}