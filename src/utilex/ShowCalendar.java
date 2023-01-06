package utilex;

import java.util.Calendar;

import javax.swing.JOptionPane;

/*
 * roll() : 필드의 값을 증가시키는 메서드... 다른 필드엔 영향 없음..
 * 단, 일필드가 말일인 경우, 월을 변경하는 케이스엔 일필드가 변경된다.
 * 
 * add() : 특정 필드를 변경시, 다른 데이터에도 영향을 미친다..
 */
public class ShowCalendar {

	public static void main(String[] args) {

		// 사용자에게 입력받기
		String input = JOptionPane.showInputDialog("년도와 월을 입력하세요.");

		if (input != null) {
			// 년 분리
			int year = Integer.parseInt(input.substring(0, 4)); // 년도 0글자에서 4글자까지 분리
			// 월 분리
			int month = Integer.parseInt(input.substring(4, input.length()));// 월을 길이만큼 자름

			int start_day_of_week = 0;
			int end_day = 0;

			// 요청한 년월에 맞는 객체 생성
			Calendar sDay = Calendar.getInstance();
			// 요청한 월의 마지막 날을 계산하기 위한 다음달의 정보를 가지는 객체 생성.
			Calendar eDay = Calendar.getInstance();

			// 월 세팅.. 0 ~ 11 이므로 연산해야함. 1월의 index가 0, 12월의 index가 11이기 때문
			sDay.set(year, month - 1, 1);
			eDay.set(year, month, 1); // 요청한 달의 다음달 1일

			// 요청한 달의 마지막 날 추출하기.. add()
			eDay.add(Calendar.DATE, -1);

			// 이제 사용자가 요청한 달의 첫날과 끝날을 찾았으니
			// 다음엔 1일이 무슨 요일인지 찾아야함.. DAY_OF_WEEK 이용해서 찾음
			start_day_of_week = sDay.get(Calendar.DAY_OF_WEEK);
			end_day = eDay.get(Calendar.DATE);

			System.out.println(" Su Mon Tu We Th Fr St");

			// 출력시 해당 월의 1일이 어느 요일인지를 파악 후, 이전 요일은 공백을 줍니다.
			for (int i = 1; i < start_day_of_week; i++) {
				System.out.print("   ");// 3칸 띄우세요.
			}

			// 날자를 출력 시키는데, 2가지 생각해야 함.
			// 1. 정렬 : 10일 이전은 문자가 하나이고, 이후는 2개임.. 따라서
			// 공백을 적절히 이용해서 정렬을 해줄 예정입니다. (2칸, 1칸)
			// 2. 일요일 ~ 토요일까지 출력 후 라인을 변경해서 다시 날짜를 출력해야하는데
			// 그 기준점이 일주일 기준인 7입니다. 따라서 % 를 사용해서 주 변경을 하도록 합니다.

			for (int i = 1, n = start_day_of_week; i <= end_day; i++, n++) { // i는 일값, n은 주값
				System.out.print((i < 10) ? "  " + i : " " + i);// 2칸 공백, 1칸 공백
				if (n % 7 == 0) {// 라인을 바꿔줌
					System.out.println();
				}
			}

		} // End of if

	}

}
