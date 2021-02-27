package Q1089;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1089
//@Memory 11160, @Time 69

public class Answer2 {
	// 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가	공백을 두고 입력된다.(모두 0 ~ 100)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		a += d*(n-1);	// 시작값 a에 등차의값 d * 몇번째수 n 를 더한다.
						// 몇번째수-1 해주는 이유는 시작값도 첫 번째 수에 포함되기 때문이다.
		
		System.out.println(a);
		br.close();
	}
}