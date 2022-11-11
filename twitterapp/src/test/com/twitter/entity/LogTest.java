package test.com.twitter.entity;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import main.com.twitter.entity.Log;

class LogTest {
	Log log=new Log();

	@Test
	public void objectTest() {
		String name = "A";
		LocalDateTime login = LocalDateTime.now();
		LocalDateTime logout = LocalDateTime.now();
		log = new Log("A", login, logout);
		assertEquals(log.getUname(), name);
		assertEquals(log.getLogin(), login);
		assertEquals(log.getLogout(), logout);
	}

	@Test
	public void getterSetterTest0() {

		log.setLid(0);

		assertEquals(log.getLid(), 0);

	}

	@Test
	public void getterSetterTest1() {
		String name = "A";

		log.setUname(name);

		assertEquals(log.getUname(), name);

	}

	@Test
	public void getterSetterTest2() {

		LocalDateTime login = LocalDateTime.now();
		;
		log.setLogin(login);

		assertEquals(log.getLogin(), login);

	}

	@Test
	public void getterSetterTest3() {

		LocalDateTime logout = LocalDateTime.now();

		log.setLogout(logout);

		assertEquals(log.getLogout(), logout);
	}
}
