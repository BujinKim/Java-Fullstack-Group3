package basic;
import javax.swing.JOptionPane;

public class Stu_Score1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름을 입력해주세요.");
		System.out.println(name);
		double kor = Double.parseDouble(JOptionPane.showInputDialog("국어 점수를 입력하세요"));
		double eng = Double.parseDouble(JOptionPane.showInputDialog("영어 점수를 입력하세요"));
		double math = Double.parseDouble(JOptionPane.showInputDialog("수학 점수를 입력하세요"));
		
//		double p_kor = Double.parseDouble(kor);
//		double p_eng = Double.parseDouble(eng);
//		double p_math = Double.parseDouble(math);
		
		double res = kor + eng + math;
		double avg = res/3;
		
		System.out.println(name +"님! 당신의 성적은 다음과 같습니다. \n총점: " + res + "\n평균: " + avg);
		JOptionPane.showMessageDialog(null, name +"님! 당신의 성적은 다음과 같습니다. \n총점: " + res + "\n평균: " + avg);
	}

}
