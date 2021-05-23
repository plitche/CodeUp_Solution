package Q1577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1577
//@Memory 11140, @Time 109

public class Answer1 {

    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int number = Integer.parseInt(br.readLine());
    	System.out.println(number < 0 ? number*-1 : number);
    	
    }
    
}