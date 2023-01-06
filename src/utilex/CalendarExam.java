package utilex;

import java.util.Calendar;

public class CalendarExam {

	static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 " +
				cal.get(Calendar.DATE) + "일 ";
	}
	
	public static void main(String[] args) {
		
		final String[] DAY_OF_WEEK = {" ", "일","월","화","수","목","금","토"}; // 1부터 맵핑이 되기때문에 처음에 공백을 넣거나 -1을 해야됨.
		Calendar rightNow = Calendar.getInstance();
		Calendar rightNow2 = Calendar.getInstance();
		//System.out.println(rightNow);
		
		rightNow.set(Calendar.YEAR, 2022); // 파라미터 2개짜리는 첫번째에 무조건 Calendar.xxxx를 치고 두번째는 값을 넣음.
		rightNow.set(Calendar.MONTH, 0); // 배열에서 가져오기 때문에 해당월에서 -1을 해줘야됨 (ex. 1월이면 0, 12월이면 11)
		rightNow.set(Calendar.DATE, 4); //날짜는 월과 다르게 그냥 값을 입력하면 됨.
		
		
		
		
		System.out.println("rightNow 는 " + toString(rightNow) + 
				DAY_OF_WEEK[rightNow.get(rightNow.DAY_OF_WEEK)] + "요일입니다.");//가능은 하지만 static이라 Calendar.으로 시작해야됨
		System.out.println("rightNow2 는 " + toString(rightNow2) + 
				DAY_OF_WEEK[rightNow2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
		
		
		
		long differ = (rightNow2.getTimeInMillis() - rightNow.getTimeInMillis()) / 1000;
		
		System.out.println("작년 오늘 날짜부터 현재까지는 " + differ + " 초가 지남.");
		System.out.println("일단위로 표현하자면 --> " + differ / (24*60*60));
		
		
		
		
		
		
		
		
		
	}

}
