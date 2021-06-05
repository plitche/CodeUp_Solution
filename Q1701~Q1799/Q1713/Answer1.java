package Q1713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1713
//@Memory 11156, @Time 112

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int first = Integer.parseInt(st.nextToken());
        int end= Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i=first; i<=end; i++) {
        	if(i%3==0 && i%4==0) {
        		
        	} else if(i%3==0) {
        		result += i;
        	} else if(i%4==0) {
        		result -= i;
        	}
        }
        
        System.out.println(result);
    }
    	 
}