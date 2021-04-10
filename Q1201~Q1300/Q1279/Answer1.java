package Q1279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1279
//@Memory 11184, @Time 83

public class Answer1 {
	//	두 자연수 a, b 사이의 구간에 대해서 홀수는 더하고 짝수는 뺀다음의 합을 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int result = 0;
		for (int i=a; i<=b; i++) {
			if (i%2==0) {	// 숫자가 짝수이면
				result += i*-1;	// 음수로 바꾸어주어 결과에 더해준다.
			} else {	// 숫자가 홀수이면
				result += i;
			}
		}
		
		System.out.println(result);
		br.close();
	}
	
}