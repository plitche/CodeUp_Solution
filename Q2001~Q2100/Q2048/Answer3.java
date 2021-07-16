package Q2048;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2048
//@Memory 11200, @Time 67
public class Answer3 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        double total = 0;
        for (int i=0; i<4; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<4; j++) {
        		total+=Integer.parseInt(st.nextToken());
        	}
        }

        while(true) {
        	total/=2.0;

        	if (total==1) {
        		System.out.println("yes");
        		break;
        	} else if (total<1) {
        		System.out.println("no");
        		break;
        	}
        	
        }
	}
}