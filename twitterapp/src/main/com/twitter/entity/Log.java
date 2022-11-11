package main.com.twitter.entity;

import java.time.LocalDateTime;

public class Log {
	private Integer lid;
	private String uname;
	private LocalDateTime login;
	private LocalDateTime logout;

	public Log(String uname, LocalDateTime login, LocalDateTime logout) {
		super();
		this.uname = uname;
		this.login = login;
		this.logout = logout;
	}

	public Log() {
		super();
	}

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public LocalDateTime getLogin() {
		return login;
	}

	public void setLogin(LocalDateTime login) {
		this.login = login;
	}

	public LocalDateTime getLogout() {
		return logout;
	}

	public void setLogout(LocalDateTime logout) {
		this.logout = logout;
	}
}
