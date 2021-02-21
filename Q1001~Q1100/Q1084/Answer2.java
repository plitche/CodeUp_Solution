package Q1084;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1084
//@Memory 49892, @Time 334

public class Answer2 {
	// 1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int r = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int total = 0;
		for (int i=0; i<r; i++) {	// 0부터 r보다 작은 수까지
			for (int j=0; j<g; j++) {	// 0부터 g보다 작은 수까지
				for (int k=0; k<b; k++) {	// 0부터 b보다 작은 수까지
					bw.write(i + " " + j + " " + k + "\n");
					total += 1;	// for문이 한번 돌때마다 total 1씩 증가
				}
			}
		}
		
		bw.write(String.valueOf(total));
		bw.flush();
		br.close();
		bw.close();
	}
}