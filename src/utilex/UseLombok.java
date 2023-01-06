package utilex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//https://projectlombok.org/download --> cmd (lombok 위치.. 나는 c드라이브에 설치함) java -jar lombok.jar
//--> 설치할 이클립스 선택 화면 --> 이클립스 리부팅 -->
//프로젝트 우클릭(myjava) --> new folder --> lib 생성 --> 롬복 붙이기
//--> 롬복 우클릭 --> build path --> add to build path

//@Data //이 어노테이션은 getter, setter, toString, hashCode, equals()를 자동으로
	  	//생성해줍니다.

/* outline에 항목이 제대로 안나올경우...
 * 
 * 1. 프로젝트 선택 후 우클릭 -> project build path ->
 * add external library -> 다운받아 놓은 lombok.jar를 선택해서 추가!
 * 2. 이클립스 메뉴에서 Help -> Install New Software ->
 * 검색창에서 https://projectlombok.org/p2 검색
 * 3. 검색하면 lombok이 뜬다!! lombok이 뜨면 선택하여 설치!
 * 4. 이클립스를 껐다가 다시 킨다.
 */

@Data
class Student{
	private String id;
	private String name;
	private int age;
}
/*
 * 롬복 Annotation 설정 정보
 */
//@NoArgsConstructor //기본 생성자를 포함시킨다.
//@AllArgsConstructor //필드 초기화 생성자를 포함시킨다.
//@RequiredArgsConstructor //기본적으로 생성자라 포함, 만약 final 또는 @NonNull
//						 //이 붙은 필드가 있다면 이 필드만 초기화하는 생성자 포함
//@Getter // Getter 포함
//@Setter // Setter 포함
//@EqualsAndHashCode //equals(), hashcode() 포함
//@ToString //toString()포함
//



@Data
@NoArgsConstructor
@AllArgsConstructor //이렇게 3개가 제일 많이 쓰임
class Student2{
	private String id;
	private String name;
	private int age;
}

@Data
class Student3{
	private final String id = "Boo";
	@NonNull private String name;
	private int age;
}

public class UseLombok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		Student3 stu3 = new Student3("Bu");
	}

}
