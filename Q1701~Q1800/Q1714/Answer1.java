package Q1714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1714
//@Memory 11152, @Time 68

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String number = br.readLine();
        
        for (int i=number.length()-1; i>=0; i--) {
        	sb.append(number.charAt(i)-48);
        }
        
        System.out.println(sb);
    }
    	 
}