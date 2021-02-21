package Q1083;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1083
//@Memory 11160, @Time 70

public class Answer2 {
	// 3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxNum = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i=1; i<=maxNum; i++) {		// 1부터 최대 숫자까지 1씩 증가 
			if (i%3==0) {	// 3의 배수이면
				sb.append('X' + " ");
			} else {
				sb.append(i + " ");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
