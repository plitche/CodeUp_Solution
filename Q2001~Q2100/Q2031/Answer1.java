 package Q2031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2031
//@Memory 11172, @Time 70
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String column = br.readLine();
        	
        int total = 0;
        for (int i=0; i<column.length(); i++) {
        	int each = column.charAt(column.length()-1-i)-64;
        	if (i>0) {
        		total += Math.pow(26, i)*each;	
        	} else {
        		total += each;
        	}
        }
        
        System.out.println(total);
	}
}
 