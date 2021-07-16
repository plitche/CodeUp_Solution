package Q1555;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1555
//@Memory 11228, @Time 104

public class Answer1 {
	//	1부터 n까지의 정수합을 출력한다.

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int number = Integer.parseInt(br.readLine()); 

    	long result = 0;
    	for (int i=1; i<=number; i++) {
    		result += i;
    	}
    	
        System.out.println(result);
    }
    
}