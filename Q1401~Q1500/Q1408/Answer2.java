package Q1408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1408
//@Memory 11108, @Time 94

public class Answer2 {
	//	길이(글자수)가 100이하인 문자열을 입력받아 공백을 제거하고 출력하시오.
	 
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder sb = new StringBuilder();
         String word = br.readLine();
         
         // 첫번째 단어 암호화
         for (int i=0; i<word.length(); i++) {
         	sb.append((char)(word.charAt(i)+2));
         }
         sb.append("\n");

         // 두번째 단어 암호화
         for (int i=0; i<word.length(); i++) {
         	sb.append((char)(word.charAt(i)*7%80+48));
         }
         
         System.out.println(sb);
         br.close();
    }
	
}