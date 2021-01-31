package Q1068;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1068
//@How BufferedReader
//@Memory 11148, @Time 68

public class Answer2 {
	// 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
	//  90 ~ 100 : A, 70 ~   89 : B, 40 ~   69 : C, 0 ~   39 : D
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		// 정수 1개를 입력 받는다.
		
		// if 문이 아닌 switch문으로도 해결 할 수 있다.
		// int형을 나누게 되면 몫만 나오게 되므로 그 몫이 특정 숫자일 때 평가 점수를 출력하면 된다.
		switch (a/10) { 
		case 10 : 
		case 9 : System.out.println('A'); break;
		case 8 :
		case 7 : System.out.println('B'); break;
		case 6 :
		case 5 :
		case 4 : System.out.println('C'); break;
		default: System.out.println('D'); break;
		}
		
		br.close();
	}
}