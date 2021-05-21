package Q1569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1569
//@Memory 12088, @Time 105

public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int count = Integer.parseInt(br.readLine());
    	
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    	int theNum = Integer.parseInt(br.readLine());
    	
    	int index = -1;
    	for (int i=1; i<=count; i++) {
    		int number = Integer.parseInt(st.nextToken());
    		
    		if (number == theNum) {
    			index = i;
    			break;
    		}
    		
    	}
    	
    	System.out.println(index);
    	
    }
    
}