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
				//byte배열을 ->String으로 변환
				String str =new String(b);
				String [] data=str.split(":");
				System.out.println("****************************");
				System.out.println(name+"님의 몸무게는 "+data[0]+"kg 입니다.");
				System.out.println("****************************");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("존재하지 않는 이름이거나, 비밀번호가 틀렸습니다.");
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
