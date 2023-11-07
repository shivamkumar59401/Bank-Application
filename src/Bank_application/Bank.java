package Bank_application;

import java.util.Scanner;

public class Bank {
	Scanner sc=new Scanner(System.in);
	private String bankName;
	private String ifscCode;
	private double balance;
	private String customerName;
	private long ac;
	
	public Bank(String bankName,String ifscCode,double balance,String customerName,long ac) {
		this.bankName=bankName;
		this.ifscCode=ifscCode;
		this.balance=balance;
		this.customerName=customerName;
		this.ac=ac;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getAc() {
		return ac;
	}

	public void setAc(long ac) {
		this.ac = ac;
	}
	public boolean isVerify(int pin) {
		int databasepin=12345;
		if(pin==databasepin) {
			return true;
		}
		return false;
		
	}
	public void withdraw() {
		System.out.println("enter your pin");
		int pin=sc.nextInt();
		if(isVerify(pin)) {
			//withdraw
			System.out.println("enter the amount:  ");
			int amt=sc.nextInt();
			if(this.balance-amt>0) {
				System.out.println("Rs. "+ amt+" is processing");
				System.out.println("collect your cash");
				this.balance=this.balance-amt;
				System.out.println("press 1 if you wantbalance reciept");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.println("*********"+this.bankName+"***********");
					System.out.println("customer name: "+this.customerName);
					System.out.println("IFSC CODE: "+this.ifscCode);
					System.out.println("balance "+this.balance);
					
				}
				else {
					System.out.println("thankyou for banking .....");
					System.out.println("collect your card.........");
				}
			}
			else {
				System.out.println("insuficient balance........");
			}
		}
	}

}
