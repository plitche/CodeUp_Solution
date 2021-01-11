package Q1017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1017
//@How BufferedReader, StringBuilder
//@Memory 11140, @Time 85

public class Answer2 {

	public static void main(String[] args) throws IOException {
		// BufferedReader에 대한 설명은 Q1009 - Answer2 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<3; i++) {
			sb.append(number).append(" ");	//number을 3번 sb에 더하다.
		}
		System.out.println(sb);
		
		// 물론 아래와 같이 한줄로 작성도 가능하다.
		// System.out.println(number + " " + number + " " + number);
		
		br.close();
	}
}
