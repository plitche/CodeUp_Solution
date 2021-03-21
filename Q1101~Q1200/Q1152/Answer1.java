package Q1152;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1152
//@Memory 11172, @Time 66

public class Answer1 {
	// 10보다 작은 정수가 입력되면 small 을 출력, 그 이상의 수가 입력되면 big 을 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		
		bw.append(a<10? "small":"big");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
