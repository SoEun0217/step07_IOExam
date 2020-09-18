package ex0818;

import java.io.File;
import java.util.Date;

import javax.swing.JOptionPane;

public class FileExam {
	public FileExam() throws Exception {
		String filename = JOptionPane.showInputDialog("���� �̸���?");
		// System.out.println(filename);
		File file = new File(filename);
		if (file.exists()) {// �����Ѵٸ�
			System.out.println(filename + "�� �ֽ��ϴ�..");
			if(file.isFile()) {//�����ΰ��
				System.out.println(filename+"������ ����********");
				System.out.println("�б��� : "+file.canRead());
				System.out.println("������ : "+file.canWrite());
				System.out.println("������ : "+file.getAbsolutePath());
				System.out.println("�����̸� : "+file.getName());
				System.out.println("���Ͽ뷮(byte) : "+file.length());
				System.out.println("������������ : "+file.lastModified());
				
				System.out.println(new Date(file.lastModified()).toLocaleString());//�� ������-�޼ҵ尡 ���۵Ǿ���
				//���ϻ���
				file.delete();
				
			}else {//�����ΰ��
				System.out.println(filename+"������ ���� List********");
				String fname []=file.list();
				for(String name:fname) {
					System.out.println(name);
				}
			}
		} else {// �������� �ʴٸ�
			System.out.println(filename + "�� ������ �����ϰڽ��ϴ�..");
			//file.createNewFile();//������ �����Ѵ�
			file.mkdir();//������ �����Ѵ�

		}

	}

	public static void main(String[] args) throws Exception {
		new FileExam();
	}

}
