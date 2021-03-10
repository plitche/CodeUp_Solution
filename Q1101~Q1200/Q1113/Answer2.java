package Q1113;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1113
//@Memory 11252, @Time 68

public class Answer2 {
	// 두 정수를 입력받아 순서를 바꿔서 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String number1 = st.nextToken();
		String number2 = st.nextToken();
		
		bw.append(number2 + " " + number1);	// 순서바꾸어 bw에 저장
		
		bw.flush();
		bw.close();
		br.close();
	}

}
