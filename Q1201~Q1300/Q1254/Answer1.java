package Q1254;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1254
//@Memory 11112, @Time 65

public class Answer1 {
	//	시작 알파벳과 마지막 알파벳을 입력받아 그 두 알파벳 사이의 모든 알파벳을 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		char a = line.charAt(0);
		char b = line.charAt(2);
		
		for (char i=a; i<=b; i++) {
			sb.append(i+" ");
		}
		System.out.println(sb);
	}
	
}