package Q2030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2030
//@Memory 11276, @Time 65
public class Answer2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        char[][] window = new char[30][60];

    	for (int i=0; i<60; i++) {
    		for (int j=0; j<30; j++) {
				window[j][i] = '.';
			}
    	}
        
        for (int i=0; i<count; i++) {
        	st = new StringTokenizer(br.readLine());
        	String name = st.nextToken();
        	int leftX = Integer.parseInt(st.nextToken());
        	int leftY = Integer.parseInt(st.nextToken());
        	int rightX = Integer.parseInt(st.nextToken());
        	int rightY = Integer.parseInt(st.nextToken());
        	
        	for (int j=leftX-1; j<rightX; j++) {
        		for (int k=leftY-1; k<rightY; k++) {
        			if ( j==leftX-1 || j==rightX-1 ) {
        				window[k][j] = '|';
        			} else if (k==leftY-1 || k==rightY-1) {
        				window[k][j] = '-';
        			} else {
        				window[k][j] = ' ';
        			}
    			}
        	}
        	
        	window[leftY-1][leftX-1] = '+';
        	window[leftY-1][rightX-1] = '+';
        	window[rightY-1][leftX-1] = '+';
        	window[rightY-1][rightX-1] = '+';
        	
        	for (int j=0; j<name.length(); j++) {
        		if (j < rightX-leftX-1) {
        			window[leftY-1][leftX+j] = name.charAt(j);
        		} else {
        			
        		}
        	}
        	
        }
        
        for (char i[] : window) {
        	for (char j : i) {
        		sb.append(j);
        	}
        	sb.append("\n");
        }

        System.out.println(sb);
	}
}
 