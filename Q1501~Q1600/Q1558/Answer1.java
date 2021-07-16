package Q1558;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1558
//@Memory 11136, @Time 105

public class Answer1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	String number = br.readLine(); 

    	char[] arr = new char[number.length()];
    	
    	// arr에 각 자리의 index를 저장
    	for (int i=0; i<arr.length; i++) {
    		arr[i] = number.charAt(i);
    	}

    	// 저장한 각 자리문자를 거꾸로 출력
    	for (int i=arr.length-1; i>=0; i--) {
    		sb.append(arr[i]);
    	}
    	
        System.out.println(sb);
    }
    
}