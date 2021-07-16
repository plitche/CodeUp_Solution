package Q2035;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2035
//@Memory 12972, @Time 85
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String[] sit = br.readLine().split(" ");
        
        int available = 0;
        if (length == 1) {
        	if (sit[0].equals("0")) {
        		available++;
        	}
        } else {
            for (int i=0; i<length; i++) {
            	if (sit[i].equals("0")) {
            		if (i==0) {
                		if (sit[1].equals("0")) {
                			available++;
                		}
                	} else if(i==length-1) {
                		if (sit[length-2].equals("0")) {
                			available++;
                		}
                	} else {
                		if (sit[i-1].equals("0") && sit[i+1].equals("0")) {
                			available++;
                		}
                	}	
            	}
            }
        }
        
        System.out.println(available);
        
	}
}
 