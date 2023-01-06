package ioEx;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 * 이 클래스 에서는 byte[] 를 이용해서 JVM 메모리(가상 메모리)에
 * 데이터를 쓰고 읽느 예제입니다.
 * byte[] 를 쓸 때는 문제가 없지만, 읽을 때는 새롭게 읽은 갯수를 리턴하는것에 대해
 * 주의하세요.
 */
public class UseBArrStreamEx2 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		byte[] temp = new byte[4];
		
		//Byte 배열에 쓰는 객체 선언..
		ByteArrayOutputStream output = null;
		ByteArrayInputStream input = null;
		
		input = new ByteArrayInputStream(inSrc);//Stream Open
		output = new ByteArrayOutputStream();//Stream Open
		
		try {
			while(true) {
				int count = input.read(temp);
				System.out.println("읽은 갯수 : " + count);
				
				if(count == -1)//더이상 읽을 것이 없으면 -1을 return한다.
					break;
				
				output.write(temp);
				System.out.println("temp : " + Arrays.toString(temp));
			}
		}catch (Exception e) {
			// TODO: handle exception
		}

		outSrc = output.toByteArray();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
		
		
	}

}
