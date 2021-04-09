package Q1277;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1277
//@Memory 11148, @Time 87

public class Answer2 {
	//	첫 줄에 데이터의 개수 N(N은 홀수)이 입력되고, 그 다음 줄에 N개의 데이터가 입력된다.
	//	여기서 첫번째 데이터, 중간 데이터, 마지막 데이터를 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 몇개를 입력받을지 받지만 쓰이지 않는다.
		br.readLine();
		// 공백을 기준으로 split() 메소드를 이용하여 배열 형태로 만들어 준다.
		String[] numbers = br.readLine().split(" ");

		// 배열의 길이를 찾아서 선언해준다.
		int length = numbers.length;
		
		StringBuilder sb = new StringBuilder();
		
		// 배열에서 각 자리에 맞게 꺼내어 append해준다. 
		sb.append(numbers[0]+" ").append(numbers[length/2]+" ").append(numbers[length-1]);
		System.out.println(sb);
		br.close();
	}
	
}