package Weight;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class WeightProgram {

	public static void main(String[] args) {
		String name;
		int weight;
		int pw;

		Service service=new Service();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("다음 사항에 맞게 입력하여 주십시오");
			System.out.println("================>몸무게 입력은 1번");
			System.out.println("================>몸무게 검색은 2번");
			System.out.println("================>몸무게 변경은 3번");
			System.out.println("================>비밀번호변경은 4번");
			System.out.println("================>프로그램종료는 5번");
			System.out.println("을 입력후  Enter을 눌러 주십시오");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("이름을 입력하여 주십시오");
				System.out.print("이름 : ");
				name = sc.next();
				System.out.println();
				System.out.println("몸무게를 입력하여 주십시오");
				System.out.print("몸무게 : ");
				weight = sc.nextInt();
				System.out.println();
				System.out.println("비밀번호를 입력하여 주십시오");
				System.out.print("비밀번호  : ");
				pw = sc.nextInt();
				service.inputPerson(name, weight, pw);
				break;
			case 2:
				System.out.println("검색할 이름을 입력하여 주십시오");
				System.out.print("이름 : ");
				name=sc.next();
				System.out.println();
				System.out.print("비밀번호를 입력하여 주십시오");
				System.out.println("비밀번호 : ");
				pw=sc.nextInt();
				service.showPerson(name, pw);
				break;
			case 3:
				System.out.println("검색할 이름을 입력하여 주십시오");
				System.out.print("이름 : ");
				name=sc.next();
				System.out.println();
				System.out.print("비밀번호를 입력하여 주십시오");
				System.out.println("비밀번호 : ");
				pw=sc.nextInt();
				service.showPerson(name, pw);
				System.out.println("변경할 몸무게를 입력하여 주십시오");
				System.out.print("변경할 몸무게 : ");
				weight=sc.nextInt();
				service.changeWeight(name, pw,weight);
				break;

			case 4:
				System.out.println("검색할 이름을 입력하여 주십시오");
				System.out.print("이름 : ");
				name=sc.next();
				System.out.println();
				System.out.print("비밀번호를 입력하여 주십시오");
				System.out.println("비밀번호 : ");
				pw=sc.nextInt();
				service.showPerson(name, pw);
				System.out.println("변경할 비밀번호를 입력하여 주십시오");
				System.out.println("****************************");
				int newPw=sc.nextInt();
				service.changePw(name,newPw);
				break;
				

			case 5:
				System.out.println("시스템이 종료되었습니다.");
				System.exit(0);

			}

		}
	}
}
