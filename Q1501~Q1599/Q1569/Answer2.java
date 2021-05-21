package Q1569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1569
//@Memory 12040, @Time 112

public class Answer2 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int count = Integer.parseInt(br.readLine());
    	
    	StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

    	int theNum = Integer.parseInt(br.readLine());
		
		int numbers[] = new int[count];

    	for (int i=0; i<count; i++) {
    		numbers[i] = Integer.parseInt(st1.nextToken());
    	}

    	int index = -1;
    	for (int i=0; i<count; i++) {
    		if (theNum == numbers[i]) {
    			index = i+1;
    			break;
    		}
    	}
    	
    	System.out.println(index);
    	
    }
    
}