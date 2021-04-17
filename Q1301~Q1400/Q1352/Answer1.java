package Q1352;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1352
//@Memory 11856, @Time 73

public class Answer1 {
	//	길이 n이 입력되면 길이가 n인 사각형을 출력하시오. 단, 사각형은 * 모양으로 채운다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int length = Integer.parseInt(br.readLine());
		
		// 입력받은 길이만큼 2중 for문 반복
		for(int i=0; i<length; i++) {	
			for(int j=0; j<length; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
}