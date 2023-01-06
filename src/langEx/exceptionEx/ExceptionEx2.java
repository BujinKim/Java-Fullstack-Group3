package langEx.exceptionEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx2 {
	
	static void c() /*throws FileNotFoundException, IOException*/ {//IOException 은 Exception의 자식으로 상속받을수 있으므로 생략해도됨 단, 하위 메소드들도 Exception으로 통일해야됨!
		
		
		FileInputStream fis = null; //디폴트로 초기화.. 하단 try단에 블록변수가 선언되었으므로 초기화해야 하단 if에 컴파일에러가 사라짐
		File f = null; //위와 동일
		f=new File("test2.txt");
		
		try {
			fis = new FileInputStream(f);//파일을 불러오는 곳이라 예외가 뜬다면 여기서 뜸
			int data;
			
			while((data = fis.read()) != -1){
				System.out.print((char)data);
			}
			
		}catch(Exception io) {
			System.out.println("파일을 찾을수 없음.." + io.getMessage());
			io.printStackTrace();//콜 스택 찾아주는 코드
			
//		}catch(IOException fne) {//큰타입으로 잡았기 때문에 자식이 할 수 있는게 없으므로 큰타입이 밑으로, 작은타입이 위로
//			
		}finally {
			//이 블럭은 예외 발생 여부와 상관없이 무조건 수행되는 블락입니다.
			if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
	}
	static void b() /*throws FileNotFoundException, Exception*/ { // FileNotFoundException은 IOException의 자식이므로 부모만 써도 상속받아서 생략해도 됨
		c();
	}
	static void a() /*throws Exception*/{
		b();
	}
	
	public static void main(String[] args) /*throws Exception*/ {
		//생성한 파일에 접근, 파일의 내용을 읽어오는 API 사용함.
		a();

		}
		
	
	}


