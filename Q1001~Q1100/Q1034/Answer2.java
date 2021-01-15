package Q1034;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1034
//@How BufferedReader
//@Memory 11096, @Time 85

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Integer.valueOf(br.readLine(), 8));
		// 2진수 -> 10진수 변환 : Integer.valueOf(string, 2);
		// 8진수 -> 10진수 변환 : Integer.valueOf(string, 8);
		// 16진수 -> 10진수 변환 : Integer.valueOf(string, 16);
		// 숫자 스트링을 10진수 int로 반환해줍니다.
		br.close();
	}
}
