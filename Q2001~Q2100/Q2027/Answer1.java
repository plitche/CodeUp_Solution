package Q2027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2027
//@Memory 11184, @Time 66
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        int[] numbers = new int[count];
        
        int last = 0;
        int first;
        int second;
        int sum = 1;
        
        for (int i=2; i<count; i++) {
        	numbers[0] = 1;
            numbers[1] = 1;
        	if (i == 2) {
        		last = 1;
        	} else {
        		last = sum;	
        	}
        	
        	first = numbers[last-1]; 
        	second = numbers[i-last];
        	sum = first+second;
        	
        	numbers[i] = sum;
        }
        
        System.out.println(sum);
	}
}
 