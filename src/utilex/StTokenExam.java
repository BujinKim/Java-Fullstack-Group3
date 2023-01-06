package utilex;

import java.util.StringTokenizer;

public class StTokenExam {//StringTokenizer

	public static void main(String[] args) {
		String msg = "Hello,Java,World/Jsp";
		
		StringTokenizer st = new StringTokenizer(msg, ",/"); //기호에 따라 파라미터를 나눠줌
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s);
		}

	}

}
