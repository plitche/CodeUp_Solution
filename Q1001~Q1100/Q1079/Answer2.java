package Q1079;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1079
//@Memory 11196, @Time 69

public class Answer2 {
	// 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String letters = br.readLine();
		StringTokenizer st = new StringTokenizer(letters, " ");
		// 공백 1칸을 기준으로 토큰을 나눈다.
		StringBuilder sb = new StringBuilder();

		while(st.hasMoreTokens()) {		// 토큰이 존재할때까지 -> 사실 true로 해도 무관하다.
			String a = st.nextToken();	// 토큰에서 순서대로 꺼내어 String으로 저장한다.
			sb.append(a + "\n");	// 저장된 String을 StringBuilder에 append해준다.
			
			if (a.equals("q")) {	// 만약 꺼낸 토큰이 q인경우에는 while문을 종료한다.
				break;
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}