package Q1415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1415
//@Memory 11164, @Time 70

public class Answer1 {
	//	가장 큰 홀수 하나와 짝수 하나를 출력한다. 단 홀수 혹은 짝수만 존재할 경우에는 가장 큰 수를 출력한다.
	
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    	 int odd = 0;
    	 int even = 0;
    	 
    	 // 토큰이 더 있는 동안 while문 반복
    	 while(st.hasMoreTokens()) {
    		 int number = Integer.parseInt(st.nextToken());
    		 if (number%2==0) {	// 짝수일 때
    			 // 새로 입력받은 짝수가 even보다 크면
    			 if (even<number) {
    				 even = number;
    			 }
    		 } else { // 홀수일 때
    			 // 새로 입력받은 홀수가 odd보다 크면
    			 if (odd<number) {
    				 odd = number;
    			 }
    		 }
    	 }
    	 
    	 if (odd == 0) {	// 입력받은 홀수가 없을 때
    		 System.out.println(even);
    	 } else if (even == 0) {	// 입력받은 짝수가 없을 때
    		 System.out.println(odd);
    	 } else {
    		 System.out.println(odd + " " + even);
    	 }
    	 
    }
	
}