package assignment;



public class Students  {
	private int stid;
	private String stname;
	private char stgrade;
	
	public Students(int stid, String stname,char stgrade) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.stgrade=stgrade;
		
	}
	public char getStgrade() {
		return stgrade;
	}
	public void setStgrade(char stgrade) {
		this.stgrade = stgrade;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
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
		

}


