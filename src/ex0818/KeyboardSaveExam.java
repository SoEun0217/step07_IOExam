package ex0818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyboardSaveExam {
    public KeyboardSaveExam() {
    	
    	BufferedReader br = null;
    	BufferedWriter bw =null; //저장=쓰기
    	try {
    		br = new BufferedReader(new InputStreamReader(System.in));
    		bw = new BufferedWriter(new FileWriter("src/ex0818/save.txt"));
    		while(true) {
    			System.out.print("입력 : ");
    	        String data = br.readLine();
    	        if(data.equals("exit"))break;
    	        bw.write(data);
    	        bw.newLine();
    	        System.out.println("출력 : " + data);
    		}
    	  
    		System.out.println("**프로그램 종료****");
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







