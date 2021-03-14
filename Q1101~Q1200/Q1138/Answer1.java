package Q1138;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1138
//@Memory 11112, @Time 57

public class Answer1 {
	// 1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때 결과를 반대로 출력하는 프로그램을 작성해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int number = Integer.parseInt(br.readLine());
		
		bw.append(number==1?"0":"1");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
