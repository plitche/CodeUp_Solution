package Q1295;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1295
//@Memory 11188, @Time 87

public class Answer1 {
	//	주어지는 문장의 대문자를 소문자로, 소문자를 대문자로 변경하는 프로그램을 작성하라.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		
		// 입력받은 문자열의 길이만큼 반복
		for (int i=0; i<line.length(); i++) {
			if (line.charAt(i)<=57) {	// 숫자이면 그대로 append
				sb.append((char)line.charAt(i));
			} else if (line.charAt(i)<=90) {	// 아스키 코드를 활용 (90이하면 대문자)
				sb.append((char)(line.charAt(i)+32));
			} else {
				sb.append((char)(line.charAt(i)-32));
			}
			 
		}
		
		System.out.println(sb);
		br.close();
	}
	
}