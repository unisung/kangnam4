package ch04;

import java.util.Objects;

public class Customer {
	private int custid;
	private String name;
	private String addres;
	private String phone;
	
	public Customer(int custid, String name, String addres, String phone) {
		this.custid = custid;
		this.name = name;
		this.addres = addres;
		this.phone = phone;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return custid;
	}

	@Override
	public boolean equals(Object obj) {
		return custid == ((Customer)obj).custid;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", addres=" + addres + ", phone=" + phone + "]";
	}
	
	
	

}
