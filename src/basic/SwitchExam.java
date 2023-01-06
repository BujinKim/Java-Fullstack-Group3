package basic;
import javax.swing.JOptionPane;

public class SwitchExam {

	public static void main(String[] args) {
		
		/*
		 * 자바에서는 switch~case 구문의 조건값으로는 int 이하만 됩니다.
		 * 반드시 기억하세요.
		 */
		
		/*
		 * 두 수와 연산자를 입력해서 결과를 출력하도록 switch 문을 이용해서 구현하세요.
		 * 첫 수 1 연산자 + 두번째수 2 --> 결과 : 1 + 2 = 3
		 * 
		 * 출력문은 반드시 한번만 정의하세요..
		 * 
		 * 
		 * 계산기가 시작하면 아래의 메세지를 띄우세요.
		 * 계산기를 실행 하시겠습니까? --> 확인을 누를시에만 계산기가 작동합니다. (즉 수를 입력받기를 시작합니다.)
		 * no, cancel을 입력하면 좋은 하루 되세요!
		 * 출력후 프로그램 종료
		 * 계산이 끝난 후 사용자에게 더 계산할 지 물어봅니다. (y or n)
		 * 만약 y가 입력되면, 첫수를 다시 입력받도록 하고, 즉, 계산기가 재 실행되게 합니다.
		 * n 입력시.. 좋은 하루 되세요! 메세지 출력 후 종료
		 */
		
//		String a = "a";
//		char op = '+';
//		double d = 1;
//		
//		switch (op) {
//		case '=':
//			
//			break;
//
//		default:
//			break;
		int y1 = JOptionPane.showConfirmDialog(null, "계산기를 실행하시겠습니까?");
		if (y1 == 1 || y1 == 2) {
			JOptionPane.showMessageDialog(null, "계산기를 종료합니다.");
			System.exit(y1);
		}
		
		while (true) {
		int fir = Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자를 입력하세요."));
		char yon = JOptionPane.showInputDialog("연산자를 입력하세요.").charAt(0);
		int sec = Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자를 입력하세요."));
		String msg = ""; // 사용자가 올바르지 않은 연산자를 입력시 처리할 메세지 변수.
		double res = 0; // 결과값 선언
		
		switch (yon) {
		case '+': res = fir + sec;
			break;
		
		case '-': res = fir - sec;
			break;
		
		case '*': res = fir * sec;
			break;
		
		case '/': res = fir / sec;
			break;
		
		case '%': res = fir % sec;
			break;
		
		default : msg = "올바른 연산자가 아닙니다.";
			break;
		}
		if(!msg.equals("")) {
			JOptionPane.showMessageDialog(null, msg);
			System.exit(0); //자바프로그램을 명시적으로 완전종료 하는 API
			//return;
		}
		JOptionPane.showMessageDialog(null, "결과 : " + fir + yon + sec + " = " + res);
		
		int replay = JOptionPane.showConfirmDialog(null, "계산기를 다시 사용하시겠습니까?");
		if (replay == 1 || replay == 2) {
			JOptionPane.showMessageDialog(null, "계산기를 종료합니다.");
			System.exit(y1);
			
//			String replay2 = JOptionPane.showInputDialog("계산기롤 다시 사용하시겠습니까? (Y /N)");
//			if (replay2.equals("n")) {
//				JOptionPane.showMessageDialog(null, "계산기를 종료합니다.");
//				break;
//		}
		}
		}
		
		
		
		}
		
	}


