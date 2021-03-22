package Q1157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1157
//@Memory 11276, @Time 71

public class Answer1 {
	// 슬기가 던진 공의 위치가 입력으로 주어지면 50이상 60이하이면 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Double a = Double.parseDouble(br.readLine());
		
		bw.append((a>=50 && a<=60) ? "win":"lose");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
