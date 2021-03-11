package Q1115;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1115
//@Memory 11244, @Time 69

public class Answer2 {
	// 두 정수의 덧셈의 결과를 출력한다.두 수는 int 범위를 넘어선 64비트 정수형 값이다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Long number1 = Long.parseLong(st.nextToken());
		Long number2 = Long.parseLong(st.nextToken());
		
		bw.append(String.valueOf(number2 + number1));	// 입력받은 두 정수의 합 저장
		
		bw.flush();
		bw.close();
		br.close();
	}

}
