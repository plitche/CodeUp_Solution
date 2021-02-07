package Q1072;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1073
//@How BufferedReader
//@Memory 11172, @Time 66

public class Answer2 {
	// n개의 입력된 정수를 순서대로 출력해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		// 몇개의 숫자를 입력받을지 입력받는다. 사실상 필요없는 코드와 마찬가지이긴 하다.
		String numbers = br.readLine();
		StringTokenizer st = new StringTokenizer(numbers, " ");
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<testCase; i++) {	// testCase만큼 for문을 돌려라
			sb.append(st.nextToken() + "\n");	// 토큰에서 하나씩 빼서 sb에 저장 
			// 줄을 바꾸어서 출력해야 하기 때문에
			// 출력이 실질적으로 숫자형이어야 되기때문에 캐스팅해줘야하는 번거로움이 있다.
		}
		System.out.println(sb);
		br.close();
	}
}