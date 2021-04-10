package Q1281;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1281
//@Memory 11188, @Time 84

public class Answer1 {
	//	자연수 a, b 사이의 구간에 대해서 홀수는 더하고 짝수는 빼는 식을 보여준 후 결과를 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int result = 0;
		
		// 첫 숫자 양수/음수 먼저 판단
		if (a%2==0) {
			sb.append("-").append(a);
			result += a*-1;	// 음수로 바꾸어주어 결과에 더해준다.
		} else {
			sb.append(a);
			result += a;
		}
		
		// 첫 숫자가 양수/음수냐에 따라 먼저 append하기 때문에 a+1부터 for문 시작
		for (int i=a+1; i<=b; i++) {
			if (i%2==0) {	// 숫자가 짝수이면
				sb.append("-").append(i);
				result += i*-1;	// 음수로 바꾸어주어 결과에 더해준다.
			} else {	// 숫자가 홀수이면
				sb.append("+").append(i);
				result += i;
			}
		}
		// 마지막에 결과 까지 append
		sb.append("=").append(result);
		
		System.out.println(sb);
		br.close();
	}
	
}