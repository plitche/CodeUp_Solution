package Q1851;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1851
//@Memory 11172, @Time 95
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        loop(count);
	}
	
	public static void loop(int i) {
		if (i==0) {
			return;
		} else {
			System.out.print("*");
			loop(i-1);
		}
		
	}
    	 
}
