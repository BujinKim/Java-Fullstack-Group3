package family;

public class Son extends Parent{
	private String familyName;
	private String myJob;


	public Son(String familyName, String myJob) {
		super("미국 Ja씨","taxiDriver");
		this.familyName = familyName;
		this.myJob = myJob;
	}
	
	public String toString() {
		return super.toString() + "\n저는 Son. 성은 " + this.familyName + ", 내 직업은 " + this.myJob + "입니다.";
	}
}