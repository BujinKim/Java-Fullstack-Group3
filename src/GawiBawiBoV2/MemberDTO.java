package GawiBawiBoV2;
import javax.swing.JOptionPane;

public class MemberDTO {	
	private String mem_Email;
	GawiBawiBoGame GBB;
	JOptionPane JP;
	
	public MemberDTO() {
		inputEmail();
	}
	
	//메서드 리턴을 void로 했는데, 예시 끝난 후 로직상 변경해야 할겁니다.
	private void inputEmail() {
		this.mem_Email = JP.showInputDialog("Email을 입력하십시오.");
		GBB = new GawiBawiBoGame(); // Email입력 후 가위바위보 게임 메인화면 in
	}

	public String getMem_Email() {
		return mem_Email;
	}
}
