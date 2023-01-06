package basic;
import javax.swing.JOptionPane;

/*
 * 가위바위보 게임을 만드세요.
 * 조건은 아래와 같습니다.
 * 
 * 1. 프로그램 시작하면 게임 하실래요(Y/N)? 라고 묻고 y 입력시 게임 시작됩니다.
 * 2. 시작되면 사용자에게 값을 입력토록 하세요 (가위, 바위, 보 중 하나)
 * 2-1. 만약 위 값이 아닌 다른값이 들어오면 "틀린 값입니다." 출력 후 프로그램 종료.
 * 3. 만약 올바른 값이 입력되면, Math.random() 을 이용해서 1 ~ 3 까지 생성하세요.
 * 4. 생성된 값을 이용해서 사용자와 컴퓨터간의 게임을 진행 후 아래처럼 출력시키세요.
 * 5. 축 당신 승(컴 : 보, 당신 : 가위) or ㅠㅠ 컴 승(컴 : 주먹, 당신 : 가위)
 * 6. 위 메세지가 출력된 후, 프로그램을 종료하세요.
 */
public class GawiBawiBoGame {

	public static void main(String[] args) {
		int start = JOptionPane.showConfirmDialog(null, "가위바위보 한판 하실래요?"); // confirm으로 좀 더 간편하게
		if(start == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}else if (start == JOptionPane.NO_OPTION) {
			System.exit(0);
		}
	int my = Integer.parseInt(JOptionPane.showInputDialog("해당하는 숫자를 입력하세요. 1. 가위 2. 바위 3. 보")); // 숫자로 할당
	if (my != 1 && my != 2 && my != 3) {
		JOptionPane.showMessageDialog(null, "정확한 값을 입력해주세요."); // = 틀린값입니다.
		System.exit(0);
	}
	
	int com = (int)(Math.random()*3)+1; // 컴퓨터 난수
	System.out.println(com);
	
	if (my == 1 && com == 1) {
		JOptionPane.showMessageDialog(null, "비겼습니다! (컴 : 가위 / 당신 : 가위)");
	}else if (my == 2 && com == 2) {
		JOptionPane.showMessageDialog(null, "비겼습니다! (컴 : 바위 / 당신 : 바위)");
	}else if (my == 3 && com == 3) {
		JOptionPane.showMessageDialog(null, "비겼습니다! (컴 : 보 / 당신 : 보)");
	}else if (my == 1 && com == 2) {
		JOptionPane.showMessageDialog(null, "컴퓨터가 이겼습니다 ㅠㅠ (컴 : 바위 / 당신 : 가위)");
		System.exit(0);
	}else if(my == 1 && com == 3) {
		JOptionPane.showMessageDialog(null, "축하합니다! 당신이 이겼습니다! (컴 : 보 / 당신 : 가위)");
		System.exit(0);
	}else if(my == 2 && com == 1) {
		JOptionPane.showMessageDialog(null, "축하합니다! 당신이 이겼습니다! (컴 : 가위 / 당신 : 바위)");
		System.exit(0);
	}else if(my == 2 && com == 3) {
		JOptionPane.showMessageDialog(null, "컴퓨터가 이겼습니다 ㅠㅠ (컴 : 보 / 당신 : 바위)");
		System.exit(0);
	}else if(my == 3 && com == 1) {
		JOptionPane.showMessageDialog(null, "컴퓨터가 이겼습니다 ㅠㅠ (컴 : 가위 / 당신 : 보)");
		System.exit(0);
	}else if(my == 3 && com == 2) {
		JOptionPane.showMessageDialog(null, "축하합니다! 당신이 이겼습니다! (컴 : 바위 / 당신 : 보)");
		System.exit(0);
	}
}
		
//	String[] com = {"가위","바위","보"};
//	String comValue = com[((int)(Math.random()*com.length))];
//	System.out.println(comValue);
	}
	


