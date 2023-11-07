package Bank_application;

import java.util.Scanner;

public class Pnb {
	
	private static String bankname;
	private String name;
	private String ifsc;
	private int accountno;
	private int age;
	static{
		bankname="PRABHU NARAYAN BANK";
		System.out.println("WELCOME TO "+bankname);
	}
	public void features() {
		System.out.println("welcome to our banking system");
		System.out.println("our bank is very trusted");
		System.out.println("Employees of our bank is so humble");	
	}
	public void setter(String name,String ifsc,int accountno,int age) {
		this.name=name;
		this.ifsc=ifsc;
		this.accountno=accountno;
		this.age=age;	
	}
	public String getter() {
		setter("shivam","SBINOOO8740",355278,19);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("bank name= "+this.bankname);
		System.out.println("name= "+this.name);
		System.out.println("ifsc= "+this.ifsc);
		System.out.println("account no=  "+this.accountno);
		System.out.println("age= "+this.age);
		System.out.println("account balance= 36984 INR");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("THANK YOU FOR USING ME");
		return "";
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Pnb s=new Pnb();
	System.out.println("enter your userid");
	int userid=sc.nextInt();
	System.out.println("enter your password");
	int password=sc.nextInt();
	System.out.println("enter your account number ");
	int account_number=sc.nextInt();
	if(userid==0000&&password==0000&&account_number==355278) {
		System.out.println(s.getter());
	}
	else {
		System.out.println("you entered wrong credential");
	}
	}
}
