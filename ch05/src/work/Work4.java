package work;

import java.util.Scanner;

/* ü���� ���ϱ� */
public class Work4 {
	static Scanner scanner = new Scanner(System.in);	
	static String gender;
	static int age;
	static double weight,height;
	static final double maleSTD = 1.10, femaleSTD=1.07;
	static final int COMSTD=128, COMSTD2=100;
	static boolean run=true;
	static double leanBodyMass;
	static double bodyFatMass;
	static double bodyFatRatio;
	static double leanBodyRatio;
public static void main(String[] args) {
	/*
	 * 1. ������ ���ϱ� : ���� 1.10*ü�� - (128*(ü��^2)/(Ű^2))
	 *                 ���� 1.07*ü�� - (128*(ü��^2)/(Ű^2))
	 * 2. ü���淮 = ü�� - �����淮
	 * 2-1. �������� = �����淮*100/ü��
	 * 3. ü������ = ü���淮 * 100/ü��                
	 * */	  
while(run){	
	  String gender; int age;double height,weight;
	  //static void printMenu(){}
	  	printMenu();
	  //static void inputInfo(){}
	  	inputInfo();
	  
	  //1.�����淮 ���ϱ�-�޼ҵ� static leanBodyMass=getLeanBodyMass(String gender){}
	 // double leanBodyMass=0.0;
	  leanBodyMass=getLeanBodyMass();
	  System.out.println("�����淮:"+leanBodyMass);
	  //2.ü���淮���ϱ�(=ü�� - �����淮)
	  // bodyFatMass=getBodyFatMass(){}
	 // double bodyFatMass=0.0;
	  bodyFatMass=getBodyFatMass();
	  
	  //2-1. �������(=�����淮*100/ü��)
	  // leanBodyRation =  static getLeanBodyRatio(){}
      leanBodyRatio = getLeanBodyRatio();
	  
	  //3.ü����� ���ϱ�(=ü���淮*100/ü��)
	  // bodyFatRatio= static getBodyFatRatio(){}
	  bodyFatRatio = getBodyFatRatio();
	  
	  //4. �񸸵� ���
	  //��/�� 
	  String result="";// result = static  getResult(){}
	  result = getResult();

	  //��¸޼ҵ�  static  void printResult(){}
      printResult();
	  //��� ���� Ȯ��  static void isRun(){}
	 	isRun();
      }//while��.

     System.out.println("���α׷� ����");
	}//main()��,
	
	static void printMenu(){
		  System.out.println("=====================================");
		  System.out.println(" ��Ȯ�� ����� ���Ͽ� �Ʒ� ������ �Է� �ٶ��ϴ�");
		  System.out.println("=====================================");
	  }
	
	static void inputInfo() {
		  System.out.println("����(����(M)/����(F)�Է�)>");
		   gender = scanner.next();
		  System.out.println("����(����:10~39 �Է�)>");
		  age = scanner.nextInt();
		  System.out.println("Ű �Է�(����:cm)>");
		   height = scanner.nextDouble();
		  System.out.println("������ �Է�(����:kg)>");
		   weight = scanner.nextDouble();
		  }
	
  static double getLeanBodyMass() {
	  double leanBodyMass=0.0;
		switch(gender) {
		  case "M":leanBodyMass=(maleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
		  case "F":leanBodyMass=(femaleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
		  }
		System.out.println(leanBodyMass);
	return leanBodyMass;
	}
  
  static double getBodyFatMass() {
	  return weight - leanBodyMass;
  }
  
  static double getLeanBodyRatio(){
		 return (leanBodyMass*COMSTD2)/(double)weight;
	  }
  
  static double getBodyFatRatio(){
	  return (bodyFatMass*COMSTD2)/(double)weight;
  }
  
  static String getResult(){
		String result="";
	  switch(gender) {
	  case "M": if(bodyFatRatio <12) result="���� ��"; // 0~12�̸�
	  			else if(bodyFatRatio <=17) result="ǥ��"; //12~17
	  			else if(bodyFatRatio <=22) result="��ü��";//18~22
	  			else if(bodyFatRatio <=27) result="��"; //22~27
	  			else result="����";// >=28
	            break;
	  case "F":if(bodyFatRatio <22) result="���� ��"; // 0~22�̸�
				else if(bodyFatRatio <=27) result="ǥ��"; //22~27
				else if(bodyFatRatio <=35) result="��ü��";//28~35
				else if(bodyFatRatio <=40) result="��"; //36~40
				else result="����";// >=40
		        break;
	  }
	  return result;
	}
  
  static void printResult() {
	  System.out.println("���:>");
	  System.out.printf("�����淮:%.2f\n", leanBodyMass);
	  System.out.printf("��������:%.2f\n", leanBodyRatio);
	  System.out.printf("ü���淮:%.2f\n", bodyFatMass);
	  System.out.printf("ü������:%.2f\n", bodyFatRatio);
	  System.out.println("���:"+getResult());
    }
 
  static void isRun() {
		 System.out.println("����ұ��?(yes/no)");
		  String yesNo = scanner.nextLine();
		  if(yesNo.equals("no")) run=!run;
	 }
}
