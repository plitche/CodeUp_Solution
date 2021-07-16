package Q1567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1567
//@Memory 12168, @Time 114

public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int count = Integer.parseInt(br.readLine());
    	
    	StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
    	StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

    	int start = Integer.parseInt(st2.nextToken());
		int last = Integer.parseInt(st2.nextToken());
		
		Long result = (long)0;
    	for (int i=1; i<=count; i++) {
    		int number = Integer.parseInt(st1.nextToken());
    		
    		if (start <= i && last>= i) {
    			result += number;
    		} 
    		
    		
    	}
    	
    	System.out.println(result);
    	
    }
    
}