package Q1559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1559
//@Memory 11168, @Time 67

public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    	Long number1 = Long.parseLong(st.nextToken());
    	Long number2 = Long.parseLong(st.nextToken());
    	
        System.out.println(number1 + number2);
    }
    
}