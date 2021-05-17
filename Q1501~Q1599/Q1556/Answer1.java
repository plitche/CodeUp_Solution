package Q1556;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1556
//@Memory 11144, @Time 111

public class Answer1 {
	//	n! 값을 출력한다.

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int number = Integer.parseInt(br.readLine()); 

    	long result = 1;
    	for (int i=2; i<=number; i++) {
    		result *= i;
    	}
    	
        System.out.println(result);
    }
    
}