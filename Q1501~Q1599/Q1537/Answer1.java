package Q1537;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1537
//@Memory 11132, @Time 91
public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        
        System.out.println(number.equals("1") ? "hello" : "world");
    	
    }
    
}