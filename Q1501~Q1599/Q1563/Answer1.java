package Q1563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1563
//@Memory 11176, @Time 68

public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    	int number1 = Integer.parseInt(st.nextToken());
    	int number2 = Integer.parseInt(st.nextToken());
    	int number3 = Integer.parseInt(st.nextToken());
    	
        if (number1 > number2) {
        	if (number2 > number3) {
        		System.out.println(number2);
        	} else {
        		if (number1 > number3) {
        			System.out.println(number3);	
        		} else {
        			System.out.println(number1);
        		}
        	}
        } else {
        	if (number1 > number3) {
        		System.out.println(number1);
        	} else {
        		if (number2 > number3) {
        			System.out.println(number3);	
        		} else {
        			System.out.println(number2);
        		}
        	}
        }
    }
    
}