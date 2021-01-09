package Q1008;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1008
//@How BufferedWriter
//@Memory , @Time

public class Answer2 {

	public static void main(String[] args) throws IOException {
		/*	
		 * buffer(버퍼)
		 * - 일시적으로 전송할 데이터를 보관하는 임시 메모리 영역
		 * - 입출력 속도 향상에 도움이 된다. (많은 양을 처리할 때 성능에서 뛰어나다.)
		 */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.append("┌┬┐\n").append("├┼┤\n").append("└┴┘");
		// 역슬래쉬+n 을통해서 줄 바꿈 처리를 해준다.
		
		// 마찬가지로 유니코드 특수문자 출력 방법을 사용할 수 있다.
		// bw.append("\u250C\u252C\u2510\n").append("\u251C\u253C\u2524\n").append("\u2514\u2534\u2518\n");
		bw.flush();	//버퍼에 남아있는 데이터를 출력시킴(버퍼를 비우는 동작)
		bw.close();
	}
}
