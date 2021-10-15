package Q1418;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1418
//@Memory 11156, @Time 61

public class Answer1 {
	//	어떤 문자열이 있을 때 문자 t의 위치를 모두 찾아 출력하시오.
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	String word = br.readLine();
    	
    	for (int i=0; i<word.length(); i++) {
    		if (word.charAt(i)=='t') {	// charAt을 통해서 각 자리가 't'와 같은지 비교
    			sb.append(i+1).append(" ");
    		}
    	}
        
        System.out.println(sb);
        br.close();
    }
    	 
}