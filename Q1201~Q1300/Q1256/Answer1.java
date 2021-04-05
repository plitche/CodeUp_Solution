package Q1256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1256
//@Memory 11156, @Time 61

public class Answer1 {
	//	별(*)을 n개 만큼 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int starCount = Integer.parseInt(br.readLine());
		// 입력받은 별의 개수만큼 for문 반복
		for (int i=0; i<starCount; i++) {
			sb.append("*");
		}
		System.out.println(sb);
	}
	
}