//package GawiBawiBoV2;
//
//import javax.swing.JOptionPane;
//
//public class GawiGame { 
//
//	JOptionPane thePane;
//	String userinput;
//	String com;
//	int playCount = 0;
//	int win = 0;
//	int draw = 0;
//	int loss = 0;
//	String[] theMessage;
//	boolean isCorrect; 
//	
////	public void GameStart() {
////		JOptionPane.showInputDialog("해당되는 번호를 고르십시오.\n1.New Game 2. Show Stats 3. Exit");
////	}
//	
//	public GawiGame() {
//		theMessage = new String[] { "가위(1), 바위(2), 보(3) 중 하나 입력하세요" };
//		
//		showMenu();
//		
//	}
//
//	public void showMenu() {
//		while(!isCorrect) {
//			userinput = thePane.showInputDialog(theMessage[0]);
//			playGame();
//			isCorrect = true;
//		}
//
//	}
//
//	public void playGame() {
//		if (this.userinput.equals("1") || this.userinput.equals("가위")) { 
//			win++; draw++; loss++; playCount++;
//		} else if (this.userinput.equals("2") || this.userinput.equals("바위")) {
//			win++; draw++; loss++; playCount++;
//		} else if (this.userinput.equals("3") || this.userinput.equals("보")) {
//			win++; draw++; loss++; playCount++;
//		} else {
//			thePane.showMessageDialog(null, "잘못된 값입니다. 재입력 바랍니다.");
//			showMenu();
//		}
//	}
//
//	public void setPlayCount(int playCount) {
//		this.playCount = playCount;
//	}
//
//	public void setLoss(int loss) {
//		this.loss = loss;
//	}
//	
//	public void setDraw(int draw) {
//		this.draw = draw;
//	}
//
//	public void setWin(int win) {
//		this.win = win;
//	}
//	
//	public int getLoss() {
//		return loss;
//	}
//	
//	public int getDraw() {
//		return draw;
//	}
//	
//	public int getWin() {
//		return win;
//	}
//	
//	public int getPlayCount() {
//		return playCount;
//	}
//
//}
