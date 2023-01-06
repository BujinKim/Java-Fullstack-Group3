package utilex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * 순서를 유지하고, 중복을 허용하는 List type의 대표적 클래스인 ArrayList에 대해서 알아봄
 */
public class ArrayListEx1 {
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 --> " + list1);
		System.out.println("list2 --> " + list2);
		System.out.println();
	}
	public static void main(String[] args) {
		
		//다형성을 이용한 ArrayList 생성법
		//List list1  = new ArrayList();
		ArrayList list2  = new ArrayList(); //두 가지 방법 모두 사용 가능하다.
		//Collection list3 = new ArrayList();
		
//		list1 = list2;
//		list2 = (ArrayList)list1; // 하위타입이라 윗줄과 똑같이 못 쓰고 캐스팅을 해줘야됨
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(1);//중복허용
		list2.add(5);
		list2.add(2);
		list2.add("1");
		
		//list2 의 일정부분을 분리해서 새로운 ArrayList를 생성해봅니다.
		//ArrayList list3 = (ArrayList)list2.subList(1, 4);
		ArrayList list3 = new ArrayList(list2.subList(1,4));
		
		print(list2, list3);
		
		//add()를 이용해서 추가를 해보기
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");//3옆에 A라는 값을 더해줌
		
		print(list2,list3);
		
		list2.set(3, "KKK");//3옆이 KKK로 replace
		print(list2, list3);
		
		//retainAll --> 겹치는 부분만 남기고 삭제.. 교집합만 남는다고 생각하면 됨.
		list2.retainAll(list3);
		print(list2, list3);
		
		//정렬을 시켜볼게요.. 기본적으로 Collection 클래스에는
		//이런 Collection 하위 타입에 대한 지원 메서드가 많이 있습니다.
		//이걸 이용해서 정렬을 시켜봅니다.
		
		Collections.sort(list2);
		Collections.sort(list3);
		print(list2, list3);
		
		//특정 list가 값으로 존재하는지 알아봅니다.
		System.out.println(list2.containsAll(list3));
		
		//특정 객체가 존재하는지 알아보기
		System.out.println(list2.contains(2));
		System.out.println(list2.indexOf(2));
		
		//get(), remove()를 이용해서 Element 삭제하기..
		for(int i = list3.size()-1; i >= 0; i--) {
			if(list2.contains(list3.get(i))) {
				list2.remove(i);
			}
		}
		print(list2,list3);
		
		
		
		
	}

}
