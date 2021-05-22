package Q1285;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1285
//@Memory 11164, @Time 75

public class Answer2 {
	//	이번에는 식을 입력하면 차례대로 계산하여 출력하는 계산기를 만들어보자.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st;
        String[] operator = {"+", "-", "*", "/", "="};
        int result = 0;
        for (int i=0; i<5; i++) {
        	
        	
        }
        
        
        System.out.println((a+b-c)*d/e);
        br.close();
	}
	
}