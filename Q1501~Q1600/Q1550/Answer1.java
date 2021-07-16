package Q1550;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1550
//@Memory 3995, @Time 시간초과
public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long number = Long.parseLong(br.readLine());
        
        for (int i=0; i*i<=number; i++) {
        	if (i*i==number) {
        		System.out.println(i);
        		break;
        	} else if (i*i<number && (i+1)*(i+1)>number ) {
        		System.out.println(i);
        		break;
        	}
        }
        
    }
    
}