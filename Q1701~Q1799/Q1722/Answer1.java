package Q1722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1722
//@Memory 14560, @Time 113

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        int[] x = new int[count];
        int[] y = new int[count];
        for (int i=0; i<count; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	x[i] = Integer.parseInt(st.nextToken());
        	y[i] = Integer.parseInt(st.nextToken());
        }

        double length = 0;
        for (int i=0; i<count-1; i++) {
        	int width = x[i] - x[i+1];
        	int height = y[i] - y[i+1];
        	length += Math.sqrt(width*width+height*height);
        }
        
        System.out.println(String.format("%.2f", length));
    }
    	 
}