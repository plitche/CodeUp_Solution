package Q1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1015
//@How BufferedReader, String.format()
//@Memory 11484, @Time 93

public class Answer4 {

	public static void main(String[] args) throws IOException {
		// BufferedReader에 대한 설명은 Q1009 - Answer2 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float number = Float.parseFloat(br.readLine());
		
		System.out.println(String.format("%.2f", number));
		
		br.close();
	}
}
