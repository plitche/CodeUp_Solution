package Q1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1020
//@How BufferedReader, StringBuilder, StringTokenizer
//@Memory 11132, @Time 88

public class Answer3 {

	public static void main(String[] args) throws IOException {
		// BufferedReader, StringBuilder에 대한 설명은 Q1009 - Answer2 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer에 대한 설명은 Q1013 - Answer2 참고
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			// 읽어드릴 토큰이 남아 있으면 true, 없으면 false => boolean타입으로 반환한다.
			sb.append(st.nextToken());
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
