package Q1561;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1561
//@Memory 11184, @Time 68

public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    	int number1 = Integer.parseInt(st.nextToken());
    	int number2 = Integer.parseInt(st.nextToken());
    	
        System.out.println(number1 > number2 ? number1 : number2);
    }
    
}