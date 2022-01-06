package Q1990;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1990
//@Memory 11156, @Time 68
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        int total = 0;
        for (int i=0; i<number.length(); i++) {
        	total += number.charAt(i)-48;
        }
        
        System.out.println(total%3 == 0 ? "1" : "0");
	}
    	 
}
