package langEx;
//api를 알아봅시다.
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.SortedMap;

import javax.swing.JOptionPane;

public class StringExam {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		//""을 이용해서 생성된 문자열은 모두 String pool 에 저장되고
		//새로운 리터럴을 생성할 시엔, 먼저 pool 내에 같은 값이 있는 객체가 존재하는지
		//만약 있다면 해당 Ref를 리턴합니다. 이 조건은 오직 ""(리터럴) String 객체에만
		//적용됩니다.
		
		String a = "abc";
		String b = "abC";//string pool에 만들어서 a == b
		
		String c = new String();
		String d = new String(b);//생성자를 이용해 heap에 새로운 instance가 생성됐으므로 b != d
		
		if (d == b) {
			System.out.println("같은 객체니 값도 당연히 같음");
		}else {
			System.out.println("다른 객체이고, 값이 같은지는 모르겠음.");
		}
		//String 의 override 된 equals 사용. 두 문자열 객체가 같은 값이면
		//true or false 리턴.
		if (d.equalsIgnoreCase(b)) {//equalsIgnoreaCase 는 대소문자를 고려하지 않고 다른 문자열과 비교함.
			System.out.println("다른 문자열 객체지만 대소문자 구분없이 값은 같음");
		}else {
			System.out.println("다른 문자열 객체이고 값도 다름");
		}
		
		byte[] bArr = {65,66,67,68,69};
		bArr = "안녕하세요.".getBytes();
		//앞으로 배열내부의 값을 문자열로 확인하고 싶으면 아래의 API를 이용하세요.
		System.out.println(Arrays.toString(bArr));
		String bStr = new String(bArr,0,6);
		System.out.println(bStr);
		
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.availableCharsets()); // UTF-8이 나옴
		
		char[] chArr = {'오','늘',' ','하','루',' ','고','생','함'};
		String chStr = new String(chArr);
		System.out.println(chStr);
		
		char[] uniCodes = chStr.toCharArray();
		int[] converUni = new int[uniCodes.length];
		for(int i = 0; i<uniCodes.length; i++) {
			converUni[i] = uniCodes[i];
		}
		System.out.println(Arrays.toString(converUni));
		
		String uniStr = new String(converUni,0,converUni.length);
		System.out.println(uniStr);
		
		/*
		 * 아래의 퀴즈를 풀어보세요.
		 * 
		 * String myMsg = "오늘의 자바는 문자열 객체까지 했습니다"
		 * 
		 * 위 myMsg 를 byte 배열로 리턴하는 메서드가 있습니다. 리턴 타입이 byte[] 임
		 * 
		 * 얘를 호출해서 바이트 배열로 변환 후, 배열의 모든 값을 다시 새로운 
		 * 문자열로 생성하는데, 단, 문자열의 캐릭터셋을 ISO-8859-1 로 되어진 애로 변환해서
		 * 출력해보세요.
		 */
		
		//내가 푼 풀이법
//		byte[] myMsg = {65,66,67,68,69};
////		myMsg = "오늘의 자바는 문자열 객체까지 했습니다.".getBytes("ISO-8859-1");
//		myMsg = "오늘의 자바는 문자열 객체까지 했습니다.".getBytes();
//		System.out.println(Arrays.toString(myMsg));
//		String myMsg1 = new String(myMsg,0,myMsg.length,"ISO-8859-1");
//		System.out.println(myMsg1);
		
		//선생님 정답
		byte[] bt = "오늘의 자바는 문자열 객체까지 했습니다.".getBytes();
//		String btStr = new String(bt,0,bt.length,"ISO-8859-1");
		String btStr = new String(bt,0,bt.length);
		System.out.println(btStr);
		
		
		System.out.println(btStr.length()); //btStr의 length를 구함
		//btStr의 전체를 돌면서 문자(char)를 리턴받는다.
		
		for(int i = 0; i<btStr.length(); i++) {
			char ch = btStr.charAt(i);
			System.out.print(ch);
		}
		
		//System.out.println(btStr.charAt(btStr.length()));
		System.out.println();
		System.out.println(Integer.toHexString(btStr.codePointAt(0)));//유니코드 받기
		
		char uniCar = '\uc624';
		System.out.println(uniCar);//위(hexString 코드 있는 곳)의 유니코드를 가져와 문자 생성
		
		
		String msg = "오늘";
//		msg = msg.concat(" 하루도 즐겁게");//concat은 문자열 +의 역할을 함
		String msg2 = msg.concat(" 하루도 즐겁게");//concat은 문자열 +의 역할을 함
		System.out.println(msg);
		
		
		
		System.out.println(msg2.contains("즐겁게")); //msg2라는 변수에 "즐겁게"라는 문자열이 들어갔는지 찾아줌. (boolean으로 리턴)
		
		//hello 값을 갖는 char 배열을 파라미터에 완성시켜보세요.
		String hi = String.copyValueOf(new char[]{'h','e','l','l','o'}); //static이라 객체가 아닌 class를 호출
		
		
		//문자열의 끝과 처음 판별하기 endWith / startsWith
		String email = "ntjsdlf0217@naver.com";
		if(email.endsWith(".com") || email.startsWith("tjsdlf")) { // 둘다 true이므로 println실행됨.
			System.out.println("올바른 서버명입니다.");
		}
		
		
		//format() : static 이면서 문자열, 수치형 등을 모두 특정 형식대로
		//포맷하여 설정 할 수 있습니다.
		/*
		 * 아래는 간단한 문법입니다.
		 * 
		 * %d(10진수 형식),%s(문자열 형성), %f(실수형), Locale(날짜 등의 형식)
		 * 기본적으로 포맷을 적용하면 우측 정렬이 적용됩니다. 만약 -표시를 하게 되면
		 * 왼쪽 정렬을 하게 됩니다.
		 */
		
		int i = 23;
		
		System.out.println(String.format("%d", i)); //23 출력
		System.out.println(String.format("%d_", i)); // 언더바가 parsing되지 않음
		System.out.println(String.format("%5d_", i)); // "%5d_"는 자릿수표현. 즉, 2자리 숫자에 5자리숫자를 넣으라고 명령해 왼쪽에 공백이 생김
		System.out.println(String.format("%-5d_", i)); // left 정렬
		System.out.println(String.format("%05d_", i)); // 5자리수중 공백을 0으로 채움
		
		
		//십진수 정수의 큰 값을 특정 포맷대로 출력시켜보기..
		int i2 = 123456789;
		//%뒤에 , 를 두면 자동으로 3자리 마다 , 를 넣어줍니다.
		System.out.println(String.format("%,d", i2)); //123,456,789가 출력됨.
		System.out.println(String.format("%,015d", i2)); // , 도 자릿수에 포함되어 0이 6개가 아닌 4개가 출력
		
		//문자열 표기하기..
		String str = "hello";
		System.out.println(String.format("%-12.2s_", str)); // .을 쓰게 되면 앞의 2자리만 출력
		
		
		//실수형 표기하기..
		double n = 123.45678;
		System.out.println(String.format("%f", 3.4));//3.400000
		System.out.println(String.format("%f", n));//123.456780
		System.out.println(String.format("%.2f", n));//소숫점 n자리에서 반올림된 값 출력
		
		
		System.out.println(email); // 하단 indexOf에 사용될 것 상단에 있는 email사용...
		//이메일에 @ 여부 판단하기
//		int idx = email.indexOf('@');//10번 index에 있음
//		int idx = email.indexOf('!');//!라는 문자는 email안에 없기 때문에 -1이 출력
		int idx = email.indexOf('n',email.indexOf('n') + 1); // 1번 인덱스 이후의 n의 인덱스값을 찾으라는 명령어
		System.out.println(idx);
		
		//isEmpty.. 문자열의 길이가 0인 경우에, true를 리턴합니다.
		if("".isEmpty()) {
			System.out.println("문자열의 값이 없습니다.");
		}
		
		//delimiter 는 문자열의 구분자를 뜻합니다. ",/" ... String.join을 사용함
		String deliStr = "HelloMyFriend";
		deliStr = String.join(":", "Hello","Java","World");// :(콜론)을 기준으로 후술된 문자열들이 합쳐짐
		System.out.println(deliStr);
		
		System.out.println(email.lastIndexOf('.')); //lastIndexOf..뒤에서 부터 찾음. 먼저 찾은 곳을 출력
//		
//		email = email.replace('@', 'a'); // replace.. 한 문자(Char)를 다른 문자로 대체 
//		System.out.println(email);
//		
		//여러분의 이메일 서버명, green.com으로 변강해보세요
		//substring과 indexOf는 자주 같이 쓰인다.
		String server = email.substring(email.indexOf('@') + 1);//@ 다음부터 분리(server값)
		String id = email.substring(0, email.indexOf('@') + 1);//@까지 분리 (id값)
		String newServer = server.replace(server, "green.com");//naver.com 을 green.com으로 바꿈
		
		String newEmail = id.concat(newServer); // concat으로 id 뒤에 newServer를 붙임
		System.out.println(newEmail);
		
		//trim.. 양쪽 공백을 없애줌
		String wSpace = "  h  ";
		System.out.println(wSpace.trim().length()); // 공백까지 포함하면 length는 5이지만 trim으로 공백을 지워서 1이 출력됨.
		
		//valueOf.. 리턴타입은 객체 (parseInt와 다름)
		int aa = 11;
		
		String aaStr = String.valueOf(aa);
		System.out.println(aaStr + 1);
		
		/*
		 * 사용자의 이메일을 입력받아서 아래의 조건에 맞게 출력해보세요.
		 * 1. ID(Email) 입력하세요.
		 * 2. 입력 후 빈 문자열인지 검사하세요.
		 * 3. 빈 문자열이 아닌 경우, 아래처럼 검사하세요.
		 * 3-1. ID와 서버로 분리하여 ID를 검증(isValidate()) 하시는데 
		 *      길이는 8~12자 사이어야 하고, 반드시 첫자는 대문자여야 합니다.
		 * 		또한 ID중에는 반드시 숫자가 하나 이상이어야 합니다.
		 * 		만약 위의 조건이 틀린 경우, 뭐가 틀렸는지 메세지를 띄우고, 모두 정상이면
		 * 		사용자에게 "로그인 되었습니다." 라고 출력시키세요.
		 * 
		 * 
		 */
//-------------------------------내가 한거 --------------------------------------------------------
		
		String inputEmail = JOptionPane.showInputDialog("ID 또는 Email을 입력하세요.");
		
		if (inputEmail.isEmpty()) { // 공백문자열인지 검사.
			JOptionPane.showMessageDialog(null, "공백 문자열입니다.\nID 또는 Email을 올바르게 입력해주세요.");
			return;
		}else {
			JOptionPane.showMessageDialog(null, "ID 또는 Email을 검사합니다.");
		}
		
		String userId = inputEmail.substring(email.indexOf('@') + 1); // ID 분리
		String userServer = inputEmail.substring(0,email.indexOf('@') + 1); // Server 분리
		char charId = inputEmail.charAt(0);
//		char charId2 = inputEmail.charAt(0);

		
		
		if (userId.length() < 8 || userId.length() > 12) {
			JOptionPane.showMessageDialog(null, "ID 또는 Email은 8자~12자 사이로 입력해주세요.");
		}else if (Character.isUpperCase(charId) != true){
			JOptionPane.showMessageDialog(null, "ID 또는 Email의 첫 글자는 대문자여야 합니다.");
		}else if (!(inputEmail.matches(".*[0-9].*"))) {
			JOptionPane.showMessageDialog(null, "숫자를 포함하여 ID 또는 Email을 만들어주세요.");
		}else {
//			String realServer = userServer.replace(userId, userServer);
//			String realEmail = userId.concat(userServer);
			JOptionPane.showMessageDialog(null, "안녕하세요, " + inputEmail +"님.\n정상적으로 로그인 되었습니다.");
		}
		
//-----------------------------------------------------------------------------------------------		
		
		

		

		
		
		
		
		
	}
	
}
