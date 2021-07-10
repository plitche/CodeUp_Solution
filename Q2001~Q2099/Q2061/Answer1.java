package Q2061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2061
//@Memory 11192, @Time 67
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int floor = 0;
        switch(br.readLine()) {
        case "A" : floor = 10; break;
        case "S" : floor = 2; break;
        case "O" : floor = 1; break;
        }
        
        int t = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int money = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(br.readLine());
        
    	System.out.println((t + floor*x/w)*price > money +1 ? "No" : "Yes");	
    	
	}
}