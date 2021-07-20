package Q2204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2204
//@Memory 14820, @Time 89
public class Answer5 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        for (int i=b*b; i>=11; i--) {
        	String number = String.valueOf(i);
        	int length = number.length();
        	System.out.println(i);
        	if (number.charAt(0)==number.charAt(length-1)) {
        		if (length > 3) {
        			if (number.charAt(1)==number.charAt(length-2)) {
        				if (length > 5) {
        					if (number.charAt(2)==number.charAt(length-3)) {
        						if (chk(a, b, i)) {
                					System.out.print(i);
                					break;
                				}		
        					}
        				} else {
        					if (chk(a, b, i)) {
            					System.out.print(i);
            					break;
            				}	
        				}
        			}
        		} else {
        			if (chk(a, b, i)) {
    					System.out.print(i);
    					break;
    				}
        		}
        	} else {
        		if (number.charAt(0)>number.charAt(length-1)) {
        			i -= number.charAt(length-1) + 10 - number.charAt(0) - 1;
        		} else {
        			i -= number.charAt(length-1) - number.charAt(0) - 1;
        		}
        	}
        }
	}
	public static boolean chk(int a, int b, int number) {
		boolean isPerfect = false;
		
		for (int i=a; i<=b; i++) {
			if (number%i==0) {
				if (number/i <= b) {
					isPerfect = true;	
				}
			}
		}
		
		return isPerfect;
	}
    	 
}

