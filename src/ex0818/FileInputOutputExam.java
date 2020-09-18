package ex0818;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputExam {
	public FileInputOutputExam() {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
		//byte 단위로 파일 읽기
		fis=new FileInputStream("src/ex0818/read.txt");
//		while(true) {
//			int i=fis.read();//1바이트 읽기
//			if(i==-1) break;
//			System.out.println(i+" = "+(char)i);
//		
//		}
		
//		int i=0;
//		while((i=fis.read())!=-1){
//			System.out.println(i+" = "+(Char)i);
//		}
		
		/////////////////////////////////////////////////
		int len=fis.available();//읽을 수 있는 byte수를 리턴
		System.out.println("fis.available() : "+len);
		byte b [] = new byte[len];
		fis.read(b);
		
		//byte배열을 ->String으로 변환
		String str=new String(b);
		System.out.println(str);
		
		//파일 저장
		//fos=new FileOutputStream("src/ex0818/writer.txt");//덮어쓰기
		fos=new FileOutputStream("src/ex0818/writer.txt",true);//이어쓰기
		fos.write(97);
		fos.write(100);
		fos.write(32);
		fos.write(13);
		fos.write(10);
		fos.write(100);
		
		//String을 byte 배열로 변환.
		String message="졸지맙시다~~break time!";
		fos.write(message.getBytes());
		

		System.out.println("****끝*******");
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(fis!=null)fis.close();
			if(fos!=null)fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new FileInputOutputExam();
	}

}
