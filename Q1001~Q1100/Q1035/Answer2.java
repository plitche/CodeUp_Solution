package Q1035;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1035
//@How BufferedReader
//@Memory 11092, @Time 84

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hexadecimal = br.readLine();	//16진수로 입력 받기
		int decimalNumber = Integer.valueOf(hexadecimal, 16); //10 진수로 전환
		String octalString = Integer.toOctalString(decimalNumber);;	//8진수로 전환
		System.out.println(octalString);
		br.close();
	}
}
