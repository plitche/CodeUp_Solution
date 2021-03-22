package Q1158;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1158
//@Memory 11248, @Time 69

public class Answer1 {
	// 1. 공이 30m~40m나 60m~70m 에 들어오면 슬기가 이김.
	// 2. 그 외의 구간에 떨어지면 체육선생님이 이김.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		
		bw.append((a>=30 && a<=40) || (a>=60 && a<=70) ? "win":"lose");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
