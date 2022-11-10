package main.com.twitter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import main.com.twitter.entity.Log;
import main.com.twitter.entity.Tweet;
import main.com.twitter.entity.User;

public class TwitterDao {

	public static boolean addUser(User user) {

		try {
			Connection con = ConnectionProvider.CreateCon();
			String query = "INSERT INTO `twitterapp`.`user` ( `uname`, `upass`, `uemail`) VALUES (?,?,?);";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, user.getUname());
			pstmt.setString(2, user.getUpass());
			pstmt.setString(3, user.getUemail());
			pstmt.execute();
			return true;

		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public static ResultSet verifyUser(User user) {

		try {
			Connection con = ConnectionProvider.CreateCon();
			String query = "SELECT * FROM twitterapp.user WHERE uname=? and upass=?;";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, user.getUname());
			pstmt.setString(2, user.getUpass());
			ResultSet stucents = pstmt.executeQuery();

			return stucents;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public static boolean updatePass(User user) {

		try {
			Connection con = ConnectionProvider.CreateCon();
			String query = "UPDATE `twitterapp`.`user` SET `upass` = ? WHERE (`uid` = ?);";
			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setString(1, user.getUpass());
			pstmt.setLong(2, user.getUid());
			pstmt.execute();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public static boolean logout(Log log) {

		try {
			Connection con = ConnectionProvider.CreateCon();
			String query = "INSERT INTO `twitterapp`.`userlog` (`unmae`, `login`, `logout`) VALUES (?,?,?);";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, log.getUname());
			pstmt.setString(2, log.getLogin().toString());
			pstmt.setString(3, log.getLogout().toString());
			pstmt.execute();
			return true;

		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public static boolean tweet(Tweet t) {

		try {
			Connection con = ConnectionProvider.CreateCon();
			String query = "INSERT INTO `twitterapp`.`twitte` (`uname`, `msg`) VALUES (?,?);";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, t.getUname());
			pstmt.setString(2, t.getMsg());
			pstmt.execute();
			return true;

		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public static ResultSet mytweet(String name) {

		try {
			Connection con = ConnectionProvider.CreateCon();
			String query = "SELECT * FROM twitterapp.twitte where uname=?;";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			ResultSet posts = pstmt.executeQuery();

			return posts;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}

	public static ResultSet alltweet() {

		try {
			Connection con = ConnectionProvider.CreateCon();
			String query = "SELECT * FROM twitterapp.twitte ;";
			PreparedStatement pstmt = con.prepareStatement(query);

			ResultSet posts = pstmt.executeQuery();

			return posts;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}

	public static ResultSet allUsers() {

		try {
			Connection con = ConnectionProvider.CreateCon();
			String query = "SELECT * FROM twitterapp.user;";
			PreparedStatement pstmt = con.prepareStatement(query);

			ResultSet users = pstmt.executeQuery();

			return users;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}
}
