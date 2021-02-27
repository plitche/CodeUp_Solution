package Q1088;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1088
//@Memory 11252, @Time 69

public class Answer2 {
	// 1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되, 3의 배수인 경우는 출력하지 않도록 만들어보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=input; i++) {	// 1부터 입력된 숫자보다 크지않을때까지
			if (i%3!=0) {	// 3의 배수는 출력하지 않기
				bw.append(String.valueOf(i)).append(" ");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}