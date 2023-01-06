package family;

public class Sister extends Parent {
	private String familyName;
	private String myJob;


	public Sister(String familyName, String myJob) {
		super("미국 Ja씨", myJob);
		this.familyName = familyName;
		this.myJob = myJob;
	}
	
	public String toString() {
		return "저는 Sister. 성은 " + this.familyName + ", 내 직업은 " + this.myJob +"입니다.";
	}
}