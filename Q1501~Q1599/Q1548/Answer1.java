package Q1548;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1548
//@Memory 11144, @Time 95
public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
        int score = Integer.parseInt(br.readLine());
        
        switch(score/10) {
        case 10 :
        case 9 : sb.append("A"); break;
        case 8 : sb.append("B"); break;
        case 7 : sb.append("C"); break;
        case 6 : sb.append("D"); break;
        default : sb.append("F"); break;
        }
        
        System.out.println(sb);
    	
    }
    
}