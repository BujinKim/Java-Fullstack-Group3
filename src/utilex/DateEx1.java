package utilex;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		/*
		 * System.currentTimeMillis() : 시스템으로부터 현재 시간을 long 으로 리턴함.
		 * long은 MilliSecond를 뜻합니다.
		 */
		System.out.println(System.currentTimeMillis());
		
		Date now = new Date();//기본생성자
		Date now2 = new Date(System.currentTimeMillis() + (1000 * 60 * 60 * 24));//long을 파라미터로 받아서 만든 생성자...
		//1000(MilliSecond) * 60(초) * 60(분) * 24(시간) 이런식으로 하면 날짜도 바꿀수 있음
		System.out.println(now);
		System.out.println(now2);
		now.setTime(System.currentTimeMillis() + (1000 * 60 * 60 * 24));
		System.out.println(now);
	}

}
