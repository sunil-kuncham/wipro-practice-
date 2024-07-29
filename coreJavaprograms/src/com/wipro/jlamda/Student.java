package com.wipro.jlamda;

public class Student {
	
		
		private Integer stid;
		private String stname;
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
		public Student(int stid, String stname) {
			super();
			this.stid = stid;
			this.stname = stname;
		}
		@Override
		public String toString() {
			return stid + " " + stname;
		}
		
		

	}



