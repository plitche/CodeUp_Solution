package Q1266;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1266
//@Memory 11436, @Time 86

public class Answer1 {
	//	수의 개수  n이 주어지고, 그 다음 줄에 무작위로 n개의 정수가 입력된다.
	//	n개의 수의 합을 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 몇개의 숫자를 입력 받을지
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");	//그 다음에 들어올 숫자 한줄을 입력 받는다. 
		
		// 총합 0으로 초기화 선언
		int total = 0;
		
		for (int i=0; i<n; i++) {
			total += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(total);
		br.close();
	}
	
}