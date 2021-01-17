package Q1039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1039
//@How BufferedReader
//@Memory 11144, @Time 68

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 공백을 기준으로 입력되는 두 정수 숫자를 StringTokenizer를 통하여 분리한다.
		
		long num1 = Long.parseLong(st.nextToken());	//토큰에서 하나씩 꺼내어 long타입으로 저장한다.
		long num2 = Long.parseLong(st.nextToken());	//토큰에서 하나씩 꺼내어 long타입으로 저장한다.
		System.out.println(num1 + num2);
		br.close();
	}
}
