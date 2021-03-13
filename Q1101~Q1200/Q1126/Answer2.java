package Q1126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1126
//@Memory 11148, @Time 64

public class Answer2 {
	// 입력받은 두 수의 기본 연산 5가지를 자동으로 하는 정수 계산기를 제작하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		sb.append(a + " + " + b + " = " + (a+b)).append("\n")
		.append(a + " - " + b + " = " + (a-b)).append("\n")
		.append(a + " * " + b + " = " + (a*b)).append("\n")
		.append(a + " / " + b + " = " + (a/b)).append("\n")
		.append(a + " % " + b + " = " + (a%b));
		
		System.out.println(sb);
		br.close();
	}

}
