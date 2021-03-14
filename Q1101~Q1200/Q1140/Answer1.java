package Q1140;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1140
//@Memory 11200, @Time 67

public class Answer1 {
	// 두 가지의 참(1) 또는 거짓(0)이 입력될 때, 둘 중 하나라도 참일 경우 1이, 그렇지 않으면 0이 출력되는 프로그램을 작성해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String a = st.nextToken();
		String b = st.nextToken();
		
		bw.append((a.equals("1") || b.equals("1")) ?"1":"0");	// 3항 연산자 이용
				// 둘중 하나라도 1이면 1출력, 둘다 0이면 0출력
		bw.flush();
		br.close();
		bw.close();
	}

}
