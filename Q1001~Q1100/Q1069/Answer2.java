package Q1069;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1069
//@How BufferedReader
//@Memory 11112, @Time 68

public class Answer2 {
	// 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
	// A : best!!!, B : good!!, C : run!, D : slowly~, 나머지 문자들 : what?
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char letter = br.readLine().charAt(0);
		// 문자 1개를 입력 받는다.
		
		// if 문이 아닌 switch문으로도 해결 할 수 있다.
		switch (letter) { 
		case 'A' : System.out.println("best!!!"); break;
		case 'B' : System.out.println("good!!"); break;
		case 'C' : System.out.println("run!"); break;
		case 'D' : System.out.println("slowly~"); break;
		default: System.out.println("what?"); break;
		}
		
		br.close();
	}
}