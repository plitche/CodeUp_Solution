package Q1013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1013
//@How BufferedReader
//@Memory 11108, @Time 83

public class Answer2 {

	public static void main(String[] args) throws IOException {
		// BufferedReader에 대한 설명은 Q1009 - Answer2 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();	// 띄어쓰기로 입력한 숫자 두개를 한줄로 일단 저장한다.
		StringTokenizer st = new StringTokenizer(line, " ");
		// StringTokenizer는 문자열을 구분자를 기준으로 나누는데(슬라이싱) 사용된다.
		
		int number1 = Integer.parseInt(st.nextToken());	
		int number2 = Integer.parseInt(st.nextToken());
		// 나눈 문자열을 하나씩 꺼내서 int타입으로 캐스팅하여 저장
		
		System.out.println(number1 + " " + number2);
		
		// 물론 따로 number에 저장하지 않고 바로 출력 가능하다.
		// System.out.println(Integer.parseInt(st.nextToken()) + " " + Integer.parseInt(st.nextToken()));
		
		br.close();
	}
}
