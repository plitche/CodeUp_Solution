package Q1549;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1549
//@Memory 11148, @Time 95
public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long number = Long.parseLong(br.readLine());
        
        System.out.println(number > 0 ? number : number*-1);
    	
    }
    
}