package Q1205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1205
//@Memory 14316, @Time 185

public class Answer1 {
	// 두 실수 a, b가 입력되면 그 두수를 더하거나 빼거나 곱하거나 나누거나 제곱을 해서 가장 큰 수를 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		
		double sum = a+b;
		double minus = a-b;
		double multiple = a*b;
		double divide = a/b;
		double squared = Math.pow(b, a);
		
		// 최대값을 0으로 초기화 선언
		double max = 0;
		// 5개 계산 결과를 max와 비교해서 더 크면 max에 저장
		if (sum>max) max=sum;
		if (minus>max) max=minus;
		if (multiple>max) max=multiple;
		if (divide>max) max=divide;
		if (squared>max) max=squared;
		
		System.out.println(String.format("%.6f", max));
		br.close();
	}

}
