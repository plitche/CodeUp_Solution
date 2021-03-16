package Q1151;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1151
//@Memory 11208, @Time 67

public class Answer1 {
	// 10보다 작은 수가 입력되면 small 을 출력, 10이상이면 아무것도 출력하지 마시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		
		bw.append(a<10? "small":"");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
