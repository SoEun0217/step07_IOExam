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
			System.out.println("���� ���׿� �°� �Է��Ͽ� �ֽʽÿ�");
			System.out.println("================>������ �Է��� 1��");
			System.out.println("================>������ �˻��� 2��");
			System.out.println("================>������ ������ 3��");
			System.out.println("================>��й�ȣ������ 4��");
			System.out.println("================>���α׷������ 5��");
			System.out.println("�� �Է���  Enter�� ���� �ֽʽÿ�");
			System.out.print("�޴� ���� : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("�̸��� �Է��Ͽ� �ֽʽÿ�");
				System.out.print("�̸� : ");
				name = sc.next();
				System.out.println();
				System.out.println("�����Ը� �Է��Ͽ� �ֽʽÿ�");
				System.out.print("������ : ");
				weight = sc.nextInt();
				System.out.println();
				System.out.println("��й�ȣ�� �Է��Ͽ� �ֽʽÿ�");
				System.out.print("��й�ȣ  : ");
				pw = sc.nextInt();
				service.inputPerson(name, weight, pw);
				break;
			case 2:
				System.out.println("�˻��� �̸��� �Է��Ͽ� �ֽʽÿ�");
				System.out.print("�̸� : ");
				name=sc.next();
				System.out.println();
				System.out.print("��й�ȣ�� �Է��Ͽ� �ֽʽÿ�");
				System.out.println("��й�ȣ : ");
				pw=sc.nextInt();
				service.showPerson(name, pw);
				break;
			case 3:
				System.out.println("�˻��� �̸��� �Է��Ͽ� �ֽʽÿ�");
				System.out.print("�̸� : ");
				name=sc.next();
				System.out.println();
				System.out.print("��й�ȣ�� �Է��Ͽ� �ֽʽÿ�");
				System.out.println("��й�ȣ : ");
				pw=sc.nextInt();
				service.showPerson(name, pw);
				System.out.println("������ �����Ը� �Է��Ͽ� �ֽʽÿ�");
				System.out.print("������ ������ : ");
				weight=sc.nextInt();
				service.changeWeight(name, pw,weight);
				break;

			case 4:
				System.out.println("�˻��� �̸��� �Է��Ͽ� �ֽʽÿ�");
				System.out.print("�̸� : ");
				name=sc.next();
				System.out.println();
				System.out.print("��й�ȣ�� �Է��Ͽ� �ֽʽÿ�");
				System.out.println("��й�ȣ : ");
				pw=sc.nextInt();
				service.showPerson(name, pw);
				System.out.println("������ ��й�ȣ�� �Է��Ͽ� �ֽʽÿ�");
				System.out.println("****************************");
				int newPw=sc.nextInt();
				service.changePw(name,newPw);
				break;
				

			case 5:
				System.out.println("�ý����� ����Ǿ����ϴ�.");
				System.exit(0);

			}

		}
	}
}
