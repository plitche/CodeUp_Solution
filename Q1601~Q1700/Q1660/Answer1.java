package Q1660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1660
//@Memory 11164, @Time 68

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        StringBuilder sb = new StringBuilder();

        while(st.hasMoreTokens()) {
        	sb.append(st.nextToken()).append(" ");
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}