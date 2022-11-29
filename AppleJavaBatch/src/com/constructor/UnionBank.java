package com.constructor;

public class UnionBank {

	String name;
	int accno;
	static String ifsccode = "542DS";
	static String bankname = "Union Bank";

	UnionBank(int id, String name, int accno) {

		this.name = name;
		this.accno = accno;
	}

	void show() {
		System.out.println("Name :" + name + "\nAccount number :" + accno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnionBank u = new UnionBank(101, "Aatif", 12345);
		System.out.println(UnionBank.ifsccode);
		System.out.println(UnionBank.bankname);
		u.show();

	}

}
