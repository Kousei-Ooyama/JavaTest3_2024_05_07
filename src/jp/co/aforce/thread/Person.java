package jp.co.aforce.thread;

public class Person extends Thread{
	private BankAccount account;
	private int cash;
	
	public Person(BankAccount m, int c) {
		this.account = m;
		this.cash = c;
	}
	
	public void run() {
		System.out.println("現金が"+cash+"なので銀行に行きます");
		
		cash += account.getMoney(cash);
		System.out.println("現金が"+cash+"円になりました");
	}

}
