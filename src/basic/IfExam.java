package basic;
import java.io.IOException;

import javax.swing.JOptionPane;

public class IfExam {

	public static void main(String[] args) throws IOException{
//		
//		int a = 1;
//		
//		if (a>0) 
//			System.out.println("a는 0보다 큽니다.");
//		System.out.println("여긴 if 실행문이 아닌 main() 실행문 입니다.");
		
		//조건식을 이용해서 아래와 같은 로직을 완성하세요.
		/*
		 * 수 3개를 입력 받습니다.
		 * 출력 결과는 가장 큰 수 부터 출력시키세요
		 * ex > 4, 1001, 985 --> 결과 : 1001 >=985 >=4
		 */
		
		/*
		 * int fir, sec, thr, temp
		 * 
		 * if (sec >= fir && sec >= thr){
		 * 	//무조건 두번째 수가 크다.
		 *  //값을 치환한다..
		 *  temp = fir;
		 *  fir = sec; // 그냥 이렇게 하면 fir의 값은 날아가버림..
		 *  thr = fir;
		 * }
		 */
		
		int fir = Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자를 입력하세요"));
		int sec = Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자를 입력하세요"));
		int thr = Integer.parseInt(JOptionPane.showInputDialog("세번째 숫자를 입력하세요"));
		
		if (sec >= fir && sec >= thr) {
			if(fir >= thr) {
				System.out.println(sec + ">=" + fir + ">=" + thr);
			}else {
				System.out.println(sec + ">=" + thr + ">=" + fir);
			}
		}else if (fir >= sec && fir >=thr) {
			if (sec>=thr) {
				System.out.println(fir + ">=" + sec + ">=" + thr);
			}else {
				System.out.println(fir + ">=" + thr + ">=" + sec);
			}
		}else if (thr >= fir && thr >=sec) {
			if (fir >= sec) {
				System.out.println(thr + ">=" + fir + ">=" + sec);
			}else {
				System.out.println(thr + ">=" + sec + ">=" + fir);
			}
		}
	}



}
