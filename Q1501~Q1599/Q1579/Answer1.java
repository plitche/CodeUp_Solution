package Q1579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1579
//@Memory 11128, @Time 91

public class Answer1 {

    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	
    	int number1 = Integer.parseInt(st.nextToken());
    	int number2 = Integer.parseInt(st.nextToken());
    	
    	System.out.println(number1 > number2 ? number2 : number1);
    	
    }
    
}