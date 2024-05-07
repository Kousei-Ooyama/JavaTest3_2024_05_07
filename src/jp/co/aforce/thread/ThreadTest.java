package jp.co.aforce.thread;

public class ThreadTest {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(3000);
		Person husband = new Person(account, -2000);
		Person wife = new Person(account, -2000);
		husband.start();
		wife.start();
	}
}
