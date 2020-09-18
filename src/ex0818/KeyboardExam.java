package ex0818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class KeyboardExam {
	public KeyboardExam() throws Exception {
		// 키보드 입력
//		InputStream is=System.in;
//		int i=is.read();//한바이트 읽기
//		System.out.println(i+" = "+(char)i);

		// byte 단위 처리를 문자 단위로 변경
//		InputStreamReader isr=new InputStreamReader(System.in);
//		int i=isr.read();
//		System.out.println(i+" = "+(char)i);

		// Buffered를 이용해서 한줄읽기
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0818/message.txt"));
			while (true) {
			System.out.print("입력 : ");
			String data = br.readLine();// 엔터가 readLine의 끝
		
			if (data.equals("exit"))break;
			bw.write(data);
			bw.newLine();
			System.out.println("출력: " + data);
			
		}
			System.out.println("시스템이 종료되었습니다.");
			bw.close();

	}

	public static void main(String[] args) throws Exception {
		new KeyboardExam();
	}

}
