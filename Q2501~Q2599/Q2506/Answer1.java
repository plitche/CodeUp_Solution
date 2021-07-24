package Q2506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2204
//@Memory 56604, @Time 533
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double number = Double.parseDouble(br.readLine());
        
        number *= 100;
        int a = (int) Math.round(number);
        int b = 10000;
        
        int index=a;
        while(index!=1) {
        	if (a%index==0 && b%index==0) {
        		a /= index;
        		b /= index;
        	}
        	
        	index--;
        }
        
        System.out.print(a + "/" + b);
        
	}
    	 
}

