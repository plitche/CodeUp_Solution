package Q1164;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1164
//@Memory 11320, @Time 68

public class Answer1 {
	// 어떤 차의 높이가 170cm 이다.
	// 터널의 높이가 차례대로 3개 주어지면 터널을 무사히 잘 통과하면 PASS 를 출력하고, 사고가 난다면 CRASH 를 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 3개의 터널 높이
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		// 차가 잘 통과하려면 3개의 터널이 모두 차의 높이보다 높아야 한다.
		bw.append((a>170 && b>170 && c>170) ? "PASS":"CRASH");	// 3항 연산자 이용
		bw.flush();
		br.close();
		bw.close();
	}

}
