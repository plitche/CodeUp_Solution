package Q1090;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1090
//@Memory 11168, @Time 65

public class Answer2 {
	// 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가 공백을 두고 입력된다.(모두 0 ~ 10)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		// 시작 값 a에 Math.pow() 메소드를 사용하여 r의 n-1만큼 제곱한 숫자를 곱한다.
		// n-1만큼 제곱하는 이유는 시작값 a도 n번째 숫자의 첫 수자이기 때문이다. 
		a *= Math.pow(r, (n-1));
		
		System.out.println(a);
	
	}
	
}