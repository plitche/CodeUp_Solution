package Q1159;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1159
//@Memory 11252, @Time 68

public class Answer1 {
	//	1. 공의 위치가 50m~70m이면 슬기가 이김.
	//	또는
	//	2. 공의 위치가 6의 배수이면 슬기가 이김. 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		
		bw.append((a>=50 && a<=70) || (a%6==0) ? "win":"lose");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
