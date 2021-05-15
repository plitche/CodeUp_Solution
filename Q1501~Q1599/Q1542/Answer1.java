package Q1542;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1542
//@Memory 11148, @Time 88
public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        String result = "prime";
        for (int i=2; i<number/2; i++) {

        	if (number%i==0) {
        		result = "composite";
        		break;
        	}
        }
        
        System.out.println(result);
    	
    }
    
}