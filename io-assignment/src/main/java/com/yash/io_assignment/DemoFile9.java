package com.yash.io_assignment;

import java.io.*;

class User implements Serializable {

	private static final long serialVersionUID = 6392038198767444555L;
	
	private int id;
	private String name;
	private double salary;
	private String desg;
	private int DOJ;

	public User(int id, String name,double salary,String desg,int DOJ ) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desg = desg;
		this.DOJ = DOJ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public int getDOJ() {
		return DOJ;
	}

	public void setDOJ(int dOJ) {
		DOJ = dOJ;
	}
	
public static class QuestionTen {

	public static void main(String[] args) 
	{

		try {

			FileOutputStream fos = new FileOutputStream("user.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			User user = new User(1, "Andrew", 34000, "trainee", 12-02-2020 );
			
			oos.writeObject(user);

			oos.flush();
			oos.close();
			user = null;
			FileInputStream fis = new FileInputStream("user.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			user = (User) ois.readObject();
			System.out.println("User Id : " + user.getId());
			System.out.println("User Name : " + user.getName());
			System.out.println("Salary : " + user.getSalary());
			System.out.println("Designation : " + user.getDesg());
			System.out.println("Date Of Joining : " + user.getDOJ());

			// closing the critical resources
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
}