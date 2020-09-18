package ex0818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyboardSaveExam {
    public KeyboardSaveExam() {
    	
    	BufferedReader br = null;
    	BufferedWriter bw =null; //����=����
    	try {
    		br = new BufferedReader(new InputStreamReader(System.in));
    		bw = new BufferedWriter(new FileWriter("src/ex0818/save.txt"));
    		while(true) {
    			System.out.print("�Է� : ");
    	        String data = br.readLine();
    	        if(data.equals("exit"))break;
    	        bw.write(data);
    	        bw.newLine();
    	        System.out.println("��� : " + data);
    		}
    	  
    		System.out.println("**���α׷� ����****");
    	}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			  br.close();
			  bw.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
    
	public static void main(String[] args)throws Exception {
		new KeyboardSaveExam();

	}

}







