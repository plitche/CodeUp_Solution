package Q1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1011
//@How BufferedReader, StringBuilder
//@Memory 11120, @Time 84

public class Answer2 {

	public static void main(String[] args) throws IOException {
		// BufferedReader, StringBuilder에 대한 설명은 Q1009 - Answer2 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char letter = br.readLine().charAt(0);	
					//String으로 입력받은 문자의 첫번째 문자를 저장한다.
		
		sb.append(letter);
		System.out.println(sb);
		
		// 당연히 br.readLine() 메소드로 입력받는 즉시 출력해도 무관하다.
		// System.out.print(br.readLine());
		
		br.close();
	}
}
