package ex0818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class KeyboardExam {
	public KeyboardExam() throws Exception {
		// Ű���� �Է�
//		InputStream is=System.in;
//		int i=is.read();//�ѹ���Ʈ �б�
//		System.out.println(i+" = "+(char)i);

		// byte ���� ó���� ���� ������ ����
//		InputStreamReader isr=new InputStreamReader(System.in);
//		int i=isr.read();
//		System.out.println(i+" = "+(char)i);

		// Buffered�� �̿��ؼ� �����б�
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0818/message.txt"));
			while (true) {
			System.out.print("�Է� : ");
			String data = br.readLine();// ���Ͱ� readLine�� ��
		
			if (data.equals("exit"))break;
			bw.write(data);
			bw.newLine();
			System.out.println("���: " + data);
			
		}
			System.out.println("�ý����� ����Ǿ����ϴ�.");
			bw.close();

	}

	public static void main(String[] args) throws Exception {
		new KeyboardExam();
	}

}
