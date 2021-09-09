package Q1287;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1287
//@Memory 11144, @Time 109

public class Answer1 {
	//	구구단을 입력받아 *로 출력하라. 입력받은 수가 1~9사이의 수인지 확인한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int dan = Integer.parseInt(br.readLine());

		// 구구단은 1~9까지 9번의 for문을 반복
		for (int i=1; i<10; i++) {
			// 단*1~9 만큼 반복
			for (int j=0; j<dan*i; j++) {
				sb.append("*");
			}
			sb.append("\n");	// 줄 바꿈
		}
		
		System.out.println(sb);
		br.close();
	}
	
}