package Q1905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1905
//@Memory 11812, @Time 66
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        loop(number, 0);
	}
	
	public static void loop(int number, int total) {
		
		if (number>0) {
			loop(number-1, total+number);
		} else {
			System.out.println(total);
		}
		
	}
    	 
}
