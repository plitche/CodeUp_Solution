package Q1660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1660
//@Memory 11160, @Time 69

public class Answer3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        
        String[] words = line.split(",");
        
        for (String a : words) {
        	sb.append(a).append(" ");
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}