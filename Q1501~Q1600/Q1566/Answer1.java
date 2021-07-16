package Q1566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1566
//@Memory 11188, @Time 시간초과

public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    	Long number1 = Long.parseLong(st.nextToken());
    	Long number2 = Long.parseLong(st.nextToken());

    	Long result = number1;
    	if (number2 == 0) {
    		result = (long)1;
    	} else {
        	for (int i=1; i<number2; i++) {
        		result *= number1;
        	}    		
    	}
    	
    	System.out.println(result);
    	
    }
    
}