package ex0818;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class FileCopyExam {
	public FileCopyExam(String readFile, String writeFile) {
		FileInputStream bis = null;// Buffered를 이용한 byte 단위 읽기
		FileOutputStream bos = null;// Buffered를 이용한 byte 단위 쓰기
		try {
			bis =new FileInputStream(readFile);
			bos = new FileOutputStream(writeFile);
			int i=0;
			while((i=bis.read())!=-1) {
				bos.write(i);	
			}
			System.out.println("파일 복사 완료");
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {//finally는 try안에 있는 것이 아니라서 다시 try catch해줘야함
			try {
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		String readFile = JOptionPane.showInputDialog("복사할 파일명은?");
		String writeFile = JOptionPane.showInputDialog("저장할 파일명은?");
		
		long start=System.nanoTime();
		new FileCopyExam(readFile, writeFile);
		long end=System.nanoTime();
		System.out.println("총 걸린 : "+(end-start)+"ns");

	}

}
