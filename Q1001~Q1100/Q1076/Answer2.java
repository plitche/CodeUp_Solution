package Q1076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1076
//@How BufferedReader
//@Memory 11164, @Time 65

public class Answer2 {
	// 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char letter = br.readLine().charAt(0);
		StringBuilder sb = new StringBuilder();
		
		for (int i=97; i<=letter; i++) {	// i가 97부터 letter까지
											// 아스키코드로 97이 소문자 a이다.
			sb.append((char)i + " ");	
			// 순차적으로 출력한다. 대신 (char)타입으로 캐스팅해야한다.
			// 줄바꿈을 하면 안된다.
		}
		
		System.out.println(sb);
		br.close();
	}
}