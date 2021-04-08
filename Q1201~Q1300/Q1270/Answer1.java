package Q1270;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1270
//@Memory 51924, @Time 353

public class Answer1 {
	//	어떤 수 n이 주어지면 1부터 n까지의 수 중 맨 마지막 자리에 1이 몇 번 들어 있는지 알아내는 프로그램을 작성하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;	// 마지막자리가 1인 개수를 0개로 초기화 선언
		
		// 1부터 n까지 for문 반복
		for (int i=1; i<=n; i++) {
			int length = (int)String.valueOf(i).length();	// 입력받은 숫자만큼 for문이 돌면서 i의 자리수를 계산한다.
			if (String.valueOf(i).substring(length-1).equals("1")) {	// substring을 이용하여 마지막 자리 숫자를 알아내고 비교한다.
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
	
}