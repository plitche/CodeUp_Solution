package Q1077;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1077
//@How BufferedReader
//@Memory 11196, @Time 66

public class Answer2 {
	// 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lastNum = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<=lastNum; i++) {	// i가 0부터 입력받은 숫자까지 1씩 증가
			sb.append(i + "\n");	
		}
		
		System.out.println(sb);
		br.close();
	}
}