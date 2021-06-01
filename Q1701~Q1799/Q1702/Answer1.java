package Q1702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1702
//@Memory 11164, @Time 96

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String a = st.nextToken();
        String b = st.nextToken();
        String c = st.nextToken();
        
        System.out.println(Integer.parseInt(b)%2 == 0 ? a+b+c+" "+a+b+c : a+b+c);
    }
    	 
}