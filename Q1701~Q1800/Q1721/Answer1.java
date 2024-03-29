package Q1721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1721
//@Memory 14264, @Time 110

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        
        int x1 = Integer.parseInt(st1.nextToken()); // 왼쪽 꼭지점 가로좌표
        int y1 = Integer.parseInt(st1.nextToken()); // 왼쪽 꼭지점 세로좌표
        int x2 = Integer.parseInt(st2.nextToken()); // 오른쪽 꼭지점 가로좌표
        int y2 = Integer.parseInt(st2.nextToken()); // 오른쪽 꼭지점 가로좌표
        
        int width = x2-x1;
        int height = y2-y1;
        
        double length = Math.sqrt(width*width+height*height); // 거리 계산
        
        System.out.println(String.format("%.2f", length));
    }
    	 
}