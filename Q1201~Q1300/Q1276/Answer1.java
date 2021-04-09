package Q1276;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1276
//@Memory 11140, @Time 84

public class Answer1 {
	//	팩토리얼(!)은 다음과 같이 정의된다. n! = n * (n-1) * (n-2) * ... * 2 * 1
	//	n이 입력되면 n!의 값을 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		
		int result = 1;
		
		// number를 하나씩 줄여나가면서 result에 곱해준다.
		for (int i=number; i>0; i--) {
			result *= i;
		}
		
		System.out.println(result);
		br.close();
	}
	
}