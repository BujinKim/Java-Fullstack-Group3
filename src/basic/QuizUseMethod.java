package basic;
import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class QuizUseMethod {
	private static int max(int i , int j) {
		if (i > j) {
			return i;
		}else {
			return j;
		}
	}
	
	static int sum2Value() {
		int sumA = Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자를 입력하세요"));
		int sumB = Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자를 입력하세요"));
		int temp;
		
		if(sumA >= sumB) {
			temp = sumA;
			sumA = sumB;
			sumB = temp;
		}
		
		int sum = 0;
		for (int i = sumA; i<sumB; i++) {
			sum += i;			
		} 
		System.out.println(sum);
		return sum;
	}
	
	static String printNumSequence(int firstSu, int secSu, int thirdSu) {
		
		int temp;
		if(secSu >= firstSu && secSu >= thirdSu) {
			temp = firstSu;
			firstSu = secSu;
			secSu = temp;
			
		}else if (thirdSu >= firstSu && thirdSu >= secSu) {
			temp = firstSu;
			firstSu = thirdSu;
			thirdSu = temp;
			
		}
		if(thirdSu >= secSu) {
			temp = secSu;
			secSu = thirdSu;
			thirdSu = temp;
		}
		//System.out.println();
			
		return "" + firstSu + " >=" + secSu + " >=" + thirdSu;
	}

	
	public static void main(String[] args) {
		/*
		 * 아래 정의된 내용대로 수행되도록 메서드를 정의하여
		 * 코드를 완성하세요.
		 * 
		 */
		
		int x = 0;
		
		while(true) {
			String choice = JOptionPane.showInputDialog
					(null, "1.최대값 2. 사이합 3. 수나열 4. 종료");
			x = Integer.parseInt(choice);
			
			if(x == 1) {
				//결과를 return해주는 메서드를 호출하여 값을 출력할 수 있도록
				//아래의 메서드를 정의하세요.
				int res = max(11,10);
				System.out.println("두 수중 최대수는 : " + res);
			}else if (x == 2) {
				sum2Value();// 정의하세요..
			}else if (x == 3) {
				System.out.println("첫번째 수 = ");
				int firstSu = Integer.parseInt(
						JOptionPane.showInputDialog("첫번째 수 입력"));
				int SecSu = Integer.parseInt(
						JOptionPane.showInputDialog("두번째 수 입력"));
				int thirdSu = Integer.parseInt(
						JOptionPane.showInputDialog("세번재 수 입력"));
				
				//아래의 메서드 정의하세요.
				String str = printNumSequence(firstSu, SecSu, thirdSu);
				
				JOptionPane.showMessageDialog(null, "큰 순으로 나열은 \n" + str);
				
			}else if(x == 4) {
				break;
			}else {
				JOptionPane.showConfirmDialog(null, "잘못 입력했습니다.");
			}
			System.out.println();
		}

	}





	
	
	
}
