package Q1405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1405
//@Memory 12284, @Time 78

public class Answer2 {
	//	n개의 숫자가 입력되면,
	//	n개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오.
	 
    public static void main(String[] args) throws IOException {
    	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringBuilder sb = new StringBuilder();
          int n = Integer.parseInt(br.readLine());
          String str = br.readLine();
          StringTokenizer st = new StringTokenizer(str, " ");

          String[] num = new String[n];
          for (int i=0; i<n; i++) {
              num[i] = st.nextToken();
          }

          for (int i=0; i<n; i++) {

              for (int j=0; j<n; j++) {
                  sb.append(num[j]).append(" ");
              }
              sb.append("\n");

              String temp;
              temp=num[0];
              for (int j=1; j<n; j++) {
                  num[j-1]=num[j];
              }
              num[n-1]=temp;
          }
          System.out.println(sb);
    }
	
}