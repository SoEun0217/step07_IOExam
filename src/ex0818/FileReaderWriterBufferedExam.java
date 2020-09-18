package ex0818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterBufferedExam {
	public FileReaderWriterBufferedExam() {
		//문자단위 파일 읽기(Buffered이용)
		BufferedReader br=null;
		
		
		//문자단위 파일 저장=쓰기(Buffered이용)
		BufferedWriter bw=null;
		try {
			br=new BufferedReader(new FileReader("src/ex0818/read.txt"));
//			int i=0;
//			while((i=br.read())!=-1) {//한 문자씩 읽기
//				System.out.println(i+" = "+(char)i);
//			}
			
			//한줄 읽기
			String str=null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			///////////////////////
			//파일에 저장하기
			//bw=new BufferedWriter(new FileWriter("src/ex0818/write.txt"));
			bw=new BufferedWriter(new FileWriter("src/ex0818/write.txt",true));
			bw.write("열심히 화이팅!!!\n");
			bw.write(65);
			bw.newLine();//줄바꿈
			bw.write("오늘은 IO공부하는 날");
			bw.flush();//버퍼를 비워라
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(br!=null)br.close();
			if(bw!=null)bw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}//생성자 끝

	public static void main(String[] args) {
		new FileReaderWriterBufferedExam();
	}

}
