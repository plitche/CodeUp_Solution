package Q2028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2028
//@Memory 11284, @Time 265
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int index=1;
        int number=0;
        while(true) {
        	number += index;
        	int many = 0;
        	for (int i=1; i<=number; i++) {
        		if (number%i==0) {
        			if (i > (number/i)) break;
        			if ((number/i) == i) {
        				many += 1;	
        			} else {
        				many += 2;
        			}
        			
    			}
    		}

        	if (count<many) {
        		System.out.println(number);
        		break;
        	} else {
        		index++;
        	}
        }

	}
}
 