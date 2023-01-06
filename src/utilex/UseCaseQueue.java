package utilex;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

/*
 * 우리가 게임을 짤 때 메뉴를 보여주는 것처럼, 특정 명령어(history)를 입력하면
 * 입력한 명령어를 입력순으로(Queue) 보여지도록 구현하는 클래스입니다.
 */
public class UseCaseQueue {

	static Queue<String> q = new LinkedList<String>();
	static final int MAX_INPUT_SIZE = 10;// Queue에 저장 가능한 최대 명령어 갯수 초기화.

	public static void main(String[] args) {
		System.out.println("help 를 입력하면 도움말을 볼 수 있음");
		try {//ctrl + shift + f 입력하면 코드나열이 보기 편하게 tab됨.
			while (true) {
				System.out.print(">>> ");

				Scanner s = new Scanner(System.in);//scanner를 이용해 콘솔에 값을 입력받게 함
				String input = s.nextLine().trim();//enter를 치기 전까지 쓴 모든 문자열을 리턴(nextline), trim()을 이용해 좌우의 공백 제거

				if (input.equals("")) 
					continue; //공백을 입력하면 continue를 이용함

				if (input.equalsIgnoreCase("q")) {
					System.exit(0);// q를 입력하면 시스템 종료
				} else if (input.equalsIgnoreCase("help")) { //대소문자 상관없이(equalIsIgnoreCase) help를 치면 도움말이 뜨게 함
					System.out.println("help : 도움말 보기");
					System.out.println("q OR Q : 프로그램 종료하기");
					System.out.println("history : 최근 입력 명령어를 최대 " + MAX_INPUT_SIZE + "개까지 보여줍니다.");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0; // 저장된 명령어의 순번 Sequence

					// history 자체도 명령어임.. 따라서 저장함..
					saver(input);

					// 아래는 조금이따가 배울 Iterable(기억나세요??)로 변환해서
					// Q에 있는 명령어를 추출하도록 정의합니다.
					LinkedList<String> temp = (LinkedList<String>) q;
					ListIterator<String> it = temp.listIterator();
					// Iterator 타입(내부 순환자)의 대표적 메서드로
					// 요소가 존재하면 true리턴.. 이걸 이용하면 요소의 끝까지
					// 리턴받을 수 있음..
					while (it.hasNext()) {
						// Iterator의 next()는 요소를 리턴받는 메서드입니다.
						System.out.println(++i + ". " + it.next());
					}
				} // End of history...
				else {// 그냥 명령어만 입력한 경우..
					saver(input);
					System.out.println(input);
				} // End of else...

			} // End of while...
		} catch (Exception e) {
			System.out.println("입력오류가 발생했습니다. 다시 입력해주세요.");
		}

	}// End of main...

	// 사용자의 명령어를 저장하는 기능의 메서드 구현
	public static void saver(String input) {
		// Queue에 저장한다..
		if (!"".equals(input)) {
			q.offer(input);
		}
		// Q의 최대 크기를 넣으면 제일 처음 입력된 것을 삭제시키도록 함..
		if(q.size() > MAX_INPUT_SIZE) {
			q.remove();
		}
		
		
	}

}
