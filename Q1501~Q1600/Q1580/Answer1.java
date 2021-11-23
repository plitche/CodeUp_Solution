package Q1580;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1580
//@Memory 14220, @Time 96

public class Answer1 {

    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int r = Integer.parseInt(br.readLine());
    	
    	double wide = r*r*3.14;
    	
    	System.out.println(String.format("%.2f", wide));
    	
    }
    
}