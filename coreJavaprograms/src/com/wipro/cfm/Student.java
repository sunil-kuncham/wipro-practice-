package com.wipro.cfm;

public class Student implements Comparable<Student> {
	
	private Integer stid;
	private String stname;
	
	public Student(Integer stid, String stname) {
		
		this.stid = stid;
		this.stname = stname;
	}
	
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return this.getStname().compareTo(((Student) o).getStname());
		return this.getStid().compareTo(((Student) o).getStid());
		
	}

	
	

}

