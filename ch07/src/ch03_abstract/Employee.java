package ch03_abstract;

//*���޻��,�˹ٻ�� �޿� ���*/
public abstract class Employee{//�߻�Ŭ���� - �޿���� �԰� ����
 private String name;
    int sal;//�޿�
 private final float INCENTIVE_RATE = 0.1f;//
 
 public Employee(String name) {this.name = name;} 
 //�޼ҵ�
 abstract int computePay();
 
 //final �޼ҵ� -������ �Ұ�
final int computeIncentive() {
	 int pay=computePay();
	 int bonus=0;
	 if(pay>10000) {
		 bonus =(int)(pay*INCENTIVE_RATE);//�޿����
	 }
	 return bonus;
 }
 void print() {
	 System.out.println("======================");
	 System.out.println("�̸�: "+name);
	 System.out.println("�޿�: "+sal);
	 System.out.println("���ʽ�: "+computeIncentive());
 }
}
