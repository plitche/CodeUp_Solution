package Q1053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1053
//@How BufferedReader
//@Memory 11092, @Time 68

public class Answer3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		// 숫자 하나를 입력 받는다.
		
		System.out.println(number==1 ? 0 : 1);
		br.close();
	}
}
