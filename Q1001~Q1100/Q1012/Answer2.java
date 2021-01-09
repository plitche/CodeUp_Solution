package Q1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1012
//@How BufferedReader, StringBuilder
//@Memory 11484, @Time 83

public class Answer2 {

	public static void main(String[] args) throws IOException {
		// BufferedReader, StringBuilder에 대한 설명은 Q1009 - Answer2 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		float number = Float.parseFloat(br.readLine()); 	
					//String으로 입력받은 문자열을 실수형으로 캐스팅하여 저장
		
		sb.append(String.format("%.6f", number));
		System.out.println(sb);
		
		br.close();
	}
}
