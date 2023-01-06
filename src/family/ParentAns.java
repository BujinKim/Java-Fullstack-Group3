package family;

public class ParentAns {
	private String fName;
	private String jobName;
	public ParentAns(String fName) {
		this.fName = fName;
		this.jobName = "내 직업은 택시 드라이버";
	}	
	public void doJob(){
		System.out.println(jobName);
	}
}
