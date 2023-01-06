package basic;
import java.io.IOException;

import javax.swing.JOptionPane;

public class IfExamAns {

	public static void main(String[] args) throws IOException{

		
		int fir = Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자를 입력하세요"));
		int sec = Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자를 입력하세요"));
		int thr = Integer.parseInt(JOptionPane.showInputDialog("세번째 숫자를 입력하세요"));
		int temp; // temper 임시 변수
		
		if (sec >= fir && sec >= thr) {
			//무조건 두번째 수가 크다.
			// 값을 치환한다.
			temp = fir;
			fir = sec;
			sec = temp;
		}else if(thr >= fir && thr >=sec) {
			//무조건 3번째 입력값이 제일 큰 경우
			temp = fir;
			fir = thr;
			thr = temp;
		}
		
		//3번째 수가 2번보다 클 경우..
		if(thr >= sec) {
			temp = sec;
			sec = thr;
			thr = temp;
		}
		
		System.out.println(fir + " >=" + sec + " >=" + thr);

	}

}