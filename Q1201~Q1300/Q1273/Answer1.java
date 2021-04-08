package Q1273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1273
//@Memory 11152, @Time 87

public class Answer1 {
	//	자연수 N이 주어지면 N의 약수를 오름차순으로 모두 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		// n/2까지 for문 반복 => 약수는 1을 제외하고는 2가 최소 약수
		for (int i=1; i<=n/2; i++) {
			if (n%i==0) {
				sb.append(i).append(" ");
			}
		}
		// n/2 까지만 for문을 반복했기 때문에 마지막에 자기 자신을 append해준다.
		sb.append(n);
		
		System.out.println(sb);
		br.close();
	}
	
}