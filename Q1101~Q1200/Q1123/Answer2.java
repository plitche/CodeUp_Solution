package Q1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1123
//@Memory 11488, @Time 72

public class Answer2 {
	// 섭씨 온도가 입력되면 화씨 온도로 변환하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int degree = Integer.parseInt(br.readLine());
		
		sb.append(String.format("%.3f", 9/5.0*degree+32));
		
		System.out.println(sb);
		br.close();
	}

}
