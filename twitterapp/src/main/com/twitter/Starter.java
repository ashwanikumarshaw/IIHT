package main.com.twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.time.LocalDateTime;

import main.com.twitter.service.TwitterService;

public class Starter {
	public static LocalDateTime login, logout;

	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("App running...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("press 1 to register");
			System.out.println("press 2 to login");
			System.out.println("press 3 to reset password");
			System.out.println("press 4 to exit the app");
			int choice = Integer.parseInt(br.readLine());
			System.out.println("-------------------------------------");
			if (choice == 1) {
				// register
				System.out.println("Username: ");
				String name = br.readLine();
				System.out.println("Email:");
				String email = br.readLine();
				System.out.println("Password:");
				String pass = br.readLine();

				if (TwitterService.register(name, pass, email)) {
					System.out.println("Registered Sucessfully");
				} else
					System.out.println("Something went wrong");

			} else if (choice == 2) {
				// login
				System.out.println("Username: ");
				String name = br.readLine();
				System.out.println("Password:");
				String pass = br.readLine();
				if (TwitterService.login(name, pass)) {
					login = LocalDateTime.now();
					loginMenu(name);
				} else
					System.out.println("Wrong Id or Password");

			} else if (choice == 3) {
				// password reset
				System.out.println("Username: ");
				String name = br.readLine();
				System.out.println("Old Password:");
				String oldpass = br.readLine();
				System.out.println("New Password:");
				String newpass = br.readLine();

				if (TwitterService.resetPass(name, oldpass, newpass)) {
					System.out.println("Reset Sucessfully");
				} else
					System.out.println("Something went wrong");

			} else if (choice == 4) {
				// exit
				break;
			} else {
				System.out.println("----------- wrong choice ----------");
			}

		}
		System.out.println("Thanks for using Twitter App");
	}

	private static void loginMenu(String name) throws IOException, SQLException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("press 1 to post");
			System.out.println("press 2 to view my post");
			System.out.println("press 3 to view all post");
			System.out.println("press 4 to view all user");
			System.out.println("press 5 to reset password");
			System.out.println("press 6 to logout");
			int choice = Integer.parseInt(br.readLine());
			System.out.println("-------------------------------------");
			if (choice == 1) {
				// post
				System.out.println("Tweet:");
				String msg = br.readLine();
				if (TwitterService.post(name, msg)) {
					System.out.println("Posted...");
				} else
					System.out.println("Something went wrong");

			} else if (choice == 2) {
				// view my post
				if (TwitterService.myPost(name)) {
					System.out.println("-------------------------------------");
				} else
					System.out.println("No post found");

			} else if (choice == 3) {
				// view all post
				if (TwitterService.allPost()) {
					System.out.println("-------------------------------------");
				} else
					System.out.println("No post found");

			} else if (choice == 4) {
				// view all users
				if (TwitterService.allUser()) {
					System.out.println("-------------------------------------");
				} else
					System.out.println("No User Found");

			} else if (choice == 5) {
				// reset password
				System.out.println("Old Password:");
				String oldpass = br.readLine();
				System.out.println("New Password:");
				String newpass = br.readLine();

				if (TwitterService.resetPass(name, oldpass, newpass)) {
					System.out.println("Reset Sucessfully");
				} else
					System.out.println("Something went wrong");

			} else if (choice == 6) {
				// logout
				logout = LocalDateTime.now();
				if (TwitterService.logout(name, login, logout)) {
					name = "";
					break;
				} else
					System.out.println("Something went wrong");
			} else {
				System.out.println("----------- wrong choice ----------");
			}
		}
		System.out.println("----------- Logged Out ----------");
	}

}
