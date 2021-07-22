package Q2601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2601
//@Memory 11136, @Time 69
public class Answer3 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int a = 1; int b = 1; int temp = a;
        if (count != 1 && count != 2) {
        	for (int i=2; i<count; i++) {
        		a = b;
        		b += temp;
        		temp = a;
        				
        	}
        }
        
        System.out.print(b);
	}
    	 
}

