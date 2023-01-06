package GawiBawiBoV2;

import javax.swing.JOptionPane;

import GawiBawiBoV2.ShowStat;

public class GawiBawiBoGame {

	ShowStat stat = new ShowStat();
	
	public void start() {
		GawiBawiBoGame();
	}

	
	private void GawiBawiBoGame() {
		showMenu();
	}
	
	private void showMenu() {
		int starNum = Integer.parseInt(JOptionPane.showInputDialog("해당하는 숫자를 입력하세요.\n1. 새로운 게임 2. 전적 보기 3. 게임 종료"));
		if (starNum == 1) {
			theGame();
		}else if (starNum == 2) {
			ShowStat();
		}else if (starNum == 3) {
			JOptionPane.showMessageDialog(null, "게임을 종료합니다.");
			System.exit(0);
		}else {
			JOptionPane.showMessageDialog(null, "잘못된 입력 값입니다. 다시 입력하십시오.");
		}
	}
	
	
	
	private void theGame() {
		
		int my = Integer.parseInt(JOptionPane.showInputDialog("해당하는 숫자를 입력하세요.\n1. 가위 2. 바위 3. 보"));
		
			if (my != 1 && my != 2 && my !=3) {
				JOptionPane.showMessageDialog(null, "잘못된 입력 값입니다. 다시 입력하십시오.");
				theGame();
			};
				
			int com = (int)(Math.random()*3)+1;
			if (my == 1 && com == 1) {
				JOptionPane.showMessageDialog(null, "비겼습니다. (컴 : 가위 / 당신 : 가위)");
				stat.draw();
				stat.gameCnt();
			}else if (my == 2 && com == 2) {
				JOptionPane.showMessageDialog(null, "비겼습니다. (컴 : 바위 / 당신 : 바위)");
				stat.draw();
				stat.gameCnt();
			}else if (my == 3 && com == 3) {
				JOptionPane.showMessageDialog(null, "비겼습니다. (컴 : 보 / 당신 : 보)");
				stat.draw();
				stat.gameCnt();
			}else if (my == 1 && com == 2) {
				JOptionPane.showMessageDialog(null, "컴퓨터가 이겼습니다... (컴 : 바위 / 당신 : 가위)");
				stat.lose();
				stat.gameCnt();
			}else if(my == 1 && com == 3) {
				JOptionPane.showMessageDialog(null, "축하합니다. 당신의 승리입니다! (컴 : 보 / 당신 : 가위)");
				stat.win();
				stat.gameCnt();
			}else if(my == 2 && com == 1) {
				JOptionPane.showMessageDialog(null, "축하합니다. 당신의 승리입니다! (컴 : 가위 / 당신 : 바위)");
				stat.win();
				stat.gameCnt();
			}else if(my == 2 && com == 3) {
				JOptionPane.showMessageDialog(null, "컴퓨터가 이겼습니다... (컴 : 보 / 당신 : 바위)");
				stat.lose();
				stat.gameCnt();
			}else if(my == 3 && com == 1) {
				JOptionPane.showMessageDialog(null, "컴퓨터가 이겼습니다... (컴 : 가위 / 당신 : 보)");
				stat.lose();
				stat.gameCnt();
			}else if(my == 3 && com == 2) {
				JOptionPane.showMessageDialog(null, "축하합니다. 당신의 승리입니다! (컴 : 바위 / 당신 : 보)");
				stat.win();
				stat.gameCnt();
			}
			regame();

	}
	
	private void regame() {
		int reAns = Integer.parseInt(JOptionPane.showInputDialog(null, "1. 새로운 게임 2. 전적 보기 \n종료를 원하시면 아무키나 입력하세요."));
		if (reAns == 1) {
			theGame();
		}else if (reAns == 2){
			ShowStat();
		}else {
			JOptionPane.showMessageDialog(null, "게임을 종료합니다.");
			System.exit(0);
		}
	}
	
	
	private void ShowStat() {
		JOptionPane.showMessageDialog(null, stat.showStats());
		StatRe();
	}
	
	private void StatRe() {
		int keepGoing = Integer.parseInt(JOptionPane.showInputDialog(null, "계속해서 게임을 진행하시겠습니까?\n1. 예 2. 아니오"));
		if (keepGoing == 1){
			theGame();
		}else if (keepGoing == 2) {
			JOptionPane.showMessageDialog(null, "게임을 종료합니다.");
			System.exit(0);
		}else {
			JOptionPane.showMessageDialog(null, "올바른 값을 입력하세요.");
			StatRe();
		}
	}
}