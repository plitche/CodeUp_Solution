package Q1736;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1736
//@Memory 11128, @Time 82

public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int seconds = Integer.parseInt(br.readLine());
        
        int day = seconds/3600/24; 
        seconds -= day*3600*24;
        
        int hour = seconds/3600;
        seconds -= hour*3600;
        
        int min = seconds/60;
        seconds = seconds%60;
        
        sb.append(day).append(" ").append(hour).append(" ").append(min).append(" ").append(seconds);
        
        System.out.println(sb);
    }
    	 
}