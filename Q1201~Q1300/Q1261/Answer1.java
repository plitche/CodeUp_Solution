package Q1261;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1261
//@Memory 11148, @Time 69

public class Answer1 {
	//	10개의 수가 입력된다.
	//	10개의 수 중 5의 배수를 하나만 출력한다.
	//	만약 5의 배수가 없다면 0을 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 입력받은 숫자를 전역변수로 선언
		int number = 0;
		
		// 10개의 숫자를 입력받기로 하였음으로 10번 반복
		for (int i=0; i<10; i++) {
			number = Integer.parseInt(st.nextToken());
			if (number%5==0) {
				break;	// 처음 들어오는 5의 배수가 있을 때 break
			}
		}
		
		System.out.println(number);
	}
	
}