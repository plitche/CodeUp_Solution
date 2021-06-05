package Q1714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1714
//@Memory 11148, @Time 95

public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String number = br.readLine();
        
        int[] arr = new int[number.length()];
        for (int i=0; i<number.length(); i++) {
        	arr[i] = number.charAt(i)-48;
        }
        
        for (int i=number.length()-1; i>=0; i--) {
        	sb.append(arr[i]);
        }
        System.out.println(sb);
    }
    	 
}