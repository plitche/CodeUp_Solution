package Q1716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1716
//@Memory 11212, @Time 70

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int month = Integer.parseInt(st.nextToken());
        int date = Integer.parseInt(st.nextToken());
        
        int d_day = 0;
        if (month%2==0) {
        	d_day+=30-date;
        } else {
        	d_day+=31-date;
        }
        
        for (int i=month+1; i<=10; i++) {
        	if (i%2==0) {
        		d_day+=30;
        	} else {
        		d_day+=31;
        	}
        }
        
        System.out.println(d_day);
    }
    	 
}