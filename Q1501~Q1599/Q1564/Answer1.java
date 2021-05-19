package Q1564;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1564
//@Memory 11140, @Time 66

public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    	int number1 = Integer.parseInt(st.nextToken());
    	int number2 = Integer.parseInt(st.nextToken());

    	int min = number1 > number2 ? number2 : number1;
    	for (int i=min; i>=1; i--) {
    		if (number1%i == 0 && number2%i == 0) {
    			System.out.println(i);
    			break;
    		}
    	}
    
    }
    
}