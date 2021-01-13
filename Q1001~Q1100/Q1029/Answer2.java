package Q1029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1029
//@How BufferedReader
//@Memory 11460, @Time 97

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double number = Double.parseDouble(br.readLine());
		System.out.println(String.format("%.11f", number));
		br.close();
	}
}
