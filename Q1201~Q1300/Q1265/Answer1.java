package Q1265;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1265
//@Memory 11176, @Time 69

public class Answer1 {
	//	구구단의 원하는 단을 입력하면 그 단의 구구단이 출력되게 하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int dan = Integer.parseInt(br.readLine());
		
		// 구구단 1~9까지이기 때문에 9번 반복
		for (int i=1; i<10; i++) {
			sb.append(dan).append("*").append(i).append("=").append(dan*i).append("\n");
		}
		
		System.out.println(sb);
	}
	
}