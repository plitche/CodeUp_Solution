package Q1144;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1144
//@Memory 11232, @Time 70

public class Answer1 {
	// 두 수를 입력받아 비트단위로 OR연산한 후 결과를 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		bw.append(String.valueOf(a|b));	// 비트 연산자(OR)는 '|'기호를 통해 할 수 있다.
		bw.flush();
		br.close();
		bw.close();
	}

}
