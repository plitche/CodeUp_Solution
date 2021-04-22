package Q1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1406
//@Memory 11120, @Time 87

public class Answer1 {
	//	영단어 하나가 입력된다.
	//	그 단어가 love이면 I love you. 를 출력하시오.
	 
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder sb = new StringBuilder();
         
         // 단어를 하나 입력받는다.
         String word = br.readLine();
         
         // 3항연산자 이용
         sb.append(word.equals("love") ? "I love you." : "");
         
         System.out.println(sb);
    }
	
}