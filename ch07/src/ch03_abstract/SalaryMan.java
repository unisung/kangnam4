package ch03_abstract;

public class SalaryMan extends Employee {
    //�ʵ�
	private int annualSal;//����
	public SalaryMan(String name,int annualSal) {
		super(name);
		this.annualSal=annualSal;
	}
	@Override
	int computePay() {
		sal = annualSal/12;
		return sal;
	}
	
	

}
