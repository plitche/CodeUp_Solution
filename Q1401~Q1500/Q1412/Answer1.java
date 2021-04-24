package Q1412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1412
//@Memory 11120, @Time 72

public class Answer1 {
	//	a부터 z까지 사용된 알파벳 개수를 [입출력 예시]를 참고하여 출력한다. 특수문자와 공백의 개수는 출력하지 않는다.
	 
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder sb = new StringBuilder();
         String line = br.readLine();

         int[] array = new int[26];
         for (int i=0; i<line.length(); i++) {
             for (int j=97; j<123; j++) {
                 if (line.charAt(i)==j) {
                     array[j-97] +=1;
                 }
             }
         }
         for (int i=0; i<array.length; i++) {
             sb.append((char)(i+97) + ":" + (array[i])).append("\n");
         }
         System.out.println(sb);
    }
	
}