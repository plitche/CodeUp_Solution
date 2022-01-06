package Q2604;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2604
//@Memory 11364, @Time 77
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        
        int index = number.indexOf(".");
        int a = Integer.parseInt(number.substring(0, index));
        String b = number.substring(index+1);
        
    	int bottom = 1;
    	for (int i=0; i<b.length(); i++) {
    		bottom*=10;
    	}
    	
    	int temp = Integer.parseInt(b);
    	for (int i=temp; i>=2; i--) {
    		if (i>temp) {
    			break;
    		}
    		
    		if (bottom%i == 0 && temp%i == 0) {
    			temp /= i;
    			bottom /= i;
    		}
    	}
        
    	b += a*bottom;
        System.out.print(b + " " + bottom);
	}
    	 
}

