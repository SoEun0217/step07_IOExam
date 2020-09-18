package ex0818;

import java.io.File;
import java.util.Date;

import javax.swing.JOptionPane;

public class FileExam {
	public FileExam() throws Exception {
		String filename = JOptionPane.showInputDialog("파일 이름은?");
		// System.out.println(filename);
		File file = new File(filename);
		if (file.exists()) {// 존재한다면
			System.out.println(filename + "은 있습니다..");
			if(file.isFile()) {//파일인경우
				System.out.println(filename+"파일의 정보********");
				System.out.println("읽기기능 : "+file.canRead());
				System.out.println("쓰기기능 : "+file.canWrite());
				System.out.println("절대경로 : "+file.getAbsolutePath());
				System.out.println("파일이름 : "+file.getName());
				System.out.println("파일용량(byte) : "+file.length());
				System.out.println("마지막수정일 : "+file.lastModified());
				
				System.out.println(new Date(file.lastModified()).toLocaleString());//줄 쳐진것-메소드가 업글되었다
				//파일삭제
				file.delete();
				
			}else {//폴더인경우
				System.out.println(filename+"폴더의 정보 List********");
				String fname []=file.list();
				for(String name:fname) {
					System.out.println(name);
				}
			}
		} else {// 존재하지 않다면
			System.out.println(filename + "은 없으니 생성하겠습니다..");
			//file.createNewFile();//파일을 생성한다
			file.mkdir();//폴더를 생성한다

		}

	}

	public static void main(String[] args) throws Exception {
		new FileExam();
	}

}
