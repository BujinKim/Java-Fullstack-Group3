package ioEx;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputEx {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		BufferedOutputStream bos = null; //이건 예제 끝나면 여러분이 적용해보세요
		
		try {
			fos = new FileOutputStream("sample.dat");
			//dos 는 생성자 파라미터로 OutputStream을 받는다.
			dos = new DataOutputStream(fos);
			
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("simple.dat")));
			
			//아래에서 사용되는 메서드는 자바 데이터를 그대로 쓰기 때문에
			//쓰여진(새엉된) 파일의 크기를 확인 해보면 이해할 수 있다.
			
			dos.writeInt(10);
			dos.writeFloat(20.0F);
			dos.writeBoolean(true);
			dos.writeUTF("Hello");
			
			dos.close();
			
			bos.write(15);
			
			bos.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
