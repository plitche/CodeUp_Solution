package Q1353;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1353
//@Memory 11712, @Time 60

public class Answer1 {
	//	n이 입력되면 다음과 같은 삼각형을 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		// 입력받은 길이만큼 2중 for문 반복
		for(int i=0; i<n; i++) {
			// i보다 하나 큰 숫자만큼 별 찍기
			for(int j=0; j<i+1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
}