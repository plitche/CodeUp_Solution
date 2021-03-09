package Q1111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1111
//@Memory 11220, @Time 61

public class Answer2 {
	// 어떤 정수가 입력되면 %를 붙여 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.append(br.readLine() + "%");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
