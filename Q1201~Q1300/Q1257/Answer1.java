package Q1257;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1257
//@Memory 11172, @Time 68

public class Answer1 {
	//	시작수와 마지막 수가 입력되면 시작수부터 마지막 수까지의 모든 홀수를 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		// 입력받은 a와 b의 숫자 만큼 for문 반복
		for (int i=a; i<=b; i++) {
			if (i%2==1) {	// %연산자를 통해서 홀수인지 판단
				sb.append(i + " ");	
			}
		}
		System.out.println(sb);
	}
	
}