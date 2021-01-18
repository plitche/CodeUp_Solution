package Q1047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1047
//@How BufferedReader
//@Memory 11160, @Time 66

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 풀이법은 기본적으로 Answer1과 같다.
		int number = Integer.parseInt(br.readLine());
		// 정수 1개를 입력받는다.
		System.out.println(number*2); // 입력받은 정수의 *2값을 출력한다.
		br.close();
	}
}
