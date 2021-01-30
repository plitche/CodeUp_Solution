package Q1064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1064
//@How BufferedReader
//@Memory 11132, @Time 69

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		// 정수 3개를 입력 받는다.
		
		// 삼항 연산자를 이용해서 출력한다. (문제 조건)
		System.out.println((a<b ? a:b) < c ? (a<b ? a:b) : c);
							// 1. a와 b를 비교 하였을 때 작은 수를 먼저  특정한다.
							// 2. 1번을 통해 특정된 숫자와 c를 비교하였을 때 c가 더 크면 1번에서 특정된 숫자를 출력하고.
							// 3. 2번에서 1번의 특정 숫자와 c를 비교하였을 때 c가 더 작으면 c를 출력한다.
		
							// 결과적으로 가장 작은 숫자가 출력된다.
		br.close();
	}
}