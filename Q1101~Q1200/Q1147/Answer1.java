package Q1147;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1147
//@Memory 11220, @Time 65

public class Answer1 {
	// 정수 a, x를 입력받아 a의 값을 x만큼 SHIFT(<<) 연산한 후 결과를 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		bw.append(String.valueOf(a<<x));	// 비트 연산자(SHIFT)는 '<<'기호를 통해 할 수 있다.
		bw.flush();
		br.close();
		bw.close();
	}

}
