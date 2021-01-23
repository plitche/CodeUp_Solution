package Q1060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1060
//@How BufferedReader
//@Memory 11144, @Time 67

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		// 입력된 한 줄을 공백을 기준으로 a,b로 나누어 저장한다.
		
		// 입력받은 정수를 비트단위 연산자로 계산한다.
		System.out.println(a&b);
		// ~(bitwise not)
		// &(bitwise and)
		// |(bitwise or)
		// ^(bitwise xor)
		// <<(bitwise left shift)
		// >>(bitwise right shift)
		
		br.close();
	}
}
