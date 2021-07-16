package Q1703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1703
//@Memory 11180, @Time 104

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int total = Integer.parseInt(br.readLine());
        int hour, minute, seconds = 0;
        
        hour = total/3600;
        minute = (total-hour*3600)/60;
        seconds = total%60; 
        		
        System.out.println(hour + " " + minute + " " + seconds);
    }
    	 
}