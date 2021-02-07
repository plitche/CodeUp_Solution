package Q1073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1073
//@How BufferedReader
//@Memory 11124, @Time 61

public class Answer2 {
	// 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numbers = br.readLine();
		StringTokenizer st = new StringTokenizer(numbers, " ");
		StringBuilder sb = new StringBuilder();
		
		while (st.hasMoreTokens()) {	//토큰이 더이상 없을떄까지 돌려라
			int a = Integer.parseInt(st.nextToken());
			if (a==0) {	// st에서 꺼낸 토큰이 0이면 break해서 while문 종료해라.
				break;
			} 
			sb.append(a + "\n"); //st에서 꺼낸 토큰이 0이 아니면 sb에 더해라
		}
		
		System.out.println(sb);
		br.close();
	}
}