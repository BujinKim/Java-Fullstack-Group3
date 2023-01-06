package GawiBawiBoV2;

public class ShowStat{

	private int winCnt;
	private int drawCnt;
	private int loseCnt;
	private int gameCnt;
	
	public void win() {
		this.winCnt++;
	}
	public void draw() {
		this.drawCnt++;
	}
	public void lose() {
		this.loseCnt++;
	}
	public void gameCnt() {
		this.gameCnt++;
	}

	
	public String showStats() {
		System.out.println(winCnt);
		System.out.println(gameCnt);
		return "지금까지의 전적은 " + gameCnt + "전 " + winCnt + "승 " + drawCnt + "무 " + loseCnt + "패 입니다.\n승률 : " + ((double)winCnt)/((double)gameCnt)*100 + "%";
//		return "지금까지의 전적은 " + gameCnt + "전 " + winCnt + "승 " + drawCnt + "무 " + loseCnt + "패 입니다.";
	}

}
