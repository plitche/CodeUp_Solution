package Q1027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1027
//@How BufferedReader, StringTokenizer, StringBuilder
//@Memory 11108, @Time 83

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer date = new StringTokenizer(br.readLine(), ".");
		// 입력받은 시간을 ":" 기준으로 분리한다.
		StringBuilder sb = new StringBuilder();
		
		String year = date.nextToken();	// 첫번째 토큰 '시'
		String month = date.nextToken(); // 두번째 토큰이 '분'
		String day = date.nextToken(); // 마지막 토큰 '초'
		// int 타입으로 저장하면 앞자리에 있는 0은 자동으로 제거되기 때문에 String으로 받아야 한다.
		
		sb.append(day+"-").append(month+"-").append(year);
		System.out.println(sb);
		br.close();
	}
}
