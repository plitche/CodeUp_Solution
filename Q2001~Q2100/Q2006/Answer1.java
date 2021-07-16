package Q2006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2006
//@Memory 11144, @Time 62
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());
        
        int aStep = s;
        int cStep = s;
        
        int aEnd = 0;
        int cEnd = 0;
        
        while (true) {
        	if (aStep >= a) {
        		aEnd += a;
        		aStep -= a;
        		if (aStep >= b) {
        			aEnd -= b;
            		aStep -= b;	
        		} else {
        			aEnd -= aStep;
        			break;
        		}
        	} else {
        		aEnd += aStep;
        		break;
        	}
        }
        
        while (true) {
        	if (cStep >= c) {
        		cEnd += c;
        		cStep -= c;
        		if (cStep >= d) {
        			cEnd -= d;
            		cStep -= d;	
        		} else {
        			cEnd -= cStep;
        			break;
        		}
        	} else {
        		cEnd += cStep;
        		break;
        	}
        }
        
        System.out.println(aEnd > cEnd ? "Nikky" : aEnd == cEnd ? "Tied" : "Byron");
	}
    	 
}
