package Q1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1018
//@How BufferedReader, StringBuilder
//@Memory 11096, @Time 89

public class Answer2 {

	public static void main(String[] args) throws IOException {
		// BufferedReader에 대한 설명은 Q1009 - Answer2 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		int position = line.indexOf(':');
		int hour = Integer.parseInt(line.substring(0, position));
		int minute = Integer.parseInt(line.substring(position+1));
		// subString에 대한 설명은 Q1018 - Answer1 참고
		
		StringBuilder sb = new StringBuilder();

		sb.append(hour).append(':').append(minute);
		// == sb.append(hour + ":" + minute);	
		// 여기서 ':' 이렇게 작성하게 되면 아스키코드 값으로 +연산을 한다.
		
		System.out.println(sb);
		
		// 입력 받은 그대로 출력해도 무관하나, 문제의 취지와 어긋난다.
		// System.out.println(line);
		
		br.close();
	}
}
