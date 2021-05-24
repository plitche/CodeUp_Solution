package Q1581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1581
//@Memory 14208, @Time 자바 제출 불가 

public class Answer1 {

    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	
    	String no1 = st.nextToken();
    	String no2 = st.nextToken();
    	
    	System.out.println(no2 + " " + no1);
    	
    }
    
}