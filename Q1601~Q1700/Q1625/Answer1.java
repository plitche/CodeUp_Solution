package Q1625;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1625
//@Memory 129472, @Time 1111

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        for (int i=0; i<count; i++) {
        	String number = br.readLine();

            while(number.length() > 1) {
            	int result = 0;
            	
            	for (int j=0; j<number.length(); j++) {
            		result += number.charAt(j)-48;
            	}
            	
            	number = String.valueOf(result);
            }
            sb.append(number).append("\n");
            
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}