package work;

import java.util.InputMismatchException;
import java.util.Scanner;
/* written by �嵿ȣ */
public class Work4New {
	/* ü���� ���ϱ� */
	// field
	static String gender;
	static int age;
	static double height;
	static double weight;
	final static double maleSTD = 1.10;
	final static double femaleSTD = 1.07;
	final static int COMSTD = 128, COMSTD2 = 100;
	static boolean run = true;

	// main()
	public static void main(String[] args) {
		while (run) {
			printMenu();
			inputInfo();
			double leanBodyMass = getLeanBodyMass(gender, weight, height);
			double bodyFatMass = getBodyFatMass(leanBodyMass);
			double leanBodyRatio = getLeanBodyRatio(leanBodyMass);
			double bodyFatRatio = getBodyFatRatio(bodyFatMass);
			String result = getResult(gender, bodyFatRatio);
			printResult(leanBodyMass, leanBodyRatio, bodyFatMass, bodyFatRatio, result);
			isRun();
		}
		System.out.println("���α׷� ����");
	}

	// �޴�
	static void printMenu() {
		System.out.println("=======================================");
		System.out.println("��Ȯ�� ����� ���Ͽ� �Ʒ� ������ �Է� �ٶ��ϴ�.");
		System.out.println("=======================================");
	}

	// �Է�
	static void inputInfo() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("���� (����(M) / ����(F) �Է� ) > ");
			gender = scanner.next();
			System.out.print("���� (���� : 10 ~ 39 �Է� ) > ");
			age = scanner.nextInt();
			System.out.print("Ű �Է� ( ���� : cm ) > ");
			height = scanner.nextDouble();
			System.out.print("������ �Է� ( ���� : kg ) > ");
			weight = scanner.nextDouble();
		} catch (InputMismatchException ime) {
			System.out.println("�ùٸ� ���� �Է����ּ���!");
		}
	}

	// 1. �����淮
	static double getLeanBodyMass(String gender, double weight, double height) {
		double leanBodyMass = 0.0;
		switch (gender) {
		case "M":
			leanBodyMass = (maleSTD * weight) - (COMSTD * ((weight * weight) / (height * height)));
			break;
		case "F":
			leanBodyMass = (femaleSTD * weight) - (COMSTD * ((weight * weight) / (height * height)));
			break;
		}
		return leanBodyMass;
	}

	// 2. ü���淮
	static double getBodyFatMass(double leanBodyMass) {
		double bodyFatMass = weight - leanBodyMass;
		return bodyFatMass;
	}

	// 2-1. �������= (�����淮 * 100) / ü��
	static double getLeanBodyRatio(double leanBodyMass) {
		double leanBodyRatio = (leanBodyMass * COMSTD2) / weight;
		return leanBodyRatio;
	}

	// 3. ü�����= (ü���淮 * 100) / ü��
	static double getBodyFatRatio(double bodyFatMass) {
		double bodyFatRatio = (bodyFatMass * COMSTD2) / weight;
		return bodyFatRatio;
	}

	// 4. �񸸵� ���
	static String getResult(String gender, double bodyFatRatio) {
		String result = "";
		switch (gender) {
		case "M":
			if (bodyFatRatio < 12)
				result = "������";
			else if (bodyFatRatio <= 17)
				result = "ǥ��";
			else if (bodyFatRatio <= 22)
				result = "��ü��";
			else if (bodyFatRatio <= 27)
				result = "��";
			else
				result = "����";
			break;
		case "F":
			if (bodyFatRatio < 22)
				result = "������";
			else if (bodyFatRatio <= 27)
				result = "ǥ��";
			else if (bodyFatRatio <= 35)
				result = "��ü��";
			else if (bodyFatRatio <= 40)
				result = "��";
			else
				result = "����";
			break;
		}
		return result;
	}

	// ���
	static void printResult(double leanBodyMass, double leanBodyRatio, double bodyFatMass, double bodyFatRatio,
			String result) {
		System.out.println("��� > ");
		System.out.printf("�����淮 : %.1f\n", leanBodyMass);
		System.out.printf("������� : %.1f\n", leanBodyRatio);
		System.out.printf("ü���淮 : %.1f\n", bodyFatMass);
		System.out.printf("ü����� : %.1f\n", bodyFatRatio);
		System.out.println("��� : " + result);
	}

	// ��� ���� Ȯ��
	static void isRun() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����ұ��?(yes/no)");
		String yesNo = scanner.next();
		if (yesNo.equalsIgnoreCase("no"))
			run = !run;
	}

}
