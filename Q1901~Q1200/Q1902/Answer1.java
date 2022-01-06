package Q1902;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1902
//@Memory 11832, @Time 69
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        loop(count);
	}
	
	public static void loop( int count) {
		
		if (count > 0) {
			System.out.println(count);
			loop(count-1);
		} else {
			return;
		}
		
	}
    	 
}
