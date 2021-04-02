package Q1226;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1226
//@Memory 11140, @Time 68

public class Answer1 {
	//  첫 줄에 로또 당첨번호 6개와 보너스 번호 1개가 주어진다.
	//	둘째 줄에 주희가 가지고 있는 로또 번호 6개가 주어진다.
	//	1등 = 1 출력, 2등 = 2 출력, 3등 = 3 출력, 4등 = 4 출력, 5등 = 5 출력, 꽝 = 0 출력
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str1, " ");
        StringTokenizer st2 = new StringTokenizer(str2, " ");
        
        // 당첨 번호와 내가 선택한 번호를 배열에 저장
        int[] lottoNo = new int[7];
        int[] myNo = new int[6];

        // 토큰에서 하나씩 꺼내어 배열에 저장
        for (int i=0; i<6; i++) {
            lottoNo[i] = Integer.parseInt(st1.nextToken());
            myNo[i] = Integer.parseInt(st2.nextToken());
        }
        lottoNo[6] = Integer.parseInt(st1.nextToken());

        int count = 0;	// 맞은 개수 초기화
        int bonus = 0;	// 보너스 맞은 개수 초기화
        // 일치할 때 마다 +1
        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                if (lottoNo[i] == myNo[j]) {
                    count++;
                }
                if (lottoNo[6] == myNo[j]) {
                    bonus++;
                }
            }
        }

        // 보너스가 맞았을 떄와 아닐 떄를 분리하여 출력
        if (bonus==0) {
            if (count<=2) {
                System.out.println(0);
            } else if (count==3) {
                System.out.println(5);
            } else if (count==4) {
                System.out.println(4);
            } else if (count==5) {
                System.out.println(3);
            } else if (count==6){
                System.out.println(1);
            }
        } else {
            if (count<=2) {
                System.out.println(0);
            } else if (count==3) {
                System.out.println(5);
            } else if (count==4) {
                System.out.println(4);
            } else if (count==5) {
                System.out.println(2);
            } else if (count==6){
                System.out.println(1);
            }
        }

    }

}
