package oopEx1.threadEx;

import javax.swing.JOptionPane;

/*
 * 멀티쓰레드로 왜 이용하는지에 대한 내용을 보여주기 위한 클래스입니다.
 * 아래의 예제를 단위별로 실행 후 당위성을 생각해보세요.
 */
public class AAB_WhyMulti {

	public static void main(String[] args) {
		Thread countThread = new Thread() {
			@Override
			public void run() {
				for (int i = 10; i>0; i--) {
					System.out.println(i);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		};
		countThread.start();
		String input = JOptionPane.showInputDialog("아무 값이나 입력");
		System.out.println("입력한 값은 " + input + "입니다.");
		
		//아래는 main 쓰레드가 위의 입력을 기다리는 동안 블락킹 상태가 되어 아무것도 
		//못하는 것을 구현한 예제입니다.
		//이를 극복하기 위해 카운트 하는 쓰레드를 정의해서 각각 실행해봅니다. (위의 코드)
		
		
/*		for(int i = 10; i>0; i--) {
			System.out.println(i);
			
			//아래의 쓰레드 메서드는 주어진 millis 만큼 실행중인 쓰레드를
			//실행 대기 상태로 만들어주는 대표적인 메서드입니다.
			//알려진 예외가 throws 되었기에 반드시 핸들링하세요.
			try {
				Thread.sleep(1000);//Thread의 대표적인 메서드
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
*/		
	}

}
