package Q1275;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1275
//@Memory 11200, @Time 78

public class Answer1 {
	//	공백을 기준으로 n과 k가 주어진다. (n은 0이 아닌 정수, k>=0) nk의 결과를 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		// Math.pow함수는 제곱을 할 수 있습니다.
		System.out.println((int)Math.pow(n, k));
		br.close();
	}
	
}