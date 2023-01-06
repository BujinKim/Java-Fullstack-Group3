package utilex;

import java.util.ArrayList;

/*
 * 이 클래스는 필요한 DTO 객체를 필요한 만큼 생성해서 List Type 으로 
 * DAO 에게 보내는 역할을 합니다.
 */
public class SendDTO {

	
	public static void main(String[] args) {
		
		
		StudentDTO dto1 = new StudentDTO();
		dto1.setNumber(1);
		dto1.setGroup(3);
		dto1.setName("김동환");
		dto1.setTel("010-1234-5678");
		
		StudentDTO dto2 = new StudentDTO();
		dto2.setNumber(2);
		dto2.setGroup(3);
		dto2.setName("김부진");
		dto2.setTel("010-6890-9345");
		
		StudentDTO dto3 = new StudentDTO();
		dto3.setNumber(3);
		dto3.setGroup(3);
		dto3.setName("김윤서");
		dto3.setTel("010-1111-1111");
		
		StudentDTO dto4 = new StudentDTO();
		dto4.setNumber(4);
		dto4.setGroup(3);
		dto4.setName("박동원");
		dto4.setTel("010-9876-5432");
		
		StudentDTO dto5 = new StudentDTO();
		dto5.setNumber(5);
		dto5.setGroup(3);
		dto5.setName("정주호");
		dto5.setTel("010-0000-0000");
		
		//Generic 을 이용해서 Element type 을 제한합니다.
		ArrayList<StudentDTO> members = new ArrayList<StudentDTO>();
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		members.add(dto4);
		members.add(dto5);
		
		//DAO 의 특정 메서드에 이 정보를 보냅니다.
		//메서드 이름은 putDtos(ArraysList<StudentDTO> list) 형태가 됩니다.
		StudentDAO dao = StudentDAO.getInstance();
		dao.putDtos(members);
		

		

		
		
		
		
		
		
		
		
		
		
		
	}

}
