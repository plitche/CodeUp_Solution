package Q1288;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1288
//@Memory 11184, @Time 89

public class Answer1 {
	//	nCr을 구하는 프로그램을 작성하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		int top = n;	//분자
		int row = r;	//분모
		
		// 분자 계산
		for (int i=n-1; i>0; i--) {
			top *= i;
		}
		
		// 분모 계산		
		for (int i=r-1; i>0; i--) {
			row *= i;	
		}
		for (int i=n-r; i>0; i--) {
			row *= i;
		}

		System.out.println(top/row);
		br.close();
	}
	
}