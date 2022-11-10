package main.com.twitter.entity;

public class Tweet {
	private Integer tid;
	private String uname;
	private String msg;
	public Tweet(String uname, String msg) {
		super();
		this.uname = uname;
		this.msg = msg;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
