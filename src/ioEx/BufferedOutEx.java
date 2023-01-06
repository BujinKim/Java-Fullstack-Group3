package ioEx;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 * FilterStream 인 BurfferedOutput 의 특징을 확인해본다.
 */
public class BufferedOutEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			
			//버퍼의 크기를 5로 지정한 스트림 생성
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			//파일에 데이터 쓰기..
			for(int i = '1'; i<='9'; i++) {//버퍼 사이즈가 5이기 때문에 123.txt파일에는 12345까지만 찍힘
				bos.write(i);
			}
			
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
