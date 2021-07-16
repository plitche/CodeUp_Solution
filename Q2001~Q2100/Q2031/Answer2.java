 package Q2031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2031
//@Memory 11156, @Time 67
public class Answer2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String column = br.readLine();
        int length = column.length();	
        int total = 0;
        for (int i=0; i<length; i++) {
        	if (i>0) {
        		total += Math.pow(26, i)*(column.charAt(length-1-i)-64);	
        	} else {
        		total += column.charAt(length-1-i)-64;
        	}
        }
        
        System.out.println(total);
	}
}
 