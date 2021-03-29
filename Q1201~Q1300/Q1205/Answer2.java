package Q1205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1205
//@Memory 14500, @Time 152

public class Answer2 {
	// 두 실수 a, b가 입력되면 그 두수를 더하거나 빼거나 곱하거나 나누거나 제곱을 해서 가장 큰 수를 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		
		// 5가지 연산 결과를 배열에 저장
		double[] result = new double[5];
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
		result[4] = Math.pow(b, a);
		// 배열 정렬
		Arrays.sort(result);
		sb.append(String.format("%.6f", result[4]));
		
		System.out.println(sb);
		br.close();
	}

}
