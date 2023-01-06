package utilex;

import java.util.ArrayList;

/*
 * 이 클래스는 DB에 접근해서 데이터를 select(조회), insert(삽입), update(갱신), 
 * delete(삭제)를 하는 기능의 DAO 입니다.
 * 기본적으로 Singleton 방식으로 정의할 예정입니다.
 * 따라서 생성자는 private 으로 정의하고, static 메서드를 이용해서 
 * 외부 객체가 instance 를 사용할 수 있도록 정의합니다. ...꼭 기억하세요.
 */
public class StudentDAO {
	
	private static StudentDAO instance = new StudentDAO();
	
	private StudentDAO() {
	}
	
	//딱 하나의 인스턴스만 리턴하도록 메서드를 정의해서 이 메서드만을 통해, 사용토록 합니다.
	public static StudentDAO getInstance() {
		return instance;
	}
	
	//넘겨받은 DTO를 DB에 Insert 한다라고 가정하고 출력하도록 하는 메서드 정의합니다.
	public void putDtos(ArrayList<StudentDTO> list) { //호출
		for(int i = 0; i<list.size(); i++) {
			StudentDTO dt = list.get(i);
			System.out.println(dt.getNumber());
			System.out.println(dt.getGroup());
			System.out.println(dt.getName());
			System.out.println(dt.getTel());
		}
	}
	
}
