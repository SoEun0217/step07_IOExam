package ex0819;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectSaveExam {
	public ObjectSaveExam() {
		//����ȭ �ؼ� ������ ��ü�� �غ�
		Student st1=new Student("����",24,"����");
		Student st2=new Student("����",25,"�Ǳ�");
		
		List<Student>list=new ArrayList<Student>();
		list.add(new Student("ȿ��",40,"���ֵ�"));
		list.add(new Student("�缮",50,"����"));
		list.add(new Student("��",30,"������"));
		
		// �����ϱ�
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/ex0819/save.txt"))) {
			oos.writeObject(st1);//object�� �μ��� ����.
			oos.writeObject(st2);
			oos.writeObject(list);
			
			System.out.println("** ���� ���� �Ϸ� **");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ObjectSaveExam();
	}

}
