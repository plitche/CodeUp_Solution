package Q1031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1031
//@How BufferedReader
//@Memory 11088, @Time 83

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Integer.toOctalString(Integer.parseInt(br.readLine())));
		br.close();
	}
}
