package ioEx;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInput3 {

	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("simple.dat");
			dis = new DataInputStream(fis);
			
			//파일에 있는 int를 읽어서 int로 리턴하는 readInt()를 사용합니다.
			while (true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (EOFException e) {
			// DataInput 의 readInt() 가 더 읽을게 없을때 이 예외가 발생함.
			// 따라서 여기에 적절히 예외 처리를 해주면 됨..
			System.out.println("점수의 총 합 : " + sum);
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(dis !=null) {
				try {
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
