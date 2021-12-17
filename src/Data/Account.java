package Data;

import java.io.IOException;
import org.json.JSONException;


public class Account {
	private String userName;
	private String password;
	private String dobDate,dobMonth,dobYear;
	private String contact;
	private String email;
	private double balance;

	public Account(String userName, String password, String dobDate, String dobMonth, String dobYear, String contact, String email, double balance) {
		this.userName = userName;
		this.password = password;
		this.dobDate = dobDate;
		this.dobMonth = dobMonth;
		this.dobYear = dobYear;
		this.contact = contact;
		this.email = email;
		this.balance = balance;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDobDate() {
		return dobDate;
	}

	public void setDobDate(String dobDate) {
		this.dobDate = dobDate;
	}

	public String getDobMonth() {
		return dobMonth;
	}

	public void setDobMonth(String dobMonth) {
		this.dobMonth = dobMonth;
	}

	public String getDobYear() {
		return dobYear;
	}

	public void setDobYear(String dobYear) {
		this.dobYear = dobYear;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
  }

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
