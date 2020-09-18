package Weight;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Service{
	Map<String, Person>map=new HashMap<String,Person>();
	private static Service service= new Service();
	
	public static Service getInstance() {
		return service;
	}
	
	public void inputPerson(String name,int weight,int pw) {
		map.put(name,new Person(weight,pw));
		try (FileWriter fos=new FileWriter("src/Weight/"+name+".txt")){
			fos.write(weight+" : "+pw);
			fos.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean realPerson(String name, int pw) {
		if(map.containsKey(name)&&map.get(name).getPw()==pw) {
			return true;
		}return false;
	}
	
	public void showPerson(String name,int pw) {
		if(realPerson(name, pw)==true) {
			try(FileInputStream fis=new FileInputStream("src/Weight/"+name+".txt")){
				byte b [] = new byte[fis.available()];
				fis.read(b);
				//byte�迭�� ->String���� ��ȯ
				String str =new String(b);
				String [] data=str.split(":");
				System.out.println("****************************");
				System.out.println(name+"���� �����Դ� "+data[0]+"kg �Դϴ�.");
				System.out.println("****************************");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("�������� �ʴ� �̸��̰ų�, ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void changeWeight(String name,int pw,int weight) {
		
		map.get(name).setWeight(weight);
		try (FileWriter fos=new FileWriter("src/Weight/"+name+".txt")){
			fos.write(weight+" : "+pw);
			fos.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void changePw(String name, int pw) {
		map.get(name).setPw(pw);
		try (FileWriter fos=new FileWriter("src/Weight/"+name+".txt")){
			fos.write(map.get(name).getWeight()+" : "+pw);
			fos.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}


	
	
}
