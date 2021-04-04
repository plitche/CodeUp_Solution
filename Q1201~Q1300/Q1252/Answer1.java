package Q1252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1252
//@Memory 14492, @Time 79

public class Answer1 {
	//	어떤 수 n을 입력으로 받아 1부터 n까지의 숫자를 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());

		for (int i=1; i<=a; i++) {
			sb.append(i+" ");
		}
		System.out.println(sb);
	}

}