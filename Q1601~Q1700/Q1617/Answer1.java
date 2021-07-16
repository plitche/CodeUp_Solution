package Q1617;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1617
//@Memory 11156, @Time 92

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        
        String[] no = new String[number.length()];
        for (int i=0; i<number.length(); i++) {
        	no[i] = String.valueOf(number.charAt(i));
        }

        String revers = "";
        for (int i=no.length-1; i>=0; i--) {
        	revers += no[i];
        }
        
        String sum = String.valueOf(Integer.parseInt(number) + Integer.parseInt(revers));
        
        if (sum.length() == 5) {
        	if (sum.charAt(0) == sum.charAt(4) && sum.charAt(1) == sum.charAt(3)) {
            	System.out.println("YES");	
            } else {
            	System.out.println("NO");
            }	
        } else if (sum.length() == 4) {
        	if (sum.charAt(0) == sum.charAt(3) && sum.charAt(1) == sum.charAt(2)) {
            	System.out.println("YES");	
            } else {
            	System.out.println("NO");
            }	
        } else if (sum.length() == 3) {
        	if (sum.charAt(0) == sum.charAt(2)) {
            	System.out.println("YES");	
            } else {
            	System.out.println("NO");
            }	
        } else if (sum.length() == 2 ) {
        	if (sum.charAt(0) == sum.charAt(1)) {
            	System.out.println("YES");	
            } else {
            	System.out.println("NO");
            }
        } else {
        	System.out.println("YES");
        }
        
        br.close();
    }
    	 
}