package Q1640;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1640
//@Memory 11176, @Time 64
public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        int badPro = 0;
        for (int i=0; i<count; i++) {
        	String word = br.readLine();
        	if (word.length()<=3 || word.indexOf("tap") != -1 || word.indexOf("xocure") != -1) {
        		badPro ++;
        		sb.append(word).append("\n");
        	}
        }

        if (badPro<=3) {
        	sb.append("safe");
        } else if (badPro<=6) {
        	sb.append("warning");
        } else {
        	sb.append("danger");
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}