import java.io.IOException;

public class account {
    private String userId;
	private String userName;
	private String password;
	private double balance;

    public String generateId() {
		final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String s="";
		for(int i=0;i<4;i++) {
			int num=(int)(Math.random()*62);
			char ch=AB.charAt(num);
			s+=ch;
		}
		return  s;
	}
    public String getPassword() {
		return password;
	}
	public account(String userName,String password,double balance) {
		this.userId=generateId();
		this.userName=userName;
		this.password=password;
		this.balance=balance;//For sign-up
	}
	public account(String userId,String password) {
		this.userId=userId;
		this.userName="";
		this.password=password;
		this.balance=0;//For login
	}
	public account(String userId,String userName,String password,double balance) {
		this.userId=userId;
		this.userName=userName;
		this.password=password;
		this.balance=balance;
	}
	public account(String userId){
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
	}
	public String getUserName() {
		return this.userName;
	}
	public double getBalance() {
		return this.balance;
	}

}
