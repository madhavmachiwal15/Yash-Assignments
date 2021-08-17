package com.yash.oopsassignment1;
/**
 * Creating a class to showing students details
 * @author Madhav Machiwal
 *
 */
public class Hostel 
{
	private int student_id;
	private String student_name;
	private String student_class;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_class() {
		return student_class;
	}
	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}
	
	@Override
	public String toString() {
		return "Hostel [student_id=" + student_id + ", student_name=" + student_name + ", student_class="
				+ student_class + "]";
	}
	
	public static void main(String args[])
	{
		Hostel h = new Hostel();
		h.setStudent_id(1001);
		h.setStudent_name("Madhav Machiwal");
		h.setStudent_class("12th");
		
		h.getStudent_id();
		h.getStudent_name();
		h.getStudent_class();
		
		System.out.println(h.toString());
	}	
}
