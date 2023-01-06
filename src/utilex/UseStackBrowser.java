package utilex;

import java.io.IOException;
import java.util.Stack;

/*
 * Stack 2개를 이용해서 웹브라우저의 back, forward 의 URL 저장 하는 방법을 알아봅니다.
 */
public class UseStackBrowser {
	
	
	//사용될 Stack 2개를 생성합니다.
	public static Stack<String> back = new Stack<String>();//back 생성시 주소값
	public static Stack<String> forward = new Stack<String>();//forward 생성시 주소값
	
	public static void main(String[] args) {
		goURL("http://www.daum.net");
		goURL("http://www.naver.com");
		goURL("http://www.nate.com");
		printStatus(); // 콘솔창에 어떤 화면이 나와있는지 뜸
		goBack();
		printStatus();
		goBack();
		printStatus();
		forForward();
		printStatus();
		forForward();
		printStatus();
	}

	//현재 브라우저가 표시하고 있는 상태를 메세지로 출력할 메서드 정의
	public static void printStatus() {
		System.out.println("back Stack : " + back);
		System.out.println("forward Stack : " + forward);
		System.out.println("현재 화면은 : " + back.peek() + " 입니다.");
		System.out.println();
	}
	
	//브라우저의 로케이터에 URL을 입력하는 기능의 메서드를 정의합니다.
	public static void goURL(String url) {
		//아래는 Runtime 클래스의 유용한 메서드 중 OS의 특정 exe를 동적으로 호출하여
		//실행하는 메서드를 사용합니다. 여기서 주어지는 파라미터가 윈도우에 있고, 이름이
		//정확하다면 실행이 되어집니다.
		Runtime runtime = Runtime.getRuntime();
		
		try {
			runtime.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe " + url);//exe뒤에 공백을 붙여줘야함
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		back.push(url);
		
		//만약 forward 스택에 가비지가 있다면 clear() 합니다.
		if(!forward.isEmpty()) {
			forward.clear();
		}
		
	}
	
	//브라우저에서 back, forward를 클릭처럼, 그 기능을 내부적으로 구현하는 메서드 정의
	public static void forForward() {
		//항상 주의해야 할건, 객체는 null, collection 들은 요소가 있는지 여부를
		//먼저 확인하세요.. 안그러면 예외가 발생가능성이 있습니다.
		if(!forward.isEmpty()) {
			back.push(forward.pop());
		}
	}
	public static void goBack() {
		if(!back.isEmpty()) {
			forward.push(back.pop());
		}
	}
	
	
	
	
}
