package ex0819;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectLoadExam {
	public ObjectLoadExam() {
		//저장된 객체를 읽어오기
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/ex0819/save.txt"))){
			Student st1=(Student)ois.readObject();
			Student st2=(Student)ois.readObject();
			List<Student>list=(List<Student>)ois.readObject();
			System.out.println(st1);
			System.out.println(st2);
			System.out.println(list);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		new ObjectLoadExam();
	}

}
