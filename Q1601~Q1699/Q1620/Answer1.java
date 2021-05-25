package Q1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1620
//@Memory 11144, @Time 68

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        while(number.length() > 1) {
        	int result = 0;
        	for (int i=0; i<number.length(); i++) {
        		result += number.charAt(i)-48;
        	}
        	
        	number = String.valueOf(result);
        }
        
        System.out.println(number);
        br.close();
    }
    	 
}