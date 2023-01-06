package family;

public class Parent {
	private String familyName;
	private String myJob;
	
	
	public Parent(String familyName, String myJob) {
		this.familyName = familyName;
		this.myJob = "택시 드라이버";
	}
	
	
	public String toString() {
		return "시조 Parent 성은 " + familyName +", 시조의 직업은 " + myJob + "입니다.";
	}
	

}
