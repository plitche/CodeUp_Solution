package Q1080;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1080
//@Memory 11148, @Time 75

public class Answer2 {
	// 1, 2, 3 ... 을 계속 더해 나갈 때, 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지 계속 더하는 프로그램을 작성해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxNum = Integer.parseInt(br.readLine());

		int countNum = 1;	// 순차적으로 빼 줄 숫자를 1로 먼저 설정
		while(maxNum > 0) {	// maxNum가 0보다 크면 계속해서 수행될 while문
			maxNum -= countNum;	
			countNum+=1;	// maxNum에서 빼 준 이후 빼줄 숫자를 1씩 더한다.
		}
		
		System.out.println(countNum-1);
		br.close();
	}
}