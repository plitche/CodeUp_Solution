package Q1912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1912
//@Memory 11156, @Time 69
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        loop(number, 1);
	}
	
	public static void loop(int number, int total) {
		
		if (number>0) {
			loop(number-1, total*number);
		} else {
			System.out.println(total);
		}
		
	}
    	 
}
