package Q1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1085
//@Memory 11308, @Time 68

public class Answer2 {
	// 1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long h = Integer.parseInt(st.nextToken()); // 모두 곱했을 경우 int 범위를 넘어서기 때문에
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		double mb = (h*b*c*s)/Math.pow(2, 23);	// Math.pow() 제곱을 처리하기 위한 메소드
		mb = Math.round(mb*10);	// 첫째자리까지 반올림하기 위해
		
		System.out.println(mb/10 + " MB");
		br.close();
	}
}