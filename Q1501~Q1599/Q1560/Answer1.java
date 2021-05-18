package Q1560;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1560
//@Memory 11184, @Time 70

public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    	Long number1 = Long.parseLong(st.nextToken());
    	Long number2 = Long.parseLong(st.nextToken());
    	
    	Long result = number1 - number2;
    	
        System.out.println(result > 0 ? result : result*-1);
    }
    
}