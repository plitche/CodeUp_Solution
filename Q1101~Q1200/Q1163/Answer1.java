package Q1163;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1163
//@Memory 11252, @Time 67

public class Answer1 {
	//	세 수(년,월,일)가 주어지면,  (년 + 월 + 일)에 100의 자리 숫자가 짝수이면 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력하세요.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int year = Integer.parseInt(st.nextToken());	// 년도 입력
		int month = Integer.parseInt(st.nextToken());	// 월 입력
		int day = Integer.parseInt(st.nextToken());		// 일 입력

		// 년+월+일 의 100의 자리 숫자가 짝수인지 판단하려면 100으로 나눈 몫을 기준으로 판단하면 된다.
		bw.append((year+month+day)/100%2==0 ? "대박":"그럭저럭");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
