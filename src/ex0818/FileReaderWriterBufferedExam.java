package ex0818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterBufferedExam {
	public FileReaderWriterBufferedExam() {
		//���ڴ��� ���� �б�(Buffered�̿�)
		BufferedReader br=null;
		
		
		//���ڴ��� ���� ����=����(Buffered�̿�)
		BufferedWriter bw=null;
		try {
			br=new BufferedReader(new FileReader("src/ex0818/read.txt"));
//			int i=0;
//			while((i=br.read())!=-1) {//�� ���ھ� �б�
//				System.out.println(i+" = "+(char)i);
//			}
			
			//���� �б�
			String str=null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			///////////////////////
			//���Ͽ� �����ϱ�
			//bw=new BufferedWriter(new FileWriter("src/ex0818/write.txt"));
			bw=new BufferedWriter(new FileWriter("src/ex0818/write.txt",true));
			bw.write("������ ȭ����!!!\n");
			bw.write(65);
			bw.newLine();//�ٹٲ�
			bw.write("������ IO�����ϴ� ��");
			bw.flush();//���۸� �����
			
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
	}//������ ��

	public static void main(String[] args) {
		new FileReaderWriterBufferedExam();
	}

}
