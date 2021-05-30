package Q1675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1675
//@Memory 11096, @Time 61

class Decode {

    int setDecode(char a) {
        if (a==32) {
            return ' ';
        }

        if ((int)a < 100) {
            return 122-(99-a);
        } else {
            return a-3;
        }
    }
}
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String n = br.readLine();

        Decode decode = new Decode();

        for (int i=0; i<n.length(); i++) {
            sb.append((char)(decode.setDecode(n.charAt(i))));
        }

        System.out.println(sb);
    }
    	 
}