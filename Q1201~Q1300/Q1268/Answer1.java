package Q1268;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1268
//@Memory 11228, @Time 81

public class Answer1 {
	//	수의 개수 n이 주어지고, 그 다음 줄에 무작위로 n개의 자연수가 입력된다.
	//	그 n개의 수 중에서 짝수의 개수를 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 몇개의 숫자를 입력 받을지
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");	//그 다음에 들어올 숫자 한줄을 입력 받는다. 
		
		// 총합 0으로 초기화 선언
		int count = 0;
		
		for (int i=0; i<n; i++) {
			int number = Integer.parseInt(st.nextToken());
			if (number%2 == 0) {	// 짝수이면
				count++;	// 카운트 +1
			}
		}
		
		System.out.println(count);
		br.close();
	}
	
}