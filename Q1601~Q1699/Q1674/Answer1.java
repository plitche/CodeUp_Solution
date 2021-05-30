package Q1674;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1674
//@Memory 11172, @Time 68

public class Answer1 {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String sellPhone = br.readLine();

        int sum = 0;
        for (int i=0; i<sellPhone.length(); i++) {
        	sum += sellPhone.charAt(i)-48;
        }
        
        if (sum%7==4) {
        	sb.append("Bad");
        } else {
        	sb.append("Good");
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}