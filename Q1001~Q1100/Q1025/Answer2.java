package Q1025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1025
//@How BufferedReader, Math.pow()
//@Memory 11140, @Time 85

public class Answer2 {

	public static void main(String[] args) throws IOException {
		// 풀이법은 Answer1과 동일
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int number = Integer.parseInt(br.readLine());
		int length = String.valueOf(number).length();
		
		for (int i=0; i<length; i++) {
			int tens = (int)Math.pow(10, length-(i+1));
			sb.append("[").append(number/tens*tens).append("]\n");
			number -= number/tens*tens;
		}
		System.out.println(sb);
		br.close();
	}
}
