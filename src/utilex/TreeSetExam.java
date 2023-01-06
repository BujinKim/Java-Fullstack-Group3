package utilex;

import java.util.NavigableSet;
import java.util.TreeSet;

/*
 * 검색기능을 강화한 컬렉션...
 * 각 노드를 부모노드의 좌(작음)우(큼)에 배치를 시켜서 검색을 빠르게 하는 장점이있다.
 * 이 검색 기능을 이용하기 위해선 반드시 TreeSet 객체로 생성해야한다.
 * 이유는 검색 매서드는 TreeSet 에서만 정의했기 때문이다.
 */
public class TreeSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		//참고로 중복값은 여전히 저장이 안됩니다.
		scores.add((int)(Math.random() * 100) + 1);
		scores.add((int)(Math.random() * 100) + 1);
		scores.add((int)(Math.random() * 100) + 1);
		scores.add((int)(Math.random() * 100) + 1);
		scores.add((int)(Math.random() * 100) + 1);
		scores.add((int)(Math.random() * 100) + 1);
		scores.add((int)(Math.random() * 100) + 1);
		scores.add((int)(Math.random() * 100) + 1);
		
		//저장된 Element 출력하기
		//기본 정렬은 Ascending(오름차순) 으로 되어있음
		for(Integer i : scores) {
			System.out.println(i + " ");
		}
		System.out.println("-------------------------------------------");
		
		System.out.println("가장 낮은 점수 : " + scores.first());//첫번째 값 뽑아줌
		System.out.println("가장 높은 점수 : " + scores.last());//마지막 값 뽑아줌
		System.out.println("50점 바로 아래 : " + scores.lower(50));//바로 아래 하나만 뽑아줌
		System.out.println("50점 바로 위 : " + scores.higher(50));//바로 아래 하나만 뽑아줌
		System.out.println("50점이거나 50점 바로 아래 : " + scores.floor(50));//해당하는 값과 같거나 바로 아래 하나 뽑아줌
		System.out.println("50점이거나 50점 바로 위 : " + scores.ceiling(50));//해당하는 값과 같거나 바로 위 하나 뽑아줌
		
		System.out.println("-------------------------------------------");
		
		NavigableSet<Integer> descSco = scores.descendingSet();//얘는 내림차순
		for(int i : descSco) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------------");
		
		NavigableSet<Integer> rangeSet = descSco.tailSet(30, true); //해당하는 값 이하의 값을 뽑아줌
		for(int i : rangeSet) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------------");
		
//		scores.subSet(50, false, 80, false);
		System.out.println(scores.subSet(50, false, 80, false)); //false면 값 초과~미만, true면 값 이상~이하.
		
		
		
		
		
		
		
		
	}

}
