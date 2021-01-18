package Q1044;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1044
//@How BufferedReader
//@Memory 11152, @Time 67

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 풀이법은 기본적으로 Answer1과 같다.
		System.out.println(Long.parseLong(br.readLine())+1);
		br.close();
	}
}
