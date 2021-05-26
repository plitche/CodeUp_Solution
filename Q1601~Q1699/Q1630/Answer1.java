package Q1630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1630
//@Memory 11176, @Time 68

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        for (int i=0; i<count; i++) {
        	String song = br.readLine();
            sb.append(song).append("\n");
            
            if (i!=count-1) {
            	sb.append("AMOLED").append("\n");	
            }
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}