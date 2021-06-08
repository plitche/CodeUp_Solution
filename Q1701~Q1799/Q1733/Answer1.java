package Q1733;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1733
//@Memory 11144, @Time 63

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String gourp = br.readLine();
        
        System.out.println(gourp.equals("IOI") ? "IOI is the International Olympiad in Informatics." : "I don't care.");
    }
    	 
}