package Q1807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1807
//@Memory 11240, @Time 122
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int first = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
	
        int max = 0;
        int count = 0;
        for (int i=first; i<=end; i++) {
            int a = 0;
            int b = 1;
            int temp = i;

            while(temp!=1) {
        		if (temp%2==0) {
        			temp = temp/2;
        		} else {
        			temp=3*temp+1;
        		}
        		
        		b++;
        	}
            a = i;

            if (count<b) {
            	max = a;
            	count = b;
            }
        }
        
        System.out.println(max + " " + count);
        
	
	}
    	 
}
