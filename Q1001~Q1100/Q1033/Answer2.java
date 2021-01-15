package Q1033;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1033
//@How BufferedReader
//@Memory 11108, @Time 96

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Integer.toHexString(Integer.parseInt(br.readLine())).toUpperCase());
		// 소문자를 대문자로 변환 : toUpperCase()
		br.close();
	}
}
