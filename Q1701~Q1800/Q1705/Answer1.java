package Q1705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1705
//@Memory 11176, @Time 74

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String number = br.readLine();
        
        int a = number.charAt(0)-48;
        int b = 0;
        int c = 0;
        if (number.length()>1) { b = number.charAt(1)-48; }
        if (number.length()>2) { c = number.charAt(2)-48; }
        
        int count = 0;
        
        if (a==3 || a==6 || a==9) count++;
        if (b==3 || b==6 || b==9) count++;
        if (c==3 || c==6 || c==9) count++;
        
        if (count==3) {
        	sb.append("KKK");
        } else if (count==2) {
        	sb.append("KK");
        } else if (count==1) {
        	sb.append("K");
        } else {
        	sb.append(number);
        }
        
        System.out.println(sb);
    }
    	 
}