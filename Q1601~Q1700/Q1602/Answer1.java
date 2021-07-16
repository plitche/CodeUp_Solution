package Q1602;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1602
//@Memory 11260, @Time 96

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double number = Double.parseDouble(br.readLine());
        
        number = number < 0 ? number*-1 : number;
        int index = String.valueOf(number).indexOf('.');
        String underZero = String.valueOf(number).substring(index+1);

        if (underZero.equals("0")) {
        	System.out.println(String.valueOf(number).substring(0, index));
        } else {
        	System.out.println(number);
        }
        
        br.close();
    }
    	 
}