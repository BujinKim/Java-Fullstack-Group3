package basic;

public class TEset {
	public static void main(String[] args) {
	
		int[] multiArr[] = new int[3][4]; // 기본 배열 객체생성 // 아파트이름, 동, 가구로 생각하면 편함. 아파트이름 : multiArr / [3] 동 / [4] 가구
		
		String[][] myApt = new String[3][4]; 
		myApt[0][1] = "김부진";
		myApt[2][2] = "김나박";
		
		System.out.println(myApt[2][2]);
		
		
		// 값에 접근해 봅니다. 다중 for 구문을 이용합니다.
		for(int i = 0; i<multiArr.length; i++) {//Outer 배열 접근
			// 위의 i는 Outer의 index를 가리키기 때문에 내부적으로 배열이다.
			for (int j=0; j<multiArr[i].length; j++) {
				//값을 출력하는 코드를 정의해보세요.
				System.out.println(multiArr[i][j]);
			}
		}
		
		//생성식 2번입니다.
		String[] u_Apt[] = {{"김부진","이부진","김부각"},
				{"나얼","이수","김범수"}};
		// 안쪽의 {}갯수가 '아파트동'이 됩니다.
		
		//생성식 3번입니다.
		//잠깐 쉰 후 아래의 Data값 "Z","Y","V","W" 순서대로 변경 후 값을 출력하세요.
		
		String herApt[][] = new String[][] {{"A","B"},{"C","D"}};
		for(int i = 0; i<herApt.length; i++) {
			for(int j = 0; j<herApt[i].length; j++) {
				System.out.println(herApt[i][j]);
			}
		}
		
		//동적가변배열 : Outer의 크기는 생성시 초기화하고 Inner의 크기와 값은
		//동적으로 적용하는 배열입니다.
		
		char[] stars[] = new char[10][];
		for(int i = 0; i<stars.length; i++) {
			stars[i] = new char[i+1];//i만 넣으면 0가구이므로 +1을 넣음
			for(int j = 0; j<stars[i].length; j++) {
				stars[i][j] = '*';
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
	
	
	
	
}
