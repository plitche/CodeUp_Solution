package Q1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1269
//@Memory 11200, @Time 85

public class Answer1 {
	//	시작 값(a), 곱할 값(b), 더할 값(c), 몇 번째 항인지 나타내는 정수(n)이 입력으로 주어질 때, 수열의 n번째 항의 값을 구하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		// 첫번째 항이 a그대로임으로 1부터 시작
		for (int i=1; i<n; i++) {
			a = a*b+c;
		}
		
		System.out.println(a);
		br.close();
	}
	
}