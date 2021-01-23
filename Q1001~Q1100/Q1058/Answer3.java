package Q1058;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1058
//@How BufferedReader
//@Memory 11120, @Time 59

public class Answer3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		// 입력된 한 줄을 공백을 기준으로 a,b로 나누어 저장한다.
		
		System.out.println(a==0 && b==0 ? 1 : 0);
							// 삼항 연산자를 사용하여 훨신 더 간결하게 풀 수 있다.
							// a와 b가 둘다 거짓이면 1 출력
							// 둘 중 하나라도 거짓이 아니면 0 출력
		br.close();
	}
}
