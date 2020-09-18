package ex0818;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputExam {
	public FileInputOutputExam() {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
		//byte ������ ���� �б�
		fis=new FileInputStream("src/ex0818/read.txt");
//		while(true) {
//			int i=fis.read();//1����Ʈ �б�
//			if(i==-1) break;
//			System.out.println(i+" = "+(char)i);
//		
//		}
		
//		int i=0;
//		while((i=fis.read())!=-1){
//			System.out.println(i+" = "+(Char)i);
//		}
		
		/////////////////////////////////////////////////
		int len=fis.available();//���� �� �ִ� byte���� ����
		System.out.println("fis.available() : "+len);
		byte b [] = new byte[len];
		fis.read(b);
		
		//byte�迭�� ->String���� ��ȯ
		String str=new String(b);
		System.out.println(str);
		
		//���� ����
		//fos=new FileOutputStream("src/ex0818/writer.txt");//�����
		fos=new FileOutputStream("src/ex0818/writer.txt",true);//�̾��
		fos.write(97);
		fos.write(100);
		fos.write(32);
		fos.write(13);
		fos.write(10);
		fos.write(100);
		
		//String�� byte �迭�� ��ȯ.
		String message="�������ô�~~break time!";
		fos.write(message.getBytes());
		

		System.out.println("****��*******");
		
		
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
