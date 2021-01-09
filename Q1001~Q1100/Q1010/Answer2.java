package Q1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1010
//@How BufferedReader, StringBuilder
//@Memory 11108, @Time 100

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 앞선 문제들에서 BufferedWriter와 같은 버퍼를 이용한 함수로, 출력이 아닌 입력을 위한 함수이다.
		// 마찬가지로 버퍼를 이용하기 때문에 입력의 효율이 좋습니다.
		StringBuilder sb = new StringBuilder();
		// StringBuilder는 String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라, 기존의 데이터를 더하는 방식을 사용한다.
		// 속도도 빠르며 상대적으로 부하가 적다.
		
		// Scanner와 다르게, 엔터만 경계로 인식하고 받은 데이터가 String으로 고정이 된다.
		// 가공을 해야하는 번거로움이 있다.
		int number = Integer.parseInt(br.readLine());	
					//String으로 고정된 데이터를 Integer타입으로 변형해준다.
		
		sb.append(number);	//입력 받은 number를 저장(더한다)한다.
		
		System.out.println(sb);	//StringBuilder의 인스턴스인 sb의 toString()을 불러서 출력
		// System.out.print() 메소드는 toString()이 내장? 되어있다.
		
		// 당연히 숫자를 br.readLine() 메소드로 입력받는 즉시 출력해도 무관하다.
		// System.out.print(br.readLine());
		
		br.close();
	}
}
