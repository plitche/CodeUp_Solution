package Q1078;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1078
//@How BufferedReader
//@Memory 11168, @Time 70

public class Answer2 {
	// 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lastNum = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for (int i=0; i<=lastNum; i=i+2) {	// i가 0부터 입력받은 숫자까지 2씩 증가
			sum += i;	
		}
		
		System.out.println(sum);
		br.close();
	}
}