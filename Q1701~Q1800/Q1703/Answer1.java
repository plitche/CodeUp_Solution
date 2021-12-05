package Q1703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1703
//@Memory 11184, @Time 68

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int total = Integer.parseInt(br.readLine());
        int hour, minute, seconds = 0;
        
        hour = total/3600; // 총시간에서 3600초로 나눈 몫
        minute = (total-hour*3600)/60; // 총 시간에서 '시'를 뺀 이후 60으로 나눔
        seconds = total%60; // 총 시간에서 60으로 나누고 난 나머지
        		
        System.out.println(hour + " " + minute + " " + seconds);
    }
    	 
}