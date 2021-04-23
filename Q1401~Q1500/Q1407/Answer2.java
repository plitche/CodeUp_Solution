package Q1407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1407
//@Memory 11136, @Time 72

public class Answer2 {
	//	길이(글자수)가 100이하인 문자열을 입력받아 공백을 제거하고 출력하시오.
	 
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder sb = new StringBuilder();
         String line = br.readLine();
         StringTokenizer st = new StringTokenizer(line, " ");
         while (st.hasMoreTokens()) {
             sb.append(st.nextToken());
         }
         System.out.println(sb);
         br.close();
    }
	
}