package Q1136;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1136
//@Memory 11228, @Time 61

public class Answer2 {
	// 두 정수(a, b)를 입력받아 a와 b가 같으면 1, 같지 않으면 0을 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		bw.append(a==b?"1":"0");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
