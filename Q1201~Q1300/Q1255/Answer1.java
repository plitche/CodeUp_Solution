package Q1255;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1255
//@Memory 16172, @Time 235

public class Answer1 {
	//	소수 둘째 자리의 두 실수 a와 b가 입력으로 주어진다. a와 b사이의 수를 0.01간격으로 오름차순으로 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		// 입력 받은 두 숫자 중 뭐가 큰지 모르기 때문에
		if (a>b) {
			for (double i=a; i<=b; i+=0.01) {	// 0.01간격
				sb.append(String.format("%.2f", i)+" ");
			}
		} else {
			for (double i=a; i<=b; i+=0.01) {
				sb.append(String.format("%.2f", i)+" ");
			}
		}
		
		System.out.println(sb);
	}
	
}