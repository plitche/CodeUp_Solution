package Q2601;

import java.util.Scanner;

public class testtest {

   public static void main(String[] args) {
      /* 년월일(yyyy.mm.dd)를 입력받아,
       * 
       * 일월년(dd-mm-yyyy)로 출력해보자.
       * 
       * (단, 한 자리 일/월은 0을 붙여 두자리로, 년도도 0을 붙여 네자리로 출력한다.)
       */
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      str = "2021.01.01";
      System.out.println(str);
      
      String[] arr = str.split("\\.");
      
      System.out.println();
   }

}