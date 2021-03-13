package Q1125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1125
//@Memory 11112, @Time 70

public class Answer2 {
	// 10진수 정수를 입력받아 8진수와 16진수로 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int decimalNo = Integer.parseInt(br.readLine());
		
		String octalNo = Integer.toOctalString(decimalNo);
		String hexNo = Integer.toHexString(decimalNo).toUpperCase();
		
		sb.append(octalNo).append(" ").append(hexNo);
		
		System.out.println(sb);
		br.close();
	}

}
