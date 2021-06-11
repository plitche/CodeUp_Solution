package Q1754;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1754
//@Memory 11100, @Time 108

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String number1 = st.nextToken();
        String number2 = st.nextToken();
        
        int[] num1 = new int[10];
        int[] num2 = new int[10];
        
        if (number1.length() > number2.length()) {
        	sb.append(number1).append(" ").append(number2);
        } else if (number1.length() < number2.length()) {
        	sb.append(number2).append(" ").append(number1);
        } else {
        	for (int i=0; i<10; i++) {
            	num1[i] = Integer.parseInt(number1.substring(i, i+10));
            	num2[i] = Integer.parseInt(number2.substring(i, i+10));
            }        	
        }
        
        System.out.println(sb);
	}
    	 
}