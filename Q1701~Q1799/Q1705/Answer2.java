package Q1705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1705
//@Memory , @Time 

public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String number = br.readLine();
        
        int count = 0;
        for (int i=0; i<number.length(); i++) {
        	int index = number.charAt(i)-48;
        	if (index==3 || index==6|| index==9) {
        		count++;
        	}
        }
        
        if (count==0) {
        	sb.append(number);
        } else {
        	for (int i=0; i<count; i++) {
            	sb.append("K");
            }	
        }
        
        System.out.println(sb);
    }
    	 
}