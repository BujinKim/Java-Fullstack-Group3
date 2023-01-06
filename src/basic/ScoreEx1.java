package basic;
import javax.swing.JOptionPane;

//do~while을 이용햐서 아래의 조건처럼 구현되도록 하세요.
/*
 * 클래스명은 ScoreEx1 으로 하시고
 * 
 * 학생의 성적을 입력받아 출력하는 프로그램입니다.
 * 1. 과목은 국, 영, 수
 * 2. 각 과목의 점수는 0~100 사이
 * 3. 만약 올바르지 않은 점수가 들어오면, 재입력 받도록 하세요. 즉, 다음 과목의 점수를 입력받는 로직으로 넘어가면 안됩니다.
 * 4. 모든 과목이 올바르게 입력되면 아래처럼 출력합니다.
 * 5. 총점 : 몇점, 평균 : 몇점, 학점 A,B,C or F
 * 6. 학점의 기준은 90이상은 A, 80~89는 B, 70~79는 C, 70미만은 F
 * 7. 참고로 위의 학점을 계산하려면 평점을 구해서 하는게 편할겁니다.
 * 8. 평점은 평균을 10으로 나눠서 계산하시면 됩니다.
 */

public class ScoreEx1 {

	public static void main(String[] args) {
		int kor; //변수 선언
		int eng; //변수 선언
		int math; //변수 선언
		
		do {
			kor = Integer.parseInt(JOptionPane.showInputDialog("국어 점수를 입력하세요."));
		}while(kor < 0 || kor > 100);
		do {
			eng = Integer.parseInt(JOptionPane.showInputDialog("영어 점수를 입력하세요."));
			}while(eng < 0 || eng > 100);
		do {
			math = Integer.parseInt(JOptionPane.showInputDialog("수학 점수를 입력하세요."));
		}while(math < 0 || math > 100);
		
		int sum = kor+eng+math;
		double avg = (double)sum/3;
		
		String gra;
		if (avg >= 90) {
			gra = "A";
		}else if(avg<90 && avg>=80) {
			gra = "B";
		}else if(avg<80 && avg>=70) {
			gra = "C";
		}else{
			gra = "F";
		}
		
/*		switch ((int)(avg/10){
 * 		case 10:
 * 		case 9:
 * 			grade = 'A';
 * 			break;
 * 		case 8:
 * 			grade = 'B';
 * 			break;
 * 		case 7:
 * 			grade = 'C';
 * 			break;
 */

		
		JOptionPane.showMessageDialog(null, "총점 : " + sum + "\n평균 : " + avg + "\n학점 : " + gra);
	}
		

}
