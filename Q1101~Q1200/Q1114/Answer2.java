package Q1114;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1114
//@Memory 11264, @Time 72

public class Answer2 {
	// 두 정수를 입력받아 합을 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number1 = Integer.parseInt(st.nextToken());
		int number2 = Integer.parseInt(st.nextToken());
		
		bw.append(String.valueOf(number2 + number1));	// 입력받은 두 정수의 합 저장
		
		bw.flush();
		bw.close();
		br.close();
	}

}
