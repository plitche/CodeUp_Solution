package Q1356;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1356
//@Memory 11708, @Time 67

public class Answer1 {
	//	길이 n이 입력되면 역삼각형을 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		// 입력받은 길이만큼 2중 for문 반복
		for(int i=0; i<n; i++) {
			// 중간줄은 별 사이에 공백이 출력되도록
			if (i!=0 && i!=n-1) {
				sb.append("*");
				for (int j=0; j<n-2; j++) {
					sb.append(" ");
				}
				sb.append("*");
				// 첫줄과 마지막줄은 별이 모두 다 찍히도록
			} else {
				for (int j=0; j<n; j++) {
					sb.append("*");
				}
			}
			// 줄 바꿈
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
}