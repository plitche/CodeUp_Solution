package Q1092;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1092
//@Memory 11200, @Time 69

public class Answer2 {
	// 3명이 다시 모두 함께 방문해 문제를 풀어보는 날(동시 가입/등업 후 며칠 후?)을 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		// 일반적인 수학공식인 공배수를 이용한 방법
		int common = 1;
		while(common%a!=0 || common%b!=0 || common%c!=0) {
			common++;	// 같이 다시 만날 날이 a,b,c와 나누어 떨이지지 않으면 1씩 증가시켜라.
		}
		
		System.out.println(common);
		br.close();
	
	}
	
}