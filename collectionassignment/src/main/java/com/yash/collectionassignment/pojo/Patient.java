package com.yash.collectionassignment.pojo;
/**
 * Creating a class to set data of patient
 * @author madhav.machiwal
 *
 */
public class Patient 
{
	public long patientId;
	public String patientName;
	public int patientAge;
	
	public Patient(long patientId, String patientName, int patientAge)
	{
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge + "]";
	}
	
	
}
