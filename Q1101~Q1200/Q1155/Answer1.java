package Q1155;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1155
//@Memory 11212, @Time 67

public class Answer1 {
	// 7의 배수일 경우 multiple를 출력하고, 7의 배수가 아니면 not multiple을 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		
		bw.append(a%7==0? "multiple":"not multiple");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
