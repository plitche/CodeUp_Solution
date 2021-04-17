package Q1355;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1355
//@Memory 11764, @Time 66

public class Answer1 {
	//	길이 n이 입력되면 역삼각형을 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		// 입력받은 길이만큼 2중 for문 반복
		for(int i=0; i<n; i++) {
			// 공백과 별의 개수가 역으로 찍히도록
			for(int j=0; j<i; j++) {
				sb.append(" ");
			}
			for(int j=n; j>i; j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
}