package Q1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1065
//@How BufferedReader
//@Memory 11164, @Time 67

public class Answer2 {
	// 세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		// 정수 3개를 입력 받는다.
		
		// 짝수를 찾는다.
		if (a%2 == 0) {	//나누기 2를하여 나머지가 없으면 그 수는 짝수이다.
			System.out.println(a);
		}
		if (b%2 == 0) {	//나누기 2를하여 나머지가 없으면 그 수는 짝수이다.
			System.out.println(b);
		}
		if (c%2 == 0) {	//나누기 2를하여 나머지가 없으면 그 수는 짝수이다.
			System.out.println(c);
		}
		
		br.close();
	}
}