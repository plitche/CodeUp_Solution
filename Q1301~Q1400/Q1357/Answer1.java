package Q1357;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1357
//@Memory 11788, @Time 68

public class Answer1 {
	//	n이 입력되면 다음 삼각형을 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		// 입력받은 길이만큼 2중 for문 반복
		for(int i=0; i<n; i++) {
			for (int j=0; j<i+1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		// 입력받은 길이-1만큼 2중 for문 반복
		for(int i=1; i<n; i++) {
			for (int j=n-i; j>0; j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
}