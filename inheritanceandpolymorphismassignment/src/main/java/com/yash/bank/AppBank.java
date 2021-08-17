package com.yash.bank;

public class AppBank 
{
	public static void main(String[] args) 
	{
		Sbi s = new Sbi();
		Hdfc h = new Hdfc();
		Kotak k = new Kotak();
		
		System.out.println("Deposited Money in SBI:"+s.getBalance());
		System.out.println("Deposited Money in HDFC:"+h.getBalance());
		System.out.println("Deposited Money in KOTAK:"+k.getBalance());

	}

}
