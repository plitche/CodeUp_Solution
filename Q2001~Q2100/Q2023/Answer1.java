 package Q2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2023
//@Memory 11164, @Time 61
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        	
        int[] arr = new int[10];
        int index = 0;
        while(number>26) { // 알파벳 개수
        	int left = number%26; // 해당 number의 나머지
        	if (left==0) {
        		left=26;
        	}
        	arr[index] = left;
    		number /= 26;		
        	index++;
        }
        arr[index] = number;
        
        int[] result = new int[index];
        result = arr;
        
        for (int i=index; i>=0; i--) {
        	if (i-1 >= 0 && result[i-1] == 26) {
    			sb.append((char)(result[i]+63));	// char타입으로 변환(알파벳으로)  			
    		} else {
    			sb.append((char)(result[i]+64));
    		}
        }
        
        System.out.println(sb);
	}
}
 