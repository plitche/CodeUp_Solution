package Q1091;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1091
//@Memory 11156, @Time 66

public class Answer2 {
	// 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)가 공백을 두고 입력된다.(a, m, d는 -50 ~ +50, n은 10이하의 자연수)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		// 물론 for문을 사용하도 무관하다.
		// while문을 이용하여 n을 1씩 줄여나가고 그 숫자가 1이상이어야만 반복한다.
		while(n-->1) {
			a = a*m+d;	// a의 값을 m을 곱한 값에 d를 더한 값으로 초기화한다.
		}
		
		System.out.println(a);
	
	}
	
}