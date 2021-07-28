package Q2607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2607
//@Memory 15180, @Time 3988
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        boolean isPrime = false;
        for (int i=a; i<=b; i++) {
        	if (i%2==0) {
        		continue;
        	} else {
        		for (int j=2; j<i; j++) {
        			if (i%j == 0) {
        				isPrime = false;
        				break;
        			} else {
        				isPrime = true;
        			}
        		}
        		
        		if (isPrime) {
            		for (int j=2; j<i+2; j++) {
            			if ((i+2)%j == 0) {
            				isPrime = false;
            				break;
            			} else {
            				isPrime = true;
            			}
            		}
        		}
        		
        		if (isPrime && i+2 <= b) {
        			sb.append(i + " " + (i+2)).append("\n");
        			i++;
        		}
        	}
        }
        
        System.out.print(sb);
	}
    	 
}

