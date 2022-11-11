package main.com.twitter.entity;

public class User {
	private Integer uid;
	private String uname;
	private String upass;
	private String uemail;
	
	public User(String uname, String upass, String uemail) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.uemail = uemail;
	}
	
	public User(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", uemail=" + uemail + "]";
	}
	

}
