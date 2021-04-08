package Q1274;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1274
//@Memory 11292, @Time 108

public class Answer1 {
	//	소수란, 약수가 1과 자기 자신 두 개 뿐인 수를 말한다. 어떤 수가 입력되면 그 수가 소수인지 판단하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 먼저 소수라고 초기화 선언
		boolean isPrime = true;
		
		// n/2까지 for문 반복 => 약수는 1을 제외하고는 2가 최소 약수
		// 2부터 시작해야 한다. (1은 모든 자연수의 약수임으로, 1의 경우는 제외한다.)
		for (int i=2; i<=n/2; i++) {
			if (n%i==0) {	// 1과 본인을 제외하고 약수가 있으면 소수가 아니다.
				isPrime = false;
				break;
			}
		}

		System.out.println(isPrime ? "prime" : "not prime");
		br.close();
	}
	
}