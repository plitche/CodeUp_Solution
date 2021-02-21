package Q1081;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1081
//@Memory 11180, @Time 69

public class Answer2 {
	// 1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int dice1 = Integer.parseInt(st.nextToken());
		int dice2 = Integer.parseInt(st.nextToken());

		
		for (int i=1; i<=dice1; i++) {		// 첫번째 주사위 
			for (int j=1; j<=dice2; j++) {	// 두번째 주사위
				sb.append(i + " " + j);	// 2중 for문을 이용하여 한줄씩 append
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}