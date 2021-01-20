package Q1051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1051
//@How BufferedReader
//@Memory 11152, @Time 62

public class Answer3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 풀이법은 기본적으로 Answer2과 같다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		// 입력된 한 줄을 공백을 기준으로 a,b로 나누어 저장한다.
		
		System.out.println(a<=b ? 1 : 0);
		br.close();
	}
}
