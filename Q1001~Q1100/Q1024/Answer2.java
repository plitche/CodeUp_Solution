package Q1024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1024
//@How BufferedReader, charAt()
//@Memory 11116, @Time 94

public class Answer2 {

	public static void main(String[] args) throws IOException {
		// BufferedReader, StringBuilder에 대한 설명은 Q1009 - Answer2 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String word = br.readLine();
		
		// hasMoreTokens()에 대한 설명은 Q1020 - Answer3 참고
		for (int i=0; i<word.length(); i++) {
			sb.append("\'").append(word.charAt(i)+"\'\n");
		}
		System.out.println(sb);
		br.close();
	}
}
