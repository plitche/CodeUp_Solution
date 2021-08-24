package Q1257;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1257
//@Memory 11176, @Time 94

public class Answer2 {
	//	시작수와 마지막 수가 입력되면 시작수부터 마지막 수까지의 모든 홀수를 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		// a와 b가 먼저 홀수 인지 판단(3항 연산자)
		a = a%2 == 1 ? a : a+1; // a가 홀수가 아닐때는 a 바로 다음 숫자부터
		b = b%2 == 1 ? b : b-1; // b가 홀수가 아닐때는 b 바로 전 숫자까지
		
		// 입력받은 a와 b의 숫자 만큼 for문 반복
		for (int i=a; i<=b; i+=2) {
			sb.append(i + " ");	
		}
		System.out.print(sb);
	}
	
}