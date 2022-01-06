package Q2601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2601
//@Memory 11164, @Time 67
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        int[] arr = new int[count];
        if (count == 1 || count == 2) {
        	System.out.print(1);
        } else {
        	arr[0] = 1;
        	arr[1] = 1;
        	for (int i=2; i<count; i++) {
        		arr[i] = arr[i-1]+arr[i-2];
        	}
        	
        	System.out.print(arr[count-1]);
        }
        
	}
    	 
}

