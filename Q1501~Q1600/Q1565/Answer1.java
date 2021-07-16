package Q1565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1565
//@Memory 11552, @Time 시간초과

public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    	int number1 = Integer.parseInt(st.nextToken());
    	int number2 = Integer.parseInt(st.nextToken());

    	Long maxDiv = (long)1;
    	for (int i=number2; i>=1; i--) {
    		if (number1%i == 0 && number2%i == 0) {
    			maxDiv = (long)i;
    			number1 /= i;
    			number2 /= i;
    			break;
    		}
    	}
    	
    	System.out.println(maxDiv * number1 * number2);
    
    }
    
}