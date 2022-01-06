package Q1953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1953
//@Memory 16376, @Time 121
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        loop(n, n);
	}
	
	public static void loop(int n, int b) {
		if (n==1) {
			System.out.print("*");
			return;
		}
		
		if (b==1) {
			loop(n-1, n-1);
			System.out.println();
		} else {
			loop(n, b-1);
		}
		
		System.out.print("*");
		return;
	}
    	 
}
