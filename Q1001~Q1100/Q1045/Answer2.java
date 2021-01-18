package Q1045;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1045
//@How BufferedReader
//@Memory 14236, @Time 104

public class Answer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 풀이법은 기본적으로 Answer1과 같다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		System.out.println(num1+num2);	//합
		System.out.println(num1-num2);	//차
		System.out.println(num1*num2);	//곱
		System.out.println(num1/num2);	//몫
		System.out.println(num1%num2);	//나머지
		System.out.println(String.format("%.2f", num1/(double)num2));	//나누기
		br.close();
	}
}
