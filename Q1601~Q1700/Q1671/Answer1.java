package Q1671;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1671
//@Memory 11200, @Time 67

public class Answer1 {
	// 바위=0, 가위=1, 보=2
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); 

        int me = Integer.parseInt(st.nextToken());
        int computer = Integer.parseInt(st.nextToken());
        
        if (me == computer) {
        	sb.append("tie");
        } else {
        	if (me == 0) {
        		if (computer == 1) {
        			sb.append("win");
        		} else {
        			sb.append("lose");
        		}
            } else if (me == 1) {
            	if (computer == 0) {
        			sb.append("lose");
        		} else {
        			sb.append("win");
        		}
            } else {
            	if (computer == 0) {
        			sb.append("win");
        		} else {
        			sb.append("lose");
        		}
            }	
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}