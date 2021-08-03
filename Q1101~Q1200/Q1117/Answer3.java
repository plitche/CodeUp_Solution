package Q1117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1117
//@Memory 14276, @Time 110

public class Answer3 {
	// 두 실수를 입력받아 두 실수의 곱을 출력하되 소수 둘째자리까지 출력하시오
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		Double number1 = Double.parseDouble(st.nextToken());
		Double number2 = Double.parseDouble(st.nextToken());
		
		// 소수 줄재짜리까지 표현하기 위한 format
		sb.append(String.format("%.2f", number1*number2));
		System.out.print(sb);
		br.close();
	}
}
