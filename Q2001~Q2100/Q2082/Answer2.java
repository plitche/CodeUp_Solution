package Q2082;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2082
//@Memory 21492, @Time 132
public class Answer2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = Integer.parseInt(st.nextToken());
        int number = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        
        boolean isFind = false;
        for (int i=0; i<count; i++) {
        	int no = Integer.parseInt(st2.nextToken());
        	if (no == number) {
        		isFind = true; 
        		System.out.println(i+1);
        		break;
        	} 
        }
        if (!isFind) {
        	System.out.println("-1");	
        }
	}
}