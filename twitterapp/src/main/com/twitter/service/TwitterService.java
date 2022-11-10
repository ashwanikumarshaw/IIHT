package main.com.twitter.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import main.com.twitter.dao.TwitterDao;
import main.com.twitter.entity.Log;
import main.com.twitter.entity.Tweet;
import main.com.twitter.entity.User;
import main.com.twitter.util.EncodeDecode;

public class TwitterService {

	public static boolean register(String uname, String upass, String uemail) {

		upass = EncodeDecode.encode(upass);
		User user = new User(uname, upass, uemail);

		return TwitterDao.addUser(user);

	}

	public static boolean resetPass(String uname, String oldpass, String newpass) throws SQLException {

		oldpass = EncodeDecode.encode(oldpass);
		User user = new User(uname, oldpass);
		ResultSet u1 = TwitterDao.verifyUser(user);
		while (u1.next()) {
			user.setUid(u1.getInt("uid"));
		}
		newpass = EncodeDecode.encode(newpass);
		user.setUpass(newpass);
		return TwitterDao.updatePass(user);

	}

	public static boolean login(String uname, String upass) throws SQLException {

		upass = EncodeDecode.encode(upass);
		User user = new User(uname, upass);
		ResultSet u1 = TwitterDao.verifyUser(user);
		int count=0;
		while (u1.next()) {
			System.out.println("User id: "+u1.getInt("uid"));
			count++;
		}
		if (count > 0)
			return true;
		return false;

	}

	public static boolean logout(String uname,LocalDateTime login,LocalDateTime logout)  {
		Log log=new Log(uname, login, logout);
		return TwitterDao.logout(log);
	}

	public static boolean post(String name, String msg) {
		Tweet t=new Tweet(name, msg);
		return TwitterDao.tweet(t);
	}

	public static boolean myPost(String name) throws SQLException {
		ResultSet post = TwitterDao.mytweet(name);
		int count=0;
		while (post.next()) {
			count++;
			System.out.println("-------------------------------------");
			System.out.println("tweet "+count+" : "+post.getString("msg"));
			
		}
		if (count > 0)
			return true;
		return false;
	}

	public static boolean allPost() throws SQLException {
		ResultSet post = TwitterDao.alltweet();
		int count=0;
		while (post.next()) {
			count++;
			System.out.println("-------------------------------------");
			System.out.println("tweet :"+post.getString("msg"));
			System.out.println("by - "+post.getString("uname"));
			
		}
		if (count > 0)
			return true;
		return false;
	}

	public static boolean allUser() throws SQLException {
		ResultSet user = TwitterDao.allUsers();
		int count=0;
		
		while (user.next()) {
			count++;
			System.out.println("-------------------------------------");
			
			System.out.println(user.getString("uname"));
			
		}
		if (count > 0)
			return true;
		return false;
	}
}
