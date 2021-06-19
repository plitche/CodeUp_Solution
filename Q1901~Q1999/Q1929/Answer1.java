package Q1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1929
//@Memory 11856, @Time 73
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        loop(number);
	}
	
	public static void loop(int number) {
		if (number==1) {
			System.out.println(1);
			return;
		}
		if (number%2==0) {
			loop(number/2);
		} else {
			loop(number*3+1);
		}
		
		System.out.println(number);
	}
    	 
}
