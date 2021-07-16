package Q1557;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1557
//@Memory 11140, @Time 107

public class Answer1 {
	//	n! 값을 출력한다.

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int number = Integer.parseInt(br.readLine()); 

    	int count = 0;
    	for (int i=1; i<=number; i++) {
    		if (number%i==0) {
    			count++;
    		}
    	}
    	
        System.out.println(count);
    }
    
}