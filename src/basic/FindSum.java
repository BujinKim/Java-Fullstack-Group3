package basic;
import javax.swing.JOptionPane;

public class FindSum {

	public static void main(String[] args) {
		
		int fir = Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자를 입력하세요"));
		int sec = Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자를 입력하세요"));
		int temp;
		
		if(fir >= sec) {
			temp = fir;
			fir = sec;
			sec = temp;
		}
		
		int sum = 0;
		for (int i = fir; i<=sec; i++) {
			sum += i;			
		}
		System.out.println(fir + " ~ " + sec + "의 누적합은 " + sum);
		


	}

}
