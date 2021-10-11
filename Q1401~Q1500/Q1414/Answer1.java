package Q1414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1414
//@Memory 11128, @Time 67

public class Answer1 {
	//	문자열에서 “C”라는 문자와 “CC”라는 문자가 몇 개 있는지 조사하고자 한다.
	//	① 첫 번째 줄에는 문자열에서 찾은 “C”의 개수를 출력한다.
	//	② 두 번째 줄에는 문자열에서 찾은 “CC”의 개수를 출력한다.
	
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String line = br.readLine();

         int cCount = 0;
         int ccCount = 0;
         
         for (int i=0; i<line.length(); i++) {
        	 // c의 개수 구하기
        	 if (line.charAt(i)=='c' || line.charAt(i)=='C') {
        		 cCount++;
        	 }
        	 // cc의 개수 구하기
        	 if (i<=line.length()-2) {
        		 String a = line.substring(i, i+2);
        		 if (a.equals("CC") || a.equals("Cc") || a.equals("cC") || a.equals("cc")) {
        			 ccCount++;
        		 }
        	 }
         }
         
         System.out.println(cCount);
         System.out.println(ccCount);
    }
	
}