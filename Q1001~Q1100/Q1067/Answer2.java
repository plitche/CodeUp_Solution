package Q1067;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1067
//@How BufferedReader
//@Memory 11116, @Time 67

public class Answer2 {
	// 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		// 정수 1개를 입력 받는다.
		
		if (a < 0) { // 입력받은 숫자가 음의 수면
			System.out.println("minus");
		} else {
			System.out.println("plus");
		}

		if (a%2 == 0) { // 입력받은 숫자가 짝수면
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		br.close();
	}
}