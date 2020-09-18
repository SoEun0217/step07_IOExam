package ex0818;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class FileCopyBufferdExam {
    public FileCopyBufferdExam(String readFile, String writeFile) {
    	BufferedInputStream bis=null;//buffered를 이용한 byte단위 읽기
    	BufferedOutputStream bos =null;//buffered를 이용한 byte단위 쓰기
    	try {
    		bis = new BufferedInputStream(new FileInputStream(readFile));
    		bos = new BufferedOutputStream(new FileOutputStream(writeFile));
    		int i=0;
    		while((i=bis.read())!=-1) {
    			bos.write(i);
    		}
    		
    		System.out.println("파일 복사완료!!!");
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		try {
	    		if(bis!=null)bis.close();
	    		if(bos!=null)bos.close();
    		}catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	
    	
    }
	public static void main(String[] args) {
		String readFile = JOptionPane.showInputDialog("복사할 파일명은?");
		String writeFile = JOptionPane.showInputDialog("저장할 파일명은?");
		
	     long start = System.nanoTime();
		 new FileCopyBufferdExam(readFile ,writeFile);
		 long end = System.nanoTime();
		 
		 System.out.println("총 걸린  : " + (end-start) +"ns");

	}

}








