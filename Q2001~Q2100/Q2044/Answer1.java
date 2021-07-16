package Q2044;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2044
//@Memory 11152, @Time 62
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        
        char[] arr = new char[line.length()];
        int i = 0;
        int index = 0;
        while(true) {
        	if (line.charAt(index) == 'A') {
        		i -= 1;
        		if (index == arr.length-1) {
        			i -= 1;
        			break;
        		}
        	} else if (line.charAt(index) == 'B') {
        		i -= 2;
        		if (index == arr.length-1) {
        			i -= 2;
        			break;
        		}
        	} else if (line.charAt(index) == 'C') {
        		i = 0;
        		if (index == arr.length-1) {
        			break;
        		}
        	} else {
        		arr[i] = line.charAt(index);

        		if (index<arr.length-1) {
        			i++;	
        		}
        	}
        	
        	if (index<arr.length-1) {
        		index++;	
        	} else {
        		break;
        	}
        	
        }
        
    	for (int j=0; j<=i; j++) {
        	sb.append(arr[j]);
        }	
        
    	System.out.println(sb);	
	}
}