package Q1677;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1677
//@Memory 11192, @Time 70

public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int width = Integer.parseInt(st.nextToken());
        int height= Integer.parseInt(st.nextToken());
        		
        for (int i=0; i<height; i++) {
        	for (int j=0; j<width; j++) {
        		if ( (i==0 || i==height-1) && (j==0 || j==width-1) ) {
        			sb.append('+'); 	
        		} else if (i==0 || i==height-1) { 
        			sb.append('-');
        		} else if (j==0 || j==width-1) {
        			sb.append('|');
        		} else {
        			sb.append(' ');
        		}
        	}
        	sb.append("\n");
        }
	
        System.out.println(sb);
    }
    	 
}