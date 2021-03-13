package Q1122;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1122
//@Memory 11116, @Time 66

public class Answer2 {
	// 초를 입력받아 분 / 초의 형태로 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int seconds = Integer.parseInt(br.readLine());
		
		sb.append(seconds/60).append(" ").append(seconds%60);
		
		System.out.println(sb);
		br.close();
	}

}
