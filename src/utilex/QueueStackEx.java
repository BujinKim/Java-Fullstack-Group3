package utilex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Queue 구조 : FIFO(선입선출) 구조, 이를 구현한 클래스가 LinkedList 이기에
 * 위 클래스의 객체를 이용해서 아래의 메서드를 호출하면 자동으로 큐 구조로 이루어진다.
 * 
 * 대표적 메서드 몇가지..
 * 
 * element() : 삭제없이 저장된 요소 리턴. peek과 다른점은 큐가 비었을 때 예외를 발생시킨다.
 * peek()은 null만 리턴한다.
 * 
 * offer(Object obj) : 큐에 객체 저장.. 리턴은 true/false
 * peek() : 삭제없이 큐의 출구 바로전에 있는 요소에 Ref만 리턴한다. 비었다면 null 리턴
 * poll() : 큐에서 출구 바로전에 있는 요소 리턴 및 삭제
 * remove() : 큐에서 출구 바로전에 있는 요소 가져온다. 비었으면 예외 발생된다.
 */
public class QueueStackEx {
	
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>(); //큐는 선입선출
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("========== Queue 의 값 출력 ==========");
		
		//Collection 타입에 요소가 있는지 여부를 확인 하는 isEmpty() 를
		//호출하여 없을때까지 루프를 돌아 요소를 리턴받는다.
		while(!q.isEmpty()) {
//			System.out.println(q.peek()); //remove를 해주지 않으므로 무한루프가 돌아감.
			System.out.println(q.poll());
		}
		
		//Stack 자료구조 구현예..
		Stack <String> stack = new Stack<String>(); //스택은 후입선출
		stack.push("0");
		stack.push("1");
		stack.push("2");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
