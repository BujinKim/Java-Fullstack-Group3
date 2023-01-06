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
public class UseBArrStreamEx {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		byte[] temp = new byte[10];
		
		//Byte 배열에 쓰는 객체 선언..
		ByteArrayOutputStream output = null;
		ByteArrayInputStream input = null;
		
		input = new ByteArrayInputStream(inSrc);//Stream Open
		output = new ByteArrayOutputStream();//Stream Open
		
		//읽어온 데이터를 배열 temp에 담습니다.
		input.read(temp, 0, temp.length);//temp에 넣음, 0번부터, length(갯수)만큼 읽어라.
		output.write(temp, 5, 5);//temp[5]..(5번인덱스) 부터 5개의 데이터를 write 합니다.
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
		
		
	}

}
