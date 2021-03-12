package Q1119;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1119
//@Memory 11224, @Time 97

public class Answer2 {
	// 일(day)이 입력으로 주어지면 시간으로 변환하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int day = Integer.parseInt(br.readLine());
		bw.append(String.valueOf(day*24));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
