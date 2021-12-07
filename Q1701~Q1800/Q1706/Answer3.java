package Q1706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1706
//@Memory 11184, @Time 68

public class Answer3 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // String을 공백 기준으로 split하여 배열에 저장
        String[] arr = br.readLine().split(" ");

        for (int i=4; i>=0; i--) {
        	sb.append(arr[i]).append(" "); // 역순으로 꺼내어 저장
        }
        
        System.out.println(sb);
    }
    	 
}