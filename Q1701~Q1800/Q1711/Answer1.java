package Q1711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1711
//@Memory 11204, @Time 62

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        
        int x1 = Integer.parseInt(st1.nextToken());
        int y1 = Integer.parseInt(st1.nextToken());
        int x2 = Integer.parseInt(st2.nextToken());
        int y2 = Integer.parseInt(st2.nextToken());

        StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
        int x3 = Integer.parseInt(st3.nextToken());
        int y3 = Integer.parseInt(st3.nextToken());
        
        boolean hit = false;
        for (int i=x1; i<=x2; i++) {
        	for (int j=y1; j<=y2; j++) {
        		if (i==x3) {
        			if (j==y3) {
        				hit = true;
        			}
        		}
        	}
        }
 
        System.out.println( hit ? "충돌" : "비충돌");
    }
    	 
}