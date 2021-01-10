package Q1014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1014
//@How BufferedReader
//@Memory 11116, @Time 85

public class Answer2 {

	public static void main(String[] args) throws IOException {
		// BufferedReader에 대한 설명은 Q1009 - Answer2 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// StringTokenizer에 대한 설명은 Q1013 - Answer2 참고
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		//입력 받은 한 줄을 바로 넣어서 띄어쓰기 기준으로 나누기
		
		String letter1 = st.nextToken();	
		String letter2 = st.nextToken();
		// 나눈 문자열을 하나씩 꺼내서 String타입으로 저장
		
		System.out.println(letter2 + " " + letter1); // 순서를 바꾸어서 출력
		
		br.close();
	}
}
