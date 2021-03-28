package Q1201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1201
//@Memory 11164, @Time 109

public class Answer1 {
	// 정수 하나를 입력받아 양수이면 "양수", 음수이면 "음수", 0이면 0을 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int number = Integer.parseInt(br.readLine());
		// 0과 같으면 0더하기
		if (number == 0) {
			sb.append("0");
		} else {
			// 0보다 크면 양수 더하기
			if (number > 0) {
				sb.append("양수");
			} else {	// 0보다 크면 음수 더하기
				sb.append("음수");
			}
		}
		
		System.out.println(sb);
		br.close();
	}

}
