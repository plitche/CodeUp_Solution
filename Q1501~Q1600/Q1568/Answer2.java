package Q1568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1568
//@Memory 11856, @Time 74

public class Answer2 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int count = Integer.parseInt(br.readLine());
    	
    	StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
    	StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

    	int start = Integer.parseInt(st2.nextToken());
		int last = Integer.parseInt(st2.nextToken());
		
		int numbers[] = new int[count];

    	for (int i=0; i<count; i++) {
    		numbers[i] = Integer.parseInt(st1.nextToken());
    	}

    	int max = Integer.MIN_VALUE;
    	int index = 0;
    	for (int i=start; i<=last; i++) {
    		if (max < numbers[i-1]) {
    			max = numbers[i-1];
    			index = i;
    		}
    	}
    	
    	System.out.println(index);
    	
    }
    
}