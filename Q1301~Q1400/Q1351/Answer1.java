package Q1351;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1351
//@Memory 11124, @Time 67

public class Answer1 {
	//	시작단과 마지막 단을 입력하면 그 구간의 구구단을 출력하는 프로그램을 작성하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		for(int i=start; i<=end; i++) {	// 시작 단과 끝 단을 지정
			for(int j=1; j<=9; j++) {	// 구구단 시작
				sb.append(i).append("*").append(j).append("=").append(i*j).append("\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
	
}