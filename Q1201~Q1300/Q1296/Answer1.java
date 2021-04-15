package Q1296;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1296
//@Memory 11136, @Time 84

public class Answer1 {
	//	철망의 길이 n이 입력된다. 가축 우리의 최대 넓이를  정수로 출력한다.(소수점 이하는 버린다.)
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		
		// 동일한 변일 때 가장 큰 넓이는 정사각형 일 때이다.
		double side = length/4.0;
		int wide = (int)(side*side);
		
		System.out.println(wide);
		br.close();
	}
	
}