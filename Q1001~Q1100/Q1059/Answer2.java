package Q1059;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1059
//@How BufferedReader
//@Memory 11088, @Time 67

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		// 숫자 하나를 입력 받는다.
		
		// 입력받은 정수를 비트단위 연산자로 계산한다.
		System.out.println(~number);
		// ~(bitwise not)
		// &(bitwise and)
		// |(bitwise or)
		// ^(bitwise xor)
		// <<(bitwise left shift)
		// >>(bitwise right shift)
		br.close();
	}
}
