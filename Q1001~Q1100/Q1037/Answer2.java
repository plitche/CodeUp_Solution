package Q1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1037
//@How BufferedReader
//@Memory 11140, @Time 62

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println((char)Integer.parseInt(br.readLine()));
		// BufferedReader는 이전에 설명한 것 처럼 String타입으로 입력을 받기 때문에
		// 정수형으로 캐스팅 후 char탕비으로 다시 변화을 해주어야 한다.
		br.close();
	}
}
