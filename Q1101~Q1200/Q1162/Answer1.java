package Q1162;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1162
//@Memory 11276, @Time 68

public class Answer1 {
	//	세 수(년,월,일)가 주어지면,  (년 - 월 + 일)에 마지막 숫자가 0이면 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력하세요.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int year = Integer.parseInt(st.nextToken());	// 년도 입력
		int month = Integer.parseInt(st.nextToken());	// 월 입력
		int day = Integer.parseInt(st.nextToken());		// 일 입력
		
		// 년도-월+일을 스트링 타입으로 변환하였을 때 길이 구하기
		int length = String.valueOf(year-month+day).length();
		
		// charAt을 통하여 위에서 구한 길이를 사용해 마지막 index값 구하기
		bw.append(String.valueOf(year-month+day).charAt(length-1)=='0' ? "대박":"그럭저럭");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
