package Q1704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1704
//@Memory 11184, @Time 138

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int front = Integer.parseInt(st.nextToken().substring(0, 2));
        int back = Integer.parseInt(st.nextToken().substring(0, 1));
        
        int age;
        if (back==1 || back==2) {
        	age = 112-front+1;
        } else {
        	System.out.println(front);
        	age = 12-front+1;
        }
        
        System.out.println(age + " " + ((back==1||back==3) ? "M" : "F"));
    }
    	 
}