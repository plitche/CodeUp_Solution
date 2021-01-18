package Q1043;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1043
//@How BufferedReader
//@Memory 11140, @Time 67

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 풀이법은 기본적으로 Answer1과 같다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println(Integer.parseInt(st.nextToken()) % Integer.parseInt(st.nextToken()));
		br.close();
	}
}
