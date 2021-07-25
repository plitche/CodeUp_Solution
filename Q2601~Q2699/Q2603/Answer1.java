package Q2603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2603
//@Memory 11192, @Time 67
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String[][] arr = new String[10][10];
        for (int i=0; i<10; i++) {
    		int number = Integer.parseInt(st.nextToken())/10;
    		
    		for (int j=0; j<10-number; j++) {
    			arr[j][i] = " ";
    		}
    		for (int j=10-number; j<10; j++) {
    			arr[j][i] = "#";
    		}
        }
        
        for (String[] i : arr) {
        	for (String j : i) {
        		sb.append(j+" ");
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
	}
    	 
}

