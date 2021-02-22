package Q1086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1086
//@Memory 14192, @Time 107

public class Answer2 {
	// 필요한 저장 공간을 MB 단위로 바꾸어 출력한다. 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long w = Integer.parseInt(st.nextToken()); // 모두 곱했을 경우 int 범위를 넘어서기 때문에
		int h = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		double mb = (w*h*b)/Math.pow(2, 23);	// Math.pow() 제곱을 처리하기 위한 메소드
		DecimalFormat df = new DecimalFormat("0.00");
		// 0 : 10진수 빈자리는 0으로 채움
		// # : 10진수 빈자리는 채우지 않음.
		
		System.out.println(df.format(mb) + " MB");
		br.close();
	}
}