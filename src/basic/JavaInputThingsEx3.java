package basic;
import java.io.IOException;

import javax.swing.JOptionPane;

public class JavaInputThingsEx3 {
/*
 * 사용자 입력을 GUI로 처리하는걸 배워봅니다. 
 */
	public static void main(String[] args) throws IOException{
		//JOptionPane 객체의 메서드를 이용해서 적절한 input GUI 생성하기.
		String fir = JOptionPane.showInputDialog("첫 수를 입력하세요");
//		int p_fir = Integer.parseInt(fir);
		int p_fir =(int) Double.parseDouble(fir);
		
		int res = JOptionPane.showConfirmDialog(null, "확인할래?");
		System.out.println(res);
		//첫번째는 나를 연 부모창의 객체를 주는데, 지금은 무시하세요.
		//두번째 파라미터 값은 문자열로, 뿌려질 내용을 주시면 됩니다.
		JOptionPane.showMessageDialog(null, "이건 alert과 같습니다.");
		
		//다음과 같은 프로그램을 만들어보세요.
		/*
		 * 클래스 명은 Stu_Score1
		 * 1. 프로그램이 시작하면 사람의 이름을 입력 받도록 띄우세요 (콘솔 or GUI)
		 * 2. 입력이 된 후엔 "국어점수 입력 하세요." 라는 메세지를 띄우고 값을 입력받으세요.
		 * 3. 다음엔 "영어 점수 입력하세요." 후 2번과 동일
		 * 4. "수학 점수 입력하세요." 후 2번과 동일
		 * 5. 출력 결과는 아래와 같이
		 * 노재현님 !!! 당신의 성적은 다음과 같습니다.
		 * 총점 : ~ 점
		 * 평균 : ~ 점
		 * 
		 */
	}
	
}
