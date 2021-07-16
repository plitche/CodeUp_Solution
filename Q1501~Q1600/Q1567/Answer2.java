package Q1567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1567
//@Memory 12120, @Time 101

public class Answer2 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int count = Integer.parseInt(br.readLine());
    	
    	StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
    	StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

    	int start = Integer.parseInt(st2.nextToken());
		int last = Integer.parseInt(st2.nextToken());
		
		int numbers[] = new int[count];
		
		Long result = (long)0;
    	for (int i=0; i<count; i++) {
    		numbers[i] = Integer.parseInt(st1.nextToken());
    	}
    	
    	for (int i=start; i<=last; i++) {
    		result += numbers[i-1];
    	}
    	
    	System.out.println(result);
    	
    }
    
}