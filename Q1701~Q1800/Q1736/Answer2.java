package Q1736;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1736
//@Memory 11160, @Time 70

public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int seconds = Integer.parseInt(br.readLine());
        
        int day = seconds/3600/24;  // 3600초로 나누고 24시로 나눈 값
        seconds -= day*3600*24;	// 총 시간에서 제외하기
        
        int hour = seconds/3600; // 남은 시간에서 3600초로 나눈 값
        seconds -= hour*3600;	// 총 시간에서 제외하기
        
        int min = seconds/60;	// 남은 시간에서 60분으로 나눈 값
        seconds = seconds%60;	// 남은 시간에서 60분으로 나눈 나머지
        
        sb.append(day).append(" ").append(hour).append(" ").append(min).append(" ").append(seconds);
        
        System.out.println(sb);
    }
    	 
}