package Q1062;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1062
//@How BufferedReader
//@Memory 11124, @Time 68

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		// 정수 2개를 입력 받는다.
		
		// 입력받은 정수를 비트단위 연산자로 계산한다.
		System.out.println(a^b);	// ^연산자는 xor, circumflex/caret 서컴플렉스/카릿 이라고 한다.
		// ~(bitwise not)
		// &(bitwise and)
		// |(bitwise or)
		// ^(bitwise xor)
		// <<(bitwise left shift)
		// >>(bitwise right shift)
		
		br.close();
	}
}
