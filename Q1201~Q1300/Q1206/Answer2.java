package Q1206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1206
//@Memory 11176, @Time 70

public class Answer2 {
	//	두 자연수 a, b가 주어진다.
	//	b가 a의 배수이면 "a*x=b"를 출력하고,
	//	a가 b의 배수이면 "b*x=a"를 출력하고,
	//	배수관계가 아니면 "none"을 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		if (a%b==0) {	// a가 b로 나누어 떨어질 때
			int x = a/b;
			sb.append(b).append("*").append(x).append("=").append(a);
		} else if (b%a==0) { 	// b가 a로 나누어 떨어질 때
			int x = b/a;
			sb.append(a).append("*").append(x).append("=").append(b);
		} else {
			sb.append("none");
		}
		
		System.out.print(sb);
		br.close();
	}

}
