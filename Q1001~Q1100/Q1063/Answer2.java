package Q1063;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1063
//@How BufferedReader
//@Memory 11140, @Time 66

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		// 정수 2개를 입력 받는다.
		
		// 삼항 연산자를 이용해서 출력한다. (문제 조건)
		System.out.println(a>b ? a : b);
		
		br.close();
	}
}
