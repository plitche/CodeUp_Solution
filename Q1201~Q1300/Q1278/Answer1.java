package Q1278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1278
//@Memory 11116, @Time 84

public class Answer1 {
	//	어떤 숫자가 입력되면 그 숫자가 몇 자릿수 숫자인지 알아내는 프로그램을 작성하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine();

		System.out.println(number.length());
		br.close();
	}
	
}