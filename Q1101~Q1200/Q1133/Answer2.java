package Q1133;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1133
//@Memory 11156, @Time 60

public class Answer2 {
	// 공백이 있는 문자열을 입력받아 출력해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.append(br.readLine());
		bw.flush();
		br.close();
		bw.close();
	}

}
