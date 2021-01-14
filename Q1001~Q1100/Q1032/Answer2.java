package Q1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1032
//@How BufferedReader
//@Memory 11136, @Time 84

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Integer.toHexString(Integer.parseInt(br.readLine())));
		br.close();
	}
}
