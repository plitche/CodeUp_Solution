package Q1413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1413
//@Memory 11124, @Time 92

public class Answer1 {
	//	① 첫 번째 줄에 한 문장을 입력한다.(100글자 이내)이
	//	② 문장에는 띄어쓰기도 입력할 수 있다.
	//	③ 모든 문자는 알파벳 대문자, 소문자, 공백문자로만 이루어진다.
	//	입력받은 문장을 뒤집어서 출력한다.
	
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder sb = new StringBuilder();
         String line = br.readLine();

         // 문자 하나하나 저장해줄 배열 준비
         char[] arrLine = new char[line.length()];
         
         for (int i=1; i<=arrLine.length; i++) {
        	 // charAt을 이용하여 자리를 배열 거꾸로 넣는다.
        	 arrLine[arrLine.length-i] = line.charAt(i-1);
         }

         // 향상 for문
         for (char i : arrLine) {
        	 sb.append(i);
         }
         
         System.out.println(sb);
    }
	
}