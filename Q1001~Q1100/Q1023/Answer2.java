package Q1023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1023
//@How BufferedReader, StringTokenizer
//@Memory 11132, @Time 85

public class Answer2 {

	public static void main(String[] args) throws IOException {
		// BufferedReader, StringBuilder에 대한 설명은 Q1009 - Answer2 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer에 대한 설명은 Q1013 - Answer2 참고
		StringTokenizer st = new StringTokenizer(br.readLine(), ".");
		// 한 줄(br)을 입력 받아 StringTokenizer를 통해 "."을 기준으로 분리한다.
		StringBuilder sb = new StringBuilder();
		
		// hasMoreTokens()에 대한 설명은 Q1020 - Answer3 참고
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken()).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
