package Q1736;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1736
//@Memory 11172, @Time 95

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int seconds = Integer.parseInt(br.readLine());
        
        int day = seconds/3600/24; 
        seconds -= day*3600*24;
        
        int hour = seconds/3600;
        seconds -= hour*3600;
        
        int min = seconds/60;
        seconds = seconds%60;
        
        System.out.println(day + " " + hour + " " + min + " " + seconds);
    }
    	 
}