package Q1282;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1282
//@Memory 11180, @Time 86

public class Answer1 {
	//	n이 입력되면 k를 빼서 제곱수를 만들 수 있는 k를 구하고, 그 제곱수에 루트를 씌운 수(제곱근) t를 구하여라.
	//	이 때 k는 여러가지가 될 수 있는데 가장 작은 k를 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int number = Integer.parseInt(br.readLine());
		
		int a = (int)Math.sqrt(number);
		int b = number-a*a;
		
		System.out.println(b + " " + a);
		br.close();
	}
	
}