package Q1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1260
//@Memory 11176, @Time 65

public class Answer2 {
	//	어떤 수 a, b가 주어진다. a와 b의 관계는 a <= b 이다.
	//	a에서 b까지의 수 중 3의 배수만 더하여 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int n = a-1;	// 처음부터 시작될 숫자 n을 a-1로 선언
		int total = 0; 	// 합계를 0으로 초기화 선언
		
		// 입력받은 숫자 만큼 for문 반복
		while (n++<b) {
			if (n%3 == 0) {	// 3의 배수이면
				total += n;
			}
		}
		
		System.out.println(total);
	}
	
}