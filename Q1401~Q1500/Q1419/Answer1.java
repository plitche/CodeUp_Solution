package Q1419;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1419
//@Memory 11112, @Time 67

public class Answer1 {
	//	영어 문장이 입력된다. 그 문장에서 love가 몇 번 나오는지 출력하시오.
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String line = br.readLine();
    	
    	int count = 0;
    	// substring을 통해서 문자열 비교를 해야함으로 length-4만큼 for문 반복
    	for (int i=0; i<line.length()-4; i++) {
    		if (line.substring(i, i+4).equals("love")) {
    			count++;
    		}
    	}

    	System.out.println(count);
        br.close();
    }
    	 
}