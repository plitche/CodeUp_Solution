package Q2081;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2081
//@Memory 11168, @Time 66
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = Integer.parseInt(br.readLine());
        int index = 1;
        for (int i=0; i<8; i++) {
        	int number = Integer.parseInt(br.readLine());
        	if (number > max) {
        		max = number;
        		index = i+2;
        	}
        }
        
        System.out.println(max + "\n" + index);	
    	
	}
}